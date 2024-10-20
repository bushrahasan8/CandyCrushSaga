package kotlin.time;

import kotlin.time.TimeSource$Monotonic;

/* loaded from: MonotonicTimeSource.class */
public final class MonotonicTimeSource {
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    /* renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m7332differenceBetweenfRLX17w(long j, long j2) {
        return LongSaturatedMathKt.saturatingOriginsDiff(j, j2);
    }

    /* renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m7333elapsedFrom6eNON_k(long j) {
        return LongSaturatedMathKt.saturatingDiff(read(), j);
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m7334markNowz9LOYto() {
        return TimeSource$Monotonic.ValueTimeMark.m7339constructorimpl(read());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
