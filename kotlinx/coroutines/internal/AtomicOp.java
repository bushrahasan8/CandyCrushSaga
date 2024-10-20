package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: AtomicOp.class */
public abstract class AtomicOp extends OpDescriptor {
    private static final AtomicReferenceFieldUpdater _consensus$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    private volatile Object _consensus = AtomicKt.NO_DECISION;

    private final Object decide(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$FU;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AtomicKt.NO_DECISION;
        return obj2 != obj3 ? obj2 : AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract void complete(Object obj, Object obj2);

    @Override // kotlinx.coroutines.internal.OpDescriptor
    public final Object perform(Object obj) {
        Object obj2 = _consensus$FU.get(this);
        Object obj3 = obj2;
        if (obj2 == AtomicKt.NO_DECISION) {
            obj3 = decide(prepare(obj));
        }
        complete(obj, obj3);
        return obj3;
    }

    public abstract Object prepare(Object obj);
}
