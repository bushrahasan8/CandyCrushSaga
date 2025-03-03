package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: ThrowingCollector.class */
public final class ThrowingCollector implements FlowCollector {
    public final Throwable e;

    public ThrowingCollector(Throwable th) {
        this.e = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        throw this.e;
    }
}
