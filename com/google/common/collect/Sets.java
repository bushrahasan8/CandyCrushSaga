package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: Sets.class */
public abstract class Sets {

    /* renamed from: com.google.common.collect.Sets$1, reason: invalid class name */
    /* loaded from: Sets$1.class */
    abstract class AnonymousClass1 extends SetView {
    }

    /* renamed from: com.google.common.collect.Sets$2, reason: invalid class name */
    /* loaded from: Sets$2.class */
    class AnonymousClass2 extends SetView {
        final Set val$set1;
        final Set val$set2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Set set, Set set2) {
            super(null);
            this.val$set1 = set;
            this.val$set2 = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.val$set1.contains(obj) && this.val$set2.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.val$set1.containsAll(collection) && this.val$set2.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.val$set2, this.val$set1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator iterator() {
            return new AbstractIterator(this) { // from class: com.google.common.collect.Sets.2.1
                final Iterator itr;
                final AnonymousClass2 this$0;

                {
                    this.this$0 = this;
                    this.itr = this.val$set1.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                protected Object computeNext() {
                    while (this.itr.hasNext()) {
                        Object next = this.itr.next();
                        if (this.this$0.val$set2.contains(next)) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.val$set1.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.val$set2.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: Sets$FilteredSet.class */
    public static class FilteredSet extends Collections2.FilteredCollection implements Set {
        FilteredSet(Set set, Predicate predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: Sets$FilteredSortedSet.class */
    public static class FilteredSortedSet extends FilteredSet implements SortedSet {
        FilteredSortedSet(SortedSet sortedSet, Predicate predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.unfiltered).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return Iterators.find(this.unfiltered.iterator(), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).headSet(obj), this.predicate);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSet = (SortedSet) this.unfiltered;
            while (true) {
                SortedSet sortedSet2 = sortedSet;
                Object last = sortedSet2.last();
                if (this.predicate.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet2.headSet(last);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).subSet(obj, obj2), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).tailSet(obj), this.predicate);
        }
    }

    /* loaded from: Sets$ImprovedAbstractSet.class */
    static abstract class ImprovedAbstractSet extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return Sets.removeAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* loaded from: Sets$SetView.class */
    public static abstract class SetView extends AbstractSet {
        private SetView() {
        }

        /* synthetic */ SetView(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r3.containsAll(r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean equalsImpl(java.util.Set r3, java.lang.Object r4) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L37
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r4 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L39
            r1 = r4
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            if (r0 != r1) goto L33
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L39
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            r5 = r0
        L35:
            r0 = r5
            return r0
        L37:
            r0 = 0
            return r0
        L39:
            r3 = move-exception
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Sets.equalsImpl(java.util.Set, java.lang.Object):boolean");
    }

    public static Set filter(Set set, Predicate predicate) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, predicate);
        }
        if (!(set instanceof FilteredSet)) {
            return new FilteredSet((Set) Preconditions.checkNotNull(set), (Predicate) Preconditions.checkNotNull(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) set;
        return new FilteredSet((Set) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet filter(SortedSet sortedSet, Predicate predicate) {
        if (!(sortedSet instanceof FilteredSet)) {
            return new FilteredSortedSet((SortedSet) Preconditions.checkNotNull(sortedSet), (Predicate) Preconditions.checkNotNull(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) sortedSet;
        return new FilteredSortedSet((SortedSet) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int hashCodeImpl(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Object next = it.next();
            i = ((i2 + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
    }

    public static SetView intersection(Set set, Set set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new AnonymousClass2(set, set2);
    }

    public static HashSet newHashSet() {
        return new HashSet();
    }

    public static HashSet newHashSetWithExpectedSize(int i) {
        return new HashSet(Maps.capacity(i));
    }

    public static Set newIdentityHashSet() {
        return Collections.newSetFromMap(Maps.newIdentityHashMap());
    }

    static boolean removeAllImpl(Set set, Collection collection) {
        Preconditions.checkNotNull(collection);
        Collection collection2 = collection;
        if (collection instanceof Multiset) {
            collection2 = ((Multiset) collection).elementSet();
        }
        return (!(collection2 instanceof Set) || collection2.size() <= set.size()) ? removeAllImpl(set, collection2.iterator()) : Iterators.removeAll(set.iterator(), collection2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean removeAllImpl(Set set, Iterator it) {
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            z = z2 | set.remove(it.next());
        }
    }
}
