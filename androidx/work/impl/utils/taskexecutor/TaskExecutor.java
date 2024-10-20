package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

/* loaded from: TaskExecutor.class */
public interface TaskExecutor {

    /* loaded from: TaskExecutor$_CC.class */
    public abstract /* synthetic */ class _CC {
    }

    void executeOnTaskThread(Runnable runnable);

    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();
}
