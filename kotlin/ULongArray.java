package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: ULongArray.class */
public final class ULongArray implements Collection, KMappedMarker {
    private final long[] storage;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ULongArray$Iterator.class */
    public static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final long[] array;
        private int index;

        public Iterator(long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return ULong.m7186boximpl(m7207nextsVKNKU());
        }

        /* renamed from: next-s-VKNKU, reason: not valid java name */
        public long m7207nextsVKNKU() {
            int i = this.index;
            long[] jArr = this.array;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return ULong.m7187constructorimpl(jArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ ULongArray(long[] jArr) {
        this.storage = jArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULongArray m7192boximpl(long[] jArr) {
        return new ULongArray(jArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m7193constructorimpl(int i) {
        return m7194constructorimpl(new long[i]);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m7194constructorimpl(long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m7195containsVKZWuLQ(long[] jArr, long j) {
        return ArraysKt.contains(jArr, j);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7196containsAllimpl(long[] jArr, Collection elements) {
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
                if (!(next instanceof ULong)) {
                    break;
                }
            } while (ArraysKt.contains(jArr, ((ULong) next).m7191unboximpl()));
            z = false;
        }
        return z;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7197equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.areEqual(jArr, ((ULongArray) obj).m7206unboximpl());
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m7198getsVKNKU(long[] jArr, int i) {
        return ULong.m7187constructorimpl(jArr[i]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7199getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7200hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7201isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m7202iteratorimpl(long[] jArr) {
        return new Iterator(jArr);
    }

    /* renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m7203setk8EXiF4(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7204toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (obj instanceof ULong) {
            return m7205containsVKZWuLQ(((ULong) obj).m7191unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m7205containsVKZWuLQ(long j) {
        return m7195containsVKZWuLQ(this.storage, j);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m7196containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7197equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7199getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7200hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7201isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m7202iteratorimpl(this.storage);
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
        return m7204toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long[] m7206unboximpl() {
        return this.storage;
    }
}
