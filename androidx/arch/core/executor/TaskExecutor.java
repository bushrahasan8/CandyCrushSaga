package androidx.arch.core.executor;

/* loaded from: TaskExecutor.class */
public abstract class TaskExecutor {
    public abstract void executeOnDiskIO(Runnable runnable);

    public void executeOnMainThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            postToMainThread(runnable);
        }
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(Runnable runnable);
}
