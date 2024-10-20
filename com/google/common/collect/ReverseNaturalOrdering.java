package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

/* loaded from: ReverseNaturalOrdering.class */
final class ReverseNaturalOrdering extends Ordering implements Serializable {
    static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();

    private ReverseNaturalOrdering() {
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    public Ordering reverse() {
        return Ordering.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
