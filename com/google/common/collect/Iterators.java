package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: Iterators.class */
public abstract class Iterators {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: Iterators$ArrayItr.class */
    public static final class ArrayItr extends AbstractIndexedListIterator {
        static final UnmodifiableListIterator EMPTY = new ArrayItr(new Object[0], 0, 0, 0);
        private final Object[] array;
        private final int offset;

        ArrayItr(Object[] objArr, int i, int i2, int i3) {
            super(i2, i3);
            this.array = objArr;
            this.offset = i;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected Object get(int i) {
            return this.array[this.offset + i];
        }
    }

    /* loaded from: Iterators$EmptyModifiableIterator.class */
    private enum EmptyModifiableIterator implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(false);
        }
    }

    public static boolean addAll(Collection collection, Iterator it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            z = z2 | collection.add(it.next());
        }
    }

    public static boolean any(Iterator it, Predicate predicate) {
        return indexOf(it, predicate) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListIterator cast(Iterator it) {
        return (ListIterator) it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void clear(Iterator it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r3.hasNext() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r4.equals(r3.next()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0001, code lost:
    
        if (r4 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.hasNext() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r3.next() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean contains(java.util.Iterator r3, java.lang.Object r4) {
        /*
            r0 = r4
            if (r0 != 0) goto L18
        L4:
            r0 = r3
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            r0 = r3
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L4
            r0 = 1
            return r0
        L18:
            r0 = r3
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            r0 = r4
            r1 = r3
            java.lang.Object r1 = r1.next()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L30:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Iterators.contains(java.util.Iterator, java.lang.Object):boolean");
    }

    public static boolean elementsEqual(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UnmodifiableIterator emptyIterator() {
        return emptyListIterator();
    }

    static UnmodifiableListIterator emptyListIterator() {
        return ArrayItr.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Iterator emptyModifiableIterator() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static UnmodifiableIterator filter(Iterator it, Predicate predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator(it, predicate) { // from class: com.google.common.collect.Iterators.5
            final Predicate val$retainIfTrue;
            final Iterator val$unfiltered;

            {
                this.val$unfiltered = it;
                this.val$retainIfTrue = predicate;
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Object computeNext() {
                while (this.val$unfiltered.hasNext()) {
                    Object next = this.val$unfiltered.next();
                    if (this.val$retainIfTrue.apply(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        };
    }

    public static Object find(Iterator it, Predicate predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object getLast(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object getNext(Iterator it, Object obj) {
        if (it.hasNext()) {
            obj = it.next();
        }
        return obj;
    }

    public static Object getOnlyElement(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static int indexOf(Iterator it, Predicate predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object pollNext(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean removeAll(Iterator it, Collection collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean removeIf(Iterator it, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static UnmodifiableIterator singletonIterator(Object obj) {
        return new UnmodifiableIterator(obj) { // from class: com.google.common.collect.Iterators.9
            boolean done;
            final Object val$value;

            {
                this.val$value = obj;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.done;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.done) {
                    throw new NoSuchElementException();
                }
                this.done = true;
                return this.val$value;
            }
        };
    }
}
