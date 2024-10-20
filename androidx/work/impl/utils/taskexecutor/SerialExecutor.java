package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

/* loaded from: SerialExecutor.class */
public interface SerialExecutor extends Executor {
    boolean hasPendingTasks();
}
