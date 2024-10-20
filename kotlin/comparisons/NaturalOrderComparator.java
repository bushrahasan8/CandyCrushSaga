package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: NaturalOrderComparator.class */
final class NaturalOrderComparator implements Comparator {
    public static final NaturalOrderComparator INSTANCE = new NaturalOrderComparator();

    private NaturalOrderComparator() {
    }

    @Override // java.util.Comparator
    public int compare(Comparable a, Comparable b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return ReverseOrderComparator.INSTANCE;
    }
}
