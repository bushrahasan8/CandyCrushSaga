package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function2;

/* loaded from: ConcurrentLinkedListKt.class */
public abstract class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");

    public static final ConcurrentLinkedListNode close(ConcurrentLinkedListNode concurrentLinkedListNode) {
        while (true) {
            Object nextOrClosed = concurrentLinkedListNode.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return concurrentLinkedListNode;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode2 != null) {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            } else if (concurrentLinkedListNode.markAsClosed()) {
                return concurrentLinkedListNode;
            }
        }
    }

    public static final Object findSegmentInternal(Segment segment, long j, Function2 function2) {
        Segment segment2 = segment;
        while (true) {
            if (segment2.id >= j && !segment2.isRemoved()) {
                return SegmentOrClosed.m7457constructorimpl(segment2);
            }
            Object nextOrClosed = segment2.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m7457constructorimpl(CLOSED);
            }
            Segment segment3 = (Segment) ((ConcurrentLinkedListNode) nextOrClosed);
            if (segment3 == null) {
                Segment segment4 = (Segment) function2.invoke(Long.valueOf(segment2.id + 1), segment2);
                if (segment2.trySetNext(segment4)) {
                    segment3 = segment4;
                    if (segment2.isRemoved()) {
                        segment2.remove();
                        segment3 = segment4;
                    }
                }
            }
            segment2 = segment3;
        }
    }
}
