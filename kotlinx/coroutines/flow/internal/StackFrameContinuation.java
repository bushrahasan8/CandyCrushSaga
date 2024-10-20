package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: StackFrameContinuation.class */
final class StackFrameContinuation implements Continuation, CoroutineStackFrame {
    private final CoroutineContext context;
    private final Continuation uCont;

    public StackFrameContinuation(Continuation continuation, CoroutineContext coroutineContext) {
        this.uCont = continuation;
        this.context = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.uCont;
        return continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
