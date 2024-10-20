package com.king.amp.sa;

import android.os.Handler;
import android.os.Looper;

/* loaded from: AdRunnable.class */
public abstract class AdRunnable implements Runnable {
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private String mLoggingSource;

    public AdRunnable(String str) {
        this.mLoggingSource = str;
    }

    public void postOnMainThread() {
        this.mHandler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            wrappedCode();
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th) {
            try {
                Logging.logBreadcrumb(this.mLoggingSource, th.toString());
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    notifyAll();
                    throw th2;
                }
            }
        }
    }

    public abstract void wrappedCode();
}
