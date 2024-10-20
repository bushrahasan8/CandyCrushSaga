package com.king.core;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
/* loaded from: AppNotRespondingTest.class */
class AppNotRespondingTest {
    private static final String TAG = "com.king.core.AppNotRespondingTest";
    private final AtomicBoolean mBusy = new AtomicBoolean(false);
    private final Activity mUiThread;

    public AppNotRespondingTest(Activity activity) {
        this.mUiThread = activity;
    }

    private Runnable getTimedBusyRunnable(final int i) {
        return new Runnable(i) { // from class: com.king.core.AppNotRespondingTest$$ExternalSyntheticLambda1
            public final int f$0;

            {
                this.f$0 = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppNotRespondingTest.lambda$getTimedBusyRunnable$3(this.f$0);
            }
        };
    }

    private Runnable getTimedDeadlockRunnable(final int i) {
        return new Runnable(i) { // from class: com.king.core.AppNotRespondingTest$$ExternalSyntheticLambda2
            public final int f$0;

            {
                this.f$0 = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppNotRespondingTest.lambda$getTimedDeadlockRunnable$2(this.f$0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getTimedBusyRunnable$3(int i) {
        do {
        } while (System.currentTimeMillis() - System.currentTimeMillis() <= i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getTimedDeadlockRunnable$1(int i, CountDownLatch countDownLatch) {
        do {
        } while (System.currentTimeMillis() - System.currentTimeMillis() <= i);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getTimedDeadlockRunnable$2(final int i) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable(i, countDownLatch) { // from class: com.king.core.AppNotRespondingTest$$ExternalSyntheticLambda0
            public final int f$0;
            public final CountDownLatch f$1;

            {
                this.f$0 = i;
                this.f$1 = countDownLatch;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppNotRespondingTest.lambda$getTimedDeadlockRunnable$1(this.f$0, this.f$1);
            }
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Log.w(TAG, "Test case error", e);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$guard$0(Runnable runnable) {
        this.mBusy.set(true);
        runnable.run();
        this.mBusy.set(false);
    }

    public void busyLoop(int i) {
        if (this.mBusy.get()) {
            return;
        }
        this.mUiThread.runOnUiThread(guard(getTimedBusyRunnable(i)));
    }

    public void deadlock(int i) {
        if (this.mBusy.get()) {
            return;
        }
        this.mUiThread.runOnUiThread(guard(getTimedDeadlockRunnable(i)));
    }

    public Runnable guard(final Runnable runnable) {
        return new Runnable(this, runnable) { // from class: com.king.core.AppNotRespondingTest$$ExternalSyntheticLambda3
            public final AppNotRespondingTest f$0;
            public final Runnable f$1;

            {
                this.f$0 = this;
                this.f$1 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$guard$0(this.f$1);
            }
        };
    }

    public boolean isBusy() {
        return this.mBusy.get();
    }
}
