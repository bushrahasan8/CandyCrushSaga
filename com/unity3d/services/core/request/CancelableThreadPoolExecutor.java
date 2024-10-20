package com.unity3d.services.core.request;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: CancelableThreadPoolExecutor.class */
public class CancelableThreadPoolExecutor extends ThreadPoolExecutor {
    private final List<Runnable> _activeRunnable;

    public CancelableThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        super(i, i2, j, timeUnit, linkedBlockingQueue);
        this._activeRunnable = new LinkedList();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        synchronized (this) {
            super.afterExecute(runnable, th);
            this._activeRunnable.remove(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        synchronized (this) {
            super.beforeExecute(thread, runnable);
            this._activeRunnable.add(runnable);
        }
    }

    public void cancel() {
        synchronized (this) {
            for (Runnable runnable : this._activeRunnable) {
                if (runnable instanceof WebRequestRunnable) {
                    ((WebRequestRunnable) runnable).setCancelStatus(true);
                }
            }
        }
    }
}
