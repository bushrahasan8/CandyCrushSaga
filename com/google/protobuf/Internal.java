package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: Internal.class */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final Charset US_ASCII = Charset.forName("US-ASCII");
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* loaded from: Internal$BooleanList.class */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Boolean> mutableCopyWithCapacity(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* synthetic */ ProtobufList<Boolean> mutableCopyWithCapacity2(int i);

        boolean setBoolean(int i, boolean z);
    }

    /* loaded from: Internal$DoubleList.class */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d);

        double getDouble(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Double> mutableCopyWithCapacity(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* synthetic */ ProtobufList<Double> mutableCopyWithCapacity2(int i);

        double setDouble(int i, double d);
    }

    /* loaded from: Internal$EnumLite.class */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: Internal$EnumLiteMap.class */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    /* loaded from: Internal$EnumVerifier.class */
    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    /* loaded from: Internal$FloatList.class */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f);

        float getFloat(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Float> mutableCopyWithCapacity(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* synthetic */ ProtobufList<Float> mutableCopyWithCapacity2(int i);

        float setFloat(int i, float f);
    }

    /* loaded from: Internal$IntList.class */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i);

        int getInt(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Integer> mutableCopyWithCapacity(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* synthetic */ ProtobufList<Integer> mutableCopyWithCapacity2(int i);

        int setInt(int i, int i2);
    }

    /* loaded from: Internal$ListAdapter.class */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        /* loaded from: Internal$ListAdapter$Converter.class */
        public interface Converter<F, T> {
            T convert(F f);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
            this.fromList = list;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.converter.convert(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* loaded from: Internal$LongList.class */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long j);

        long getLong(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.Internal.ProtobufList
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Long> mutableCopyWithCapacity(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* synthetic */ ProtobufList<Long> mutableCopyWithCapacity2(int i);

        long setLong(int i, long j);
    }

    /* loaded from: Internal$MapAdapter.class */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        /* loaded from: Internal$MapAdapter$Converter.class */
        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: Internal$MapAdapter$EntryAdapter.class */
        public class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;
            final MapAdapter this$0;

            public EntryAdapter(MapAdapter mapAdapter, Map.Entry<K, RealValue> entry) {
                this.this$0 = mapAdapter;
                this.realEntry = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                boolean z = true;
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (!getKey().equals(((Map.Entry) obj).getKey()) || !getValue().equals(getValue())) {
                    z = false;
                }
                return z;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) this.this$0.valueConverter.doForward(this.realEntry.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v) {
                Object value = this.realEntry.setValue(this.this$0.valueConverter.doBackward(v));
                if (value == null) {
                    return null;
                }
                return (V) this.this$0.valueConverter.doForward(value);
            }
        }

        /* loaded from: Internal$MapAdapter$IteratorAdapter.class */
        private class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;
            final MapAdapter this$0;

            public IteratorAdapter(MapAdapter mapAdapter, Iterator<Map.Entry<K, RealValue>> it) {
                this.this$0 = mapAdapter;
                this.realIterator = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.this$0, this.realIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }
        }

        /* loaded from: Internal$MapAdapter$SetAdapter.class */
        private class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;
            final MapAdapter this$0;

            public SetAdapter(MapAdapter mapAdapter, Set<Map.Entry<K, RealValue>> set) {
                this.this$0 = mapAdapter;
                this.realSet = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.this$0, this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.realMap = map;
            this.valueConverter = converter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(EnumLiteMap<T> enumLiteMap, T t) {
            return (Converter<Integer, T>) new Converter<Integer, T>(enumLiteMap, t) { // from class: com.google.protobuf.Internal.MapAdapter.1
                final EnumLiteMap val$enumMap;
                final EnumLite val$unrecognizedValue;

                {
                    this.val$enumMap = enumLiteMap;
                    this.val$unrecognizedValue = t;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
                @Override // com.google.protobuf.Internal.MapAdapter.Converter
                public Integer doBackward(EnumLite enumLite) {
                    return Integer.valueOf(enumLite.getNumber());
                }

                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
                @Override // com.google.protobuf.Internal.MapAdapter.Converter
                public EnumLite doForward(Integer num) {
                    EnumLite findValueByNumber = this.val$enumMap.findValueByNumber(num.intValue());
                    EnumLite enumLite = findValueByNumber;
                    if (findValueByNumber == null) {
                        enumLite = this.val$unrecognizedValue;
                    }
                    return enumLite;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this, this.realMap.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.realMap.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            Object put = this.realMap.put(k, this.valueConverter.doBackward(v));
            if (put == null) {
                return null;
            }
            return (V) this.valueConverter.doForward(put);
        }
    }

    /* loaded from: Internal$ProtobufList.class */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(ISO_8859_1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return ((ByteBuffer) byteBuffer.duplicate().clear()).equals((ByteBuffer) byteBuffer2.duplicate().clear());
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!equalsByteBuffer(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + cls, e);
        }
    }

    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int i = 1;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = (i2 * 31) + hashCode(it.next());
        }
    }

    public static int hashCode(byte[] bArr) {
        return hashCode(bArr, 0, bArr.length);
    }

    static int hashCode(byte[] bArr, int i, int i2) {
        int partialHash = partialHash(i2, bArr, i, i2);
        int i3 = partialHash;
        if (partialHash == 0) {
            i3 = 1;
        }
        return i3;
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        int i;
        int i2 = 1;
        if (byteBuffer.hasArray()) {
            int partialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (partialHash != 0) {
                i2 = partialHash;
            }
            return i2;
        }
        int i3 = 4096;
        if (byteBuffer.capacity() <= 4096) {
            i3 = byteBuffer.capacity();
        }
        byte[] bArr = new byte[i3];
        ByteBuffer duplicate = byteBuffer.duplicate();
        int capacity = byteBuffer.capacity();
        while (true) {
            i = capacity;
            if (duplicate.remaining() <= 0) {
                break;
            }
            int remaining = duplicate.remaining() <= i3 ? duplicate.remaining() : i3;
            duplicate.get(bArr, 0, remaining);
            capacity = partialHash(i, bArr, 0, remaining);
        }
        return i == 0 ? 1 : i;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int i = 1;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = (i2 * 31) + hashCodeByteBuffer(it.next());
        }
    }

    public static int hashEnum(EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        Iterator<? extends EnumLite> it = list.iterator();
        int i = 1;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = (i2 * 31) + hashEnum(it.next());
        }
    }

    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return Utf8.isValidUtf8(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object mergeMessage(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialHash(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, UTF_8);
    }
}
