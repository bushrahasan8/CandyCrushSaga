package androidx.work.impl.utils;

import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: SerialExecutorImpl.class */
public class SerialExecutorImpl implements SerialExecutor {
    private Runnable mActive;
    private final Executor mExecutor;
    private final ArrayDeque mTasks = new ArrayDeque();
    final Object mLock = new Object();

    /* loaded from: SerialExecutorImpl$Task.class */
    static class Task implements Runnable {
        final Runnable mRunnable;
        final SerialExecutorImpl mSerialExecutor;

        Task(SerialExecutorImpl serialExecutorImpl, Runnable runnable) {
            this.mSerialExecutor = serialExecutorImpl;
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mRunnable.run();
                synchronized (this.mSerialExecutor.mLock) {
                    this.mSerialExecutor.scheduleNext();
                }
            } catch (Throwable th) {
                synchronized (this.mSerialExecutor.mLock) {
                    this.mSerialExecutor.scheduleNext();
                    throw th;
                }
            }
        }
    }

    public SerialExecutorImpl(Executor executor) {
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.mLock) {
            this.mTasks.add(new Task(this, runnable));
            if (this.mActive == null) {
                scheduleNext();
            }
        }
    }

    @Override // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean hasPendingTasks() {
        boolean isEmpty;
        synchronized (this.mLock) {
            isEmpty = this.mTasks.isEmpty();
        }
        return !isEmpty;
    }

    void scheduleNext() {
        Runnable runnable = (Runnable) this.mTasks.poll();
        this.mActive = runnable;
        if (runnable != null) {
            this.mExecutor.execute(runnable);
        }
    }
}
