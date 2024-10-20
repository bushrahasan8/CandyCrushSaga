package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: Delay.class */
public interface Delay {

    /* loaded from: Delay$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static DisposableHandle invokeOnTimeout(Delay delay, long j, Runnable runnable, CoroutineContext coroutineContext) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j, runnable, coroutineContext);
        }
    }

    DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext);

    void scheduleResumeAfterDelay(long j, CancellableContinuation cancellableContinuation);
}
