package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: ComparableTimeMark.class */
public interface ComparableTimeMark extends TimeMark, Comparable {

    /* loaded from: ComparableTimeMark$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static int compareTo(ComparableTimeMark comparableTimeMark, ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m7298compareToLRDsOJo(comparableTimeMark.mo7293minusUwyO8pc(other), Duration.Companion.m7327getZEROUwyO8pc());
        }
    }

    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    long mo7293minusUwyO8pc(ComparableTimeMark comparableTimeMark);
}
