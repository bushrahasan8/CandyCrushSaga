package com.vungle.ads.internal.executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: VungleThreadPoolExecutor.class */
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor {
    public VungleThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        try {
            super.execute(command);
        } catch (OutOfMemoryError e) {
        }
    }

    public final void execute(Runnable command, Runnable runnable) {
        Intrinsics.checkNotNullParameter(command, "command");
        try {
            super.execute(command);
        } catch (OutOfMemoryError e) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        Future<?> futureResult;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            futureResult = super.submit(task);
            Intrinsics.checkNotNullExpressionValue(futureResult, "{\n            super.submit(task)\n        }");
        } catch (OutOfMemoryError e) {
            futureResult = new FutureResult(null);
        }
        return futureResult;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T t) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<T> submit = super.submit(task, (Runnable) t);
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.submit(task, result)\n        }");
            return submit;
        } catch (OutOfMemoryError e) {
            return new FutureResult(null);
        }
    }

    public final Future<?> submit(Runnable task, Runnable runnable) {
        Future<?> futureResult;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            futureResult = super.submit(task);
            Intrinsics.checkNotNullExpressionValue(futureResult, "{\n            super.submit(task)\n        }");
        } catch (OutOfMemoryError e) {
            if (runnable != null) {
                runnable.run();
            }
            futureResult = new FutureResult(null);
        }
        return futureResult;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<T> submit = super.submit(task);
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.submit(task)\n        }");
            return submit;
        } catch (OutOfMemoryError e) {
            return new FutureResult(null);
        }
    }
}
