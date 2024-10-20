package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: SegmentOrClosed.class */
public abstract class SegmentOrClosed {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m7457constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final Segment m7458getSegmentimpl(Object obj) {
        if (obj == ConcurrentLinkedListKt.CLOSED) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (Segment) obj;
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m7459isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }
}
