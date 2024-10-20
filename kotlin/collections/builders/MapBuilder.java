package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: MapBuilder.class */
public final class MapBuilder implements Map, Serializable, KMutableMap {
    private static final Companion Companion = new Companion(null);
    private MapBuilderEntries entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private Object[] keysArray;
    private MapBuilderKeys keysView;
    private int length;
    private int maxProbeDistance;
    private int[] presenceArray;
    private int size;
    private Object[] valuesArray;
    private MapBuilderValues valuesView;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: MapBuilder$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeHashSize(int i) {
            return Integer.highestOneBit(RangesKt.coerceAtLeast(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeShift(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    /* loaded from: MapBuilder$EntriesItr.class */
    public static final class EntriesItr extends Itr implements Iterator, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(MapBuilder map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public EntryRef next() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            EntryRef entryRef = new EntryRef(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return entryRef;
        }

        public final void nextAppendString(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().keysArray[getLastIndex$kotlin_stdlib()];
            if (Intrinsics.areEqual(obj, getMap$kotlin_stdlib())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (Intrinsics.areEqual(obj2, getMap$kotlin_stdlib())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().keysArray[getLastIndex$kotlin_stdlib()];
            int i = 0;
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            initNext$kotlin_stdlib();
            return hashCode ^ i;
        }
    }

    /* loaded from: MapBuilder$EntryRef.class */
    public static final class EntryRef implements Map.Entry, KMappedMarker {
        private final int index;
        private final MapBuilder map;

        public EntryRef(MapBuilder map, int i) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean z;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.map.keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.map.valuesArray;
            Intrinsics.checkNotNull(objArr);
            return objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = this.map.allocateValuesArray();
            int i = this.index;
            Object obj2 = allocateValuesArray[i];
            allocateValuesArray[i] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* loaded from: MapBuilder$Itr.class */
    public static abstract class Itr {
        private int index;
        private int lastIndex;
        private final MapBuilder map;

        public Itr(MapBuilder map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            initNext$kotlin_stdlib();
        }

        public final int getIndex$kotlin_stdlib() {
            return this.index;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.lastIndex;
        }

        public final MapBuilder getMap$kotlin_stdlib() {
            return this.map;
        }

        public final boolean hasNext() {
            return this.index < this.map.length;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.index < this.map.length) {
                int[] iArr = this.map.presenceArray;
                int i = this.index;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.index = i + 1;
                }
            }
        }

        public final void remove() {
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.removeKeyAt(this.lastIndex);
            this.lastIndex = -1;
        }

        public final void setIndex$kotlin_stdlib(int i) {
            this.index = i;
        }

        public final void setLastIndex$kotlin_stdlib(int i) {
            this.lastIndex = i;
        }
    }

    /* loaded from: MapBuilder$KeysItr.class */
    public static final class KeysItr extends Itr implements Iterator, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeysItr(MapBuilder map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().keysArray[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    /* loaded from: MapBuilder$ValuesItr.class */
    public static final class ValuesItr extends Itr implements Iterator, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValuesItr(MapBuilder map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object[] objArr = getMap$kotlin_stdlib().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj = objArr[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(ListBuilderKt.arrayOfUninitializedElements(i), null, new int[i], new int[Companion.computeHashSize(i)], 2, 0);
    }

    private MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = objArr;
        this.valuesArray = objArr2;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = Companion.computeShift(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] allocateValuesArray() {
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            return objArr;
        }
        Object[] arrayOfUninitializedElements = ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.valuesArray = arrayOfUninitializedElements;
        return arrayOfUninitializedElements;
    }

    private final void compact() {
        int i;
        int i2;
        Object[] objArr = this.valuesArray;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i4;
            i2 = this.length;
            if (i3 >= i2) {
                break;
            }
            int i5 = i;
            if (this.presenceArray[i3] >= 0) {
                Object[] objArr2 = this.keysArray;
                objArr2[i] = objArr2[i3];
                if (objArr != null) {
                    objArr[i] = objArr[i3];
                }
                i5 = i + 1;
            }
            i3++;
            i4 = i5;
        }
        ListBuilderKt.resetRange(this.keysArray, i, i2);
        if (objArr != null) {
            ListBuilderKt.resetRange(objArr, i, this.length);
        }
        this.length = i;
    }

    private final boolean contentEquals(Map map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > getCapacity$kotlin_stdlib()) {
            int capacity$kotlin_stdlib = (getCapacity$kotlin_stdlib() * 3) / 2;
            if (i <= capacity$kotlin_stdlib) {
                i = capacity$kotlin_stdlib;
            }
            this.keysArray = ListBuilderKt.copyOfUninitializedElements(this.keysArray, i);
            Object[] objArr = this.valuesArray;
            this.valuesArray = objArr != null ? ListBuilderKt.copyOfUninitializedElements(objArr, i) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.presenceArray = copyOf;
            int computeHashSize = Companion.computeHashSize(i);
            if (computeHashSize > getHashSize()) {
                rehash(computeHashSize);
            }
        }
    }

    private final void ensureExtraCapacity(int i) {
        if (shouldCompact(i)) {
            rehash(getHashSize());
        } else {
            ensureCapacity(this.length + i);
        }
    }

    private final int findKey(Object obj) {
        int hash = hash(obj);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[hash];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.areEqual(this.keysArray[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findValue(Object obj) {
        int i = this.length;
        while (true) {
            int i2 = i - 1;
            if (i2 < 0) {
                return -1;
            }
            i = i2;
            if (this.presenceArray[i2] >= 0) {
                Object[] objArr = this.valuesArray;
                Intrinsics.checkNotNull(objArr);
                i = i2;
                if (Intrinsics.areEqual(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (putEntry((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    private final boolean putEntry(Map.Entry entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        Object[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        if (Intrinsics.areEqual(entry.getValue(), allocateValuesArray[i])) {
            return false;
        }
        allocateValuesArray[i] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i) {
        int hash = hash(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i + 1;
                this.presenceArray[i] = hash;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final void rehash(int i) {
        int i2;
        if (this.length > size()) {
            compact();
        }
        if (i != getHashSize()) {
            this.hashArray = new int[i];
            this.hashShift = Companion.computeShift(i);
            i2 = 0;
        } else {
            ArraysKt.fill(this.hashArray, 0, 0, getHashSize());
            i2 = 0;
        }
        while (i2 < this.length) {
            if (!putRehash(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2++;
        }
    }

    private final void removeHashAt(int i) {
        int i2;
        int i3;
        int coerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
        int i4 = 0;
        int i5 = i;
        do {
            i = i == 0 ? getHashSize() - 1 : i - 1;
            int i6 = i4 + 1;
            if (i6 > this.maxProbeDistance) {
                this.hashArray[i5] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i7 = iArr[i];
            if (i7 == 0) {
                iArr[i5] = 0;
                return;
            }
            if (i7 < 0) {
                iArr[i5] = -1;
            } else {
                int i8 = i7 - 1;
                i2 = i5;
                i4 = i6;
                if (((hash(this.keysArray[i8]) - i) & (getHashSize() - 1)) >= i6) {
                    this.hashArray[i5] = i7;
                    this.presenceArray[i8] = i5;
                }
                i3 = coerceAtMost - 1;
                i5 = i2;
                coerceAtMost = i3;
            }
            i2 = i;
            i4 = 0;
            i3 = coerceAtMost - 1;
            i5 = i2;
            coerceAtMost = i3;
        } while (i3 >= 0);
        this.hashArray[i2] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeKeyAt(int i) {
        ListBuilderKt.resetAt(this.keysArray, i);
        removeHashAt(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
    }

    private final boolean shouldCompact(int i) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i2 = this.length;
        int i3 = capacity$kotlin_stdlib - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= getCapacity$kotlin_stdlib() / 4;
    }

    public final int addKey$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(obj);
            int coerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[hash];
                if (i2 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = obj;
                        this.presenceArray[i3] = hash;
                        this.hashArray[hash] = i4;
                        this.size = size() + 1;
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                    ensureExtraCapacity(1);
                } else {
                    if (Intrinsics.areEqual(this.keysArray[i2 - 1], obj)) {
                        return -i2;
                    }
                    i++;
                    if (i > coerceAtMost) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    hash = hash == 0 ? getHashSize() - 1 : hash - 1;
                }
            }
        }
    }

    public final Map build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        return this;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        IntIterator it = new IntRange(0, this.length - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.presenceArray;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        ListBuilderKt.resetRange(this.keysArray, 0, this.length);
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            ListBuilderKt.resetRange(objArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj == null) {
                return false;
            }
            try {
                if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException e) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        Intrinsics.checkNotNull(objArr);
        return Intrinsics.areEqual(objArr[findKey], entry.getValue());
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    public final EntriesItr entriesIterator$kotlin_stdlib() {
        return new EntriesItr(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && contentEquals((Map) obj));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        Intrinsics.checkNotNull(objArr);
        return objArr[findKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set getEntries() {
        MapBuilderEntries mapBuilderEntries = this.entriesView;
        MapBuilderEntries mapBuilderEntries2 = mapBuilderEntries;
        if (mapBuilderEntries == null) {
            mapBuilderEntries2 = new MapBuilderEntries(this);
            this.entriesView = mapBuilderEntries2;
        }
        return mapBuilderEntries2;
    }

    public Set getKeys() {
        MapBuilderKeys mapBuilderKeys = this.keysView;
        MapBuilderKeys mapBuilderKeys2 = mapBuilderKeys;
        if (mapBuilderKeys == null) {
            mapBuilderKeys2 = new MapBuilderKeys(this);
            this.keysView = mapBuilderKeys2;
        }
        return mapBuilderKeys2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection getValues() {
        MapBuilderValues mapBuilderValues = this.valuesView;
        MapBuilderValues mapBuilderValues2 = mapBuilderValues;
        if (mapBuilderValues == null) {
            mapBuilderValues2 = new MapBuilderValues(this);
            this.valuesView = mapBuilderValues2;
        }
        return mapBuilderValues2;
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!entriesIterator$kotlin_stdlib.hasNext()) {
                return i2;
            }
            i = i2 + entriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    public final KeysItr keysIterator$kotlin_stdlib() {
        return new KeysItr(this);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(obj);
        Object[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = obj2;
            return null;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        Object obj3 = allocateValuesArray[i];
        allocateValuesArray[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        Intrinsics.checkNotNull(objArr);
        Object obj2 = objArr[removeKey$kotlin_stdlib];
        ListBuilderKt.resetAt(objArr, removeKey$kotlin_stdlib);
        return obj2;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        Intrinsics.checkNotNull(objArr);
        if (!Intrinsics.areEqual(objArr[findKey], entry.getValue())) {
            return false;
        }
        removeKeyAt(findKey);
        return true;
    }

    public final int removeKey$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(obj);
        if (findKey < 0) {
            return -1;
        }
        removeKeyAt(findKey);
        return findKey;
    }

    public final boolean removeValue$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(obj);
        if (findValue < 0) {
            return false;
        }
        removeKeyAt(findValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        EntriesItr entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.nextAppendString(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    public final ValuesItr valuesIterator$kotlin_stdlib() {
        return new ValuesItr(this);
    }
}
