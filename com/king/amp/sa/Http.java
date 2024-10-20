package com.king.amp.sa;

import android.util.Log;
import androidx.annotation.Keep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

@Keep
/* loaded from: Http.class */
public class Http implements HttpGetHandler, HttpPostHandler, IHttpDownloadHandler {
    public static final int CONNECTION_TIMEOUT = 5000;
    public static final int READ_TIMEOUT = 5000;
    private static final String TAG = "AbmHttp";
    private DownloadChunkExecutor mChunksDownloader;
    private ExecutorService mExecutor;
    private final AtomicLong mHttpInstance;

    public Http(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.mHttpInstance = atomicLong;
        this.mExecutor = null;
        atomicLong.set(j);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.mExecutor = newCachedThreadPool;
        this.mChunksDownloader = new DownloadChunkExecutor(newCachedThreadPool, this);
    }

    public static native void onGetCallback(long j, String str, int i, byte[] bArr);

    public static native void onHttpDownloadCompleted(long j, String str);

    public static native void onHttpDownloadFailed(long j, String str, int i, String str2);

    public static native void onPostCallback(long j, String str, int i, String str2);

    public void get(String str, String str2, int i) {
        if (this.mExecutor != null) {
            this.mExecutor.execute(new HttpGetRunnable(str, str2, this, i));
        }
    }

    @Override // com.king.amp.sa.HttpGetHandler
    public void onGetRequestCompleted(String str, int i, byte[] bArr) {
        onGetCallback(this.mHttpInstance.get(), str, i, bArr);
    }

    @Override // com.king.amp.sa.IHttpDownloadHandler
    public void onHttpDownloadCompleted(String str) {
        onHttpDownloadCompleted(this.mHttpInstance.get(), str);
    }

    @Override // com.king.amp.sa.IHttpDownloadHandler
    public void onHttpDownloadFailed(String str, int i, String str2) {
        onHttpDownloadFailed(this.mHttpInstance.get(), str, i, str2);
    }

    @Override // com.king.amp.sa.HttpPostHandler
    public void onPostRequestCompleted(String str, int i, String str2) {
        onPostCallback(this.mHttpInstance.get(), str, i, str2);
    }

    public void performHttpRequest(String str, String str2, String str3, int i, int i2, int i3) {
        if (str3.isEmpty()) {
            Log.w(TAG, "Unable to perform download, output path is empty");
            onHttpDownloadFailed(str, 903, "Output filepath is empty");
        } else if (this.mExecutor == null) {
            Log.i(TAG, "Executor is invalid");
        } else {
            this.mExecutor.execute(new DownloadFileRunnable(str, str2, str3, i, i2, this, this.mChunksDownloader, i3));
        }
    }

    public void post(String str, String str2, String str3, String str4, int i) {
        if (this.mExecutor != null) {
            this.mExecutor.execute(new HttpPostRunnable(str, str2, str3, str4, this, i));
        }
    }

    public void resetHttpInstance() {
        this.mHttpInstance.set(0L);
        this.mChunksDownloader.uninit();
        this.mExecutor.shutdownNow();
        this.mExecutor = null;
    }
}
