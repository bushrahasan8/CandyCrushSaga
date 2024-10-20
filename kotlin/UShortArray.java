package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: UShortArray.class */
public final class UShortArray implements Collection, KMappedMarker {
    private final short[] storage;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: UShortArray$Iterator.class */
    public static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final short[] array;
        private int index;

        public Iterator(short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return UShort.m7210boximpl(m7231nextMh2AYeg());
        }

        /* renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m7231nextMh2AYeg() {
            int i = this.index;
            short[] sArr = this.array;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UShort.m7211constructorimpl(sArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UShortArray(short[] sArr) {
        this.storage = sArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShortArray m7216boximpl(short[] sArr) {
        return new UShortArray(sArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m7217constructorimpl(int i) {
        return m7218constructorimpl(new short[i]);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m7218constructorimpl(short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m7219containsxj2QHRw(short[] sArr, short s) {
        return ArraysKt.contains(sArr, s);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7220containsAllimpl(short[] sArr, Collection elements) {
        boolean z;
        Object next;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator it = collection.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                if (!(next instanceof UShort)) {
                    break;
                }
            } while (ArraysKt.contains(sArr, ((UShort) next).m7215unboximpl()));
            z = false;
        }
        return z;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7221equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.areEqual(sArr, ((UShortArray) obj).m7230unboximpl());
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m7222getMh2AYeg(short[] sArr, int i) {
        return UShort.m7211constructorimpl(sArr[i]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7223getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7224hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7225isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m7226iteratorimpl(short[] sArr) {
        return new Iterator(sArr);
    }

    /* renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m7227set01HTLdE(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7228toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m7229containsxj2QHRw(((UShort) obj).m7215unboximpl());
        }
        return false;
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m7229containsxj2QHRw(short s) {
        return m7219containsxj2QHRw(this.storage, s);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m7220containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7221equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7223getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7224hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7225isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m7226iteratorimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    public String toString() {
        return m7228toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m7230unboximpl() {
        return this.storage;
    }
}
