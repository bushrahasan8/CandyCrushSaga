package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ConcurrentLinkedListNode.class */
public abstract class ConcurrentLinkedListNode {
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public ConcurrentLinkedListNode(ConcurrentLinkedListNode concurrentLinkedListNode) {
        this._prev = concurrentLinkedListNode;
    }

    private final ConcurrentLinkedListNode getAliveSegmentLeft() {
        ConcurrentLinkedListNode concurrentLinkedListNode;
        ConcurrentLinkedListNode prev = getPrev();
        while (true) {
            concurrentLinkedListNode = prev;
            if (concurrentLinkedListNode == null || !concurrentLinkedListNode.isRemoved()) {
                break;
            }
            prev = (ConcurrentLinkedListNode) _prev$FU.get(concurrentLinkedListNode);
        }
        return concurrentLinkedListNode;
    }

    private final ConcurrentLinkedListNode getAliveSegmentRight() {
        ConcurrentLinkedListNode next;
        ConcurrentLinkedListNode next2 = getNext();
        Intrinsics.checkNotNull(next2);
        while (next2.isRemoved() && (next = next2.getNext()) != null) {
            next2 = next;
        }
        return next2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getNextOrClosed() {
        return _next$FU.get(this);
    }

    public final void cleanPrev() {
        _prev$FU.lazySet(this, null);
    }

    public final ConcurrentLinkedListNode getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == ConcurrentLinkedListKt.access$getCLOSED$p()) {
            return null;
        }
        return (ConcurrentLinkedListNode) nextOrClosed;
    }

    public final ConcurrentLinkedListNode getPrev() {
        return (ConcurrentLinkedListNode) _prev$FU.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        return AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(_next$FU, this, (Object) null, ConcurrentLinkedListKt.access$getCLOSED$p());
    }

    public final void remove() {
        Object obj;
        if (isTail()) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode aliveSegmentLeft = getAliveSegmentLeft();
            ConcurrentLinkedListNode aliveSegmentRight = getAliveSegmentRight();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            do {
                obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
            } while (!AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, aliveSegmentRight, obj, ((ConcurrentLinkedListNode) obj) == null ? null : aliveSegmentLeft));
            if (aliveSegmentLeft != null) {
                _next$FU.set(aliveSegmentLeft, aliveSegmentRight);
            }
            if (!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(ConcurrentLinkedListNode concurrentLinkedListNode) {
        return AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(_next$FU, this, (Object) null, concurrentLinkedListNode);
    }
}
