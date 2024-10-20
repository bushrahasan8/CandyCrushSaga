package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: DispatcherExecutor.class */
final class DispatcherExecutor implements Executor {
    public final CoroutineDispatcher dispatcher;

    public DispatcherExecutor(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext)) {
            this.dispatcher.dispatch(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.dispatcher.toString();
    }
}
