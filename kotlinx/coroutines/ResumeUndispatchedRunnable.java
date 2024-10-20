package kotlinx.coroutines;

import kotlin.Unit;

/* loaded from: ResumeUndispatchedRunnable.class */
final class ResumeUndispatchedRunnable implements Runnable {
    private final CancellableContinuation continuation;
    private final CoroutineDispatcher dispatcher;

    public ResumeUndispatchedRunnable(CoroutineDispatcher coroutineDispatcher, CancellableContinuation cancellableContinuation) {
        this.dispatcher = coroutineDispatcher;
        this.continuation = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.resumeUndispatched(this.dispatcher, Unit.INSTANCE);
    }
}
