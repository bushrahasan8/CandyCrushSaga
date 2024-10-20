package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: SortedIterables.class */
abstract class SortedIterables {
    public static Comparator comparator(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        Comparator comparator2 = comparator;
        if (comparator == null) {
            comparator2 = Ordering.natural();
        }
        return comparator2;
    }

    public static boolean hasSameComparator(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else {
            if (!(iterable instanceof SortedIterable)) {
                return false;
            }
            comparator2 = ((SortedIterable) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
