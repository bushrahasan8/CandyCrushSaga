package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: UByteArray.class */
public final class UByteArray implements Collection, KMappedMarker {
    private final byte[] storage;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: UByteArray$Iterator.class */
    public static final class Iterator implements java.util.Iterator, KMappedMarker {
        private final byte[] array;
        private int index;

        public Iterator(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return UByte.m7140boximpl(m7161nextw2LRezQ());
        }

        /* renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m7161nextw2LRezQ() {
            int i = this.index;
            byte[] bArr = this.array;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UByte.m7141constructorimpl(bArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UByteArray(byte[] bArr) {
        this.storage = bArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByteArray m7146boximpl(byte[] bArr) {
        return new UByteArray(bArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m7147constructorimpl(int i) {
        return m7148constructorimpl(new byte[i]);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m7148constructorimpl(byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m7149contains7apg3OU(byte[] bArr, byte b) {
        return ArraysKt.contains(bArr, b);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7150containsAllimpl(byte[] bArr, Collection elements) {
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
                if (!(next instanceof UByte)) {
                    break;
                }
            } while (ArraysKt.contains(bArr, ((UByte) next).m7145unboximpl()));
            z = false;
        }
        return z;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7151equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.areEqual(bArr, ((UByteArray) obj).m7160unboximpl());
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m7152getw2LRezQ(byte[] bArr, int i) {
        return UByte.m7141constructorimpl(bArr[i]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7153getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7154hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7155isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator m7156iteratorimpl(byte[] bArr) {
        return new Iterator(bArr);
    }

    /* renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m7157setVurrAj0(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7158toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (obj instanceof UByte) {
            return m7159contains7apg3OU(((UByte) obj).m7145unboximpl());
        }
        return false;
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m7159contains7apg3OU(byte b) {
        return m7149contains7apg3OU(this.storage, b);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m7150containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7151equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7153getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7154hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7155isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return m7156iteratorimpl(this.storage);
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
        return m7158toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m7160unboximpl() {
        return this.storage;
    }
}
