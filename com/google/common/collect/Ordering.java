package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Comparator;

/* loaded from: Ordering.class */
public abstract class Ordering implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.common.collect.Ordering] */
    public static Ordering from(Comparator comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    public static Ordering natural() {
        return NaturalOrdering.INSTANCE;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public Ordering compound(Comparator comparator) {
        return new CompoundOrdering(this, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public ImmutableList immutableSortedCopy(Iterable iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ordering onKeys() {
        return onResultOf(Maps.keyFunction());
    }

    public Ordering onResultOf(Function function) {
        return new ByFunctionOrdering(function, this);
    }

    public Ordering reverse() {
        return new ReverseOrdering(this);
    }
}
