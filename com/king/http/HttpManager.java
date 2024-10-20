package com.king.http;

import androidx.annotation.Keep;
import com.king.http.HttpHeaders;
import com.king.http.HttpTask;
import com.king.usdk.logger.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Keep
/* loaded from: HttpManager.class */
public class HttpManager implements HttpTask.Listener {
    private final ExecutorService mExecutorService;
    private long mHttpState;
    private final Logger mLogger;
    private final Map<Long, Future<?>> mFutureMap = new ConcurrentHashMap();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final String mClassName = "[com.king.http.HttpManager] ";

    public HttpManager(long j, long j2, int i, boolean z) {
        this.mHttpState = j;
        this.mLogger = new Logger(j2, z);
        this.mExecutorService = i == 0 ? Executors.newCachedThreadPool() : Executors.newFixedThreadPool(i);
    }

    private native void on_data(long j, long j2, byte[] bArr, int i);

    private native void on_response(long j, long j2, int i, int i2, int i3, HttpHeaders.Header[] headerArr, int i4, String str, int i5, int i6);

    public void addHeader(HttpHeaders httpHeaders, String str, String str2) {
        httpHeaders.add(str, str2);
    }

    public void cancelTask(long j) {
        this.mLogger.i("[com.king.http.HttpManager] : Cancelling task with requestId: " + j);
        Future<?> remove = this.mFutureMap.remove(Long.valueOf(j));
        if (remove == null) {
            this.mLogger.i("[com.king.http.HttpManager] : Cancelling task failed because future does not exist.");
        } else {
            remove.cancel(true);
        }
    }

    public HttpHeaders createHeaders() {
        return new HttpHeaders();
    }

    public HttpTask createTask(long j, int i, String str, int i2, boolean z, HttpHeaders httpHeaders, byte[] bArr) {
        this.mLogger.i("[com.king.http.HttpManager] : I'm creating the task!");
        try {
            return new HttpTask(this.mLogger, j, this, i, str, i2, z, httpHeaders, bArr);
        } catch (Exception e) {
            this.mLogger.e("[com.king.http.HttpManager] " + e.toString());
            return null;
        }
    }

    public void executeTask(HttpTask httpTask) {
        this.mFutureMap.put(Long.valueOf(httpTask.getRequestId()), this.mExecutorService.submit(httpTask));
    }

    public void handleCompletedTask(long j) {
        this.mFutureMap.remove(Long.valueOf(j));
    }

    @Override // com.king.http.HttpTask.Listener
    public void onData(long j, byte[] bArr, int i) {
        this.lock.readLock().lock();
        try {
            long j2 = this.mHttpState;
            if (j2 != 0) {
                on_data(j2, j, bArr, i);
            }
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // com.king.http.HttpTask.Listener
    public void onResponse(long j, int i, int i2, int i3, HttpHeaders.Header[] headerArr, int i4, String str, int i5, int i6) {
        this.lock.readLock().lock();
        try {
            long j2 = this.mHttpState;
            if (j2 != 0) {
                on_response(j2, j, i, i2, i3, headerArr, i4, str, i5, i6);
            }
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void shutDown() {
        this.mLogger.i("[com.king.http.HttpManager] : Shutting down executor service");
        this.mExecutorService.shutdownNow();
        this.lock.writeLock().lock();
        try {
            this.mLogger.i("[com.king.http.HttpManager] : The HttpState is being invalidated. Value set to 0 (zero)");
            this.mHttpState = 0L;
            this.lock.writeLock().unlock();
            this.mLogger.shutdown();
            this.mFutureMap.clear();
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }
}
