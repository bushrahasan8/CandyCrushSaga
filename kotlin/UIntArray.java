package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: UIntArray.class */
public final class UIntArray implements Collection, KMappedMarker {
    private final int[] storage;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: UIntArray$Iterator.class */
    public static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final int[] array;
        private int index;

        public Iterator(int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return UInt.m7163boximpl(m7184nextpVg5ArA());
        }

        /* renamed from: next-pVg5ArA, reason: not valid java name */
        public int m7184nextpVg5ArA() {
            int i = this.index;
            int[] iArr = this.array;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UInt.m7164constructorimpl(iArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UIntArray(int[] iArr) {
        this.storage = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UIntArray m7169boximpl(int[] iArr) {
        return new UIntArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m7170constructorimpl(int i) {
        return m7171constructorimpl(new int[i]);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m7171constructorimpl(int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m7172containsWZ4Q5Ns(int[] iArr, int i) {
        return ArraysKt.contains(iArr, i);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7173containsAllimpl(int[] iArr, Collection elements) {
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
                if (!(next instanceof UInt)) {
                    break;
                }
            } while (ArraysKt.contains(iArr, ((UInt) next).m7168unboximpl()));
            z = false;
        }
        return z;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7174equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && Intrinsics.areEqual(iArr, ((UIntArray) obj).m7183unboximpl());
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m7175getpVg5ArA(int[] iArr, int i) {
        return UInt.m7164constructorimpl(iArr[i]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7176getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7177hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7178isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m7179iteratorimpl(int[] iArr) {
        return new Iterator(iArr);
    }

    /* renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m7180setVXSXFK8(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7181toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (obj instanceof UInt) {
            return m7182containsWZ4Q5Ns(((UInt) obj).m7168unboximpl());
        }
        return false;
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m7182containsWZ4Q5Ns(int i) {
        return m7172containsWZ4Q5Ns(this.storage, i);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m7173containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7174equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7176getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7177hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7178isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m7179iteratorimpl(this.storage);
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
        return m7181toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m7183unboximpl() {
        return this.storage;
    }
}
