package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: Executors.class */
public abstract class Executors {
    private static final Executor MAIN_THREAD_EXECUTOR = new Executor() { // from class: com.bumptech.glide.util.Executors.1
        private final Handler handler = new Handler(Looper.getMainLooper());

        AnonymousClass1() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.handler.post(runnable);
        }
    };
    private static final Executor DIRECT_EXECUTOR = new Executor() { // from class: com.bumptech.glide.util.Executors.2
        AnonymousClass2() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: com.bumptech.glide.util.Executors$1 */
    /* loaded from: Executors$1.class */
    class AnonymousClass1 implements Executor {
        private final Handler handler = new Handler(Looper.getMainLooper());

        AnonymousClass1() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.handler.post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.util.Executors$2 */
    /* loaded from: Executors$2.class */
    class AnonymousClass2 implements Executor {
        AnonymousClass2() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor directExecutor() {
        return DIRECT_EXECUTOR;
    }

    public static Executor mainThreadExecutor() {
        return MAIN_THREAD_EXECUTOR;
    }
}
