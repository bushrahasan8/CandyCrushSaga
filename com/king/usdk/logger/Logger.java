package com.king.usdk.logger;

import androidx.annotation.Keep;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Keep
/* loaded from: Logger.class */
public class Logger {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private boolean mEnabled;
    private long mLogState;

    public Logger(long j, boolean z) {
        this.mEnabled = z;
        this.mLogState = j;
    }

    private static String className() {
        String className = Thread.currentThread().getStackTrace()[3].getClassName();
        return className.substring(className.lastIndexOf(".") + 1) + "." + Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    private static int line() {
        return Thread.currentThread().getStackTrace()[3].getLineNumber();
    }

    public static native void logd(long j, long j2, String str, String str2);

    public static native void loge(long j, long j2, String str, String str2);

    public static native void logi(long j, long j2, String str, String str2);

    public static native void logw(long j, long j2, String str, String str2);

    public void d(String str) {
        if (this.mEnabled) {
            this.lock.readLock().lock();
            try {
                long j = this.mLogState;
                if (j != 0) {
                    logd(j, line(), className(), str);
                }
            } finally {
                this.lock.readLock().unlock();
            }
        }
    }

    public void e(String str) {
        if (this.mEnabled) {
            this.lock.readLock().lock();
            try {
                long j = this.mLogState;
                if (j != 0) {
                    loge(j, line(), className(), str);
                }
            } finally {
                this.lock.readLock().unlock();
            }
        }
    }

    public void i(String str) {
        if (this.mEnabled) {
            this.lock.readLock().lock();
            try {
                long j = this.mLogState;
                if (j != 0) {
                    logi(j, line(), className(), str);
                }
            } finally {
                this.lock.readLock().unlock();
            }
        }
    }

    public void shutdown() {
        i("The logger is being invalidated. Value set to 0 (zero)");
        this.lock.writeLock().lock();
        try {
            this.mLogState = 0L;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void w(String str) {
        if (this.mEnabled) {
            this.lock.readLock().lock();
            try {
                long j = this.mLogState;
                if (j != 0) {
                    logw(j, line(), className(), str);
                }
            } finally {
                this.lock.readLock().unlock();
            }
        }
    }
}
