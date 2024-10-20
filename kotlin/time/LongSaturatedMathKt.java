package kotlin.time;

import com.ironsource.t2;
import kotlin.time.Duration;

/* loaded from: LongSaturatedMathKt.class */
public abstract class LongSaturatedMathKt {
    public static final long saturatingDiff(long j, long j2) {
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? Duration.m7323unaryMinusUwyO8pc(DurationKt.toDuration(j2, DurationUnit.DAYS)) : saturatingFiniteDiff(j, j2);
    }

    private static final long saturatingFiniteDiff(long j, long j2) {
        long j3 = j - j2;
        if (((j3 ^ j) & ((j3 ^ j2) ^ (-1))) >= 0) {
            Duration.Companion companion = Duration.Companion;
            return DurationKt.toDuration(j3, DurationUnit.NANOSECONDS);
        }
        long j4 = t2.z;
        long j5 = j / j4;
        long j6 = j2 / j4;
        Duration.Companion companion2 = Duration.Companion;
        return Duration.m7318plusLRDsOJo(DurationKt.toDuration(j5 - j6, DurationUnit.MILLISECONDS), DurationKt.toDuration((j % j4) - (j2 % j4), DurationUnit.NANOSECONDS));
    }

    public static final long saturatingOriginsDiff(long j, long j2) {
        return ((j2 - 1) | 1) == Long.MAX_VALUE ? j == j2 ? Duration.Companion.m7327getZEROUwyO8pc() : Duration.m7323unaryMinusUwyO8pc(DurationKt.toDuration(j2, DurationUnit.DAYS)) : (1 | (j - 1)) == Long.MAX_VALUE ? DurationKt.toDuration(j, DurationUnit.DAYS) : saturatingFiniteDiff(j, j2);
    }
}
