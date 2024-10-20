package kotlin.time;

import androidx.privacysandbox.ads.adservices.topics.Topic$;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;

/* loaded from: TimeSource$Monotonic.class */
public final class TimeSource$Monotonic {
    public static final TimeSource$Monotonic INSTANCE = new TimeSource$Monotonic();

    /* loaded from: TimeSource$Monotonic$ValueTimeMark.class */
    public static final class ValueTimeMark implements ComparableTimeMark {
        private final long reading;

        private /* synthetic */ ValueTimeMark(long j) {
            this.reading = j;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ValueTimeMark m7338boximpl(long j) {
            return new ValueTimeMark(j);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m7339constructorimpl(long j) {
            return j;
        }

        /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public static long m7340elapsedNowUwyO8pc(long j) {
            return MonotonicTimeSource.INSTANCE.m7333elapsedFrom6eNON_k(j);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7341equalsimpl(long j, Object obj) {
            return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).m7346unboximpl();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7342hashCodeimpl(long j) {
            return Topic$.ExternalSyntheticBackport0.m(j);
        }

        /* renamed from: minus-6eNON_k, reason: not valid java name */
        public static final long m7343minus6eNON_k(long j, long j2) {
            return MonotonicTimeSource.INSTANCE.m7332differenceBetweenfRLX17w(j, j2);
        }

        /* renamed from: minus-UwyO8pc, reason: not valid java name */
        public static long m7344minusUwyO8pc(long j, ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof ValueTimeMark) {
                return m7343minus6eNON_k(j, ((ValueTimeMark) other).m7346unboximpl());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m7345toStringimpl(j)) + " and " + other);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7345toStringimpl(long j) {
            return "ValueTimeMark(reading=" + j + ')';
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo7335elapsedNowUwyO8pc() {
            return m7340elapsedNowUwyO8pc(this.reading);
        }

        public boolean equals(Object obj) {
            return m7341equalsimpl(this.reading, obj);
        }

        public int hashCode() {
            return m7342hashCodeimpl(this.reading);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo7293minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return m7344minusUwyO8pc(this.reading, other);
        }

        public String toString() {
            return m7345toStringimpl(this.reading);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m7346unboximpl() {
            return this.reading;
        }
    }

    private TimeSource$Monotonic() {
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m7337markNowz9LOYto() {
        return MonotonicTimeSource.INSTANCE.m7334markNowz9LOYto();
    }

    public String toString() {
        return MonotonicTimeSource.INSTANCE.toString();
    }
}
