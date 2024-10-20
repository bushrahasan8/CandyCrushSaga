package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CompactHashMap.class */
public class CompactHashMap extends AbstractMap implements Serializable {
    private static final Object NOT_FOUND = new Object();
    transient int[] entries;
    private transient Set entrySetView;
    private transient Set keySetView;
    transient Object[] keys;
    private transient int metadata;
    private transient int size;
    private transient Object table;
    transient Object[] values;
    private transient Collection valuesView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: CompactHashMap$EntrySetView.class */
    public class EntrySetView extends AbstractSet {
        final CompactHashMap this$0;

        EntrySetView(CompactHashMap compactHashMap) {
            this.this$0 = compactHashMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map delegateOrNull = this.this$0.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.entrySet().contains(obj);
            }
            boolean z = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int indexOf = this.this$0.indexOf(entry.getKey());
                z = false;
                if (indexOf != -1) {
                    z = false;
                    if (Objects.equal(this.this$0.value(indexOf), entry.getValue())) {
                        z = true;
                    }
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.this$0.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int hashTableMask;
            int remove;
            Map delegateOrNull = this.this$0.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.this$0.needsAllocArrays() || (remove = CompactHashing.remove(entry.getKey(), entry.getValue(), (hashTableMask = this.this$0.hashTableMask()), this.this$0.requireTable(), this.this$0.requireEntries(), this.this$0.requireKeys(), this.this$0.requireValues())) == -1) {
                return false;
            }
            this.this$0.moveLastEntry(remove, hashTableMask);
            CompactHashMap.access$1210(this.this$0);
            this.this$0.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size();
        }
    }

    /* loaded from: CompactHashMap$Itr.class */
    private abstract class Itr implements Iterator {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;
        final CompactHashMap this$0;

        private Itr(CompactHashMap compactHashMap) {
            this.this$0 = compactHashMap;
            this.expectedMetadata = compactHashMap.metadata;
            this.currentIndex = compactHashMap.firstEntryIndex();
            this.indexToRemove = -1;
        }

        private void checkForConcurrentModification() {
            if (this.this$0.metadata != this.expectedMetadata) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object getOutput(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        @Override // java.util.Iterator
        public Object next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.currentIndex;
            this.indexToRemove = i;
            Object output = getOutput(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            CompactHashMap compactHashMap = this.this$0;
            compactHashMap.remove(compactHashMap.key(this.indexToRemove));
            this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: CompactHashMap$KeySetView.class */
    public class KeySetView extends AbstractSet {
        final CompactHashMap this$0;

        KeySetView(CompactHashMap compactHashMap) {
            this.this$0 = compactHashMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.this$0.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.this$0.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map delegateOrNull = this.this$0.delegateOrNull();
            return delegateOrNull != null ? delegateOrNull.keySet().remove(obj) : this.this$0.removeHelper(obj) != CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: CompactHashMap$MapEntry.class */
    public final class MapEntry extends AbstractMapEntry {
        private final Object key;
        private int lastKnownIndex;
        final CompactHashMap this$0;

        MapEntry(CompactHashMap compactHashMap, int i) {
            this.this$0 = compactHashMap;
            this.key = compactHashMap.key(i);
            this.lastKnownIndex = i;
        }

        private void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= this.this$0.size() || !Objects.equal(this.key, this.this$0.key(this.lastKnownIndex))) {
                this.lastKnownIndex = this.this$0.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Object getValue() {
            Map delegateOrNull = this.this$0.delegateOrNull();
            if (delegateOrNull != null) {
                return NullnessCasts.uncheckedCastNullableTToT(delegateOrNull.get(this.key));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            return i == -1 ? NullnessCasts.unsafeNull() : this.this$0.value(i);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map delegateOrNull = this.this$0.delegateOrNull();
            if (delegateOrNull != null) {
                return NullnessCasts.uncheckedCastNullableTToT(delegateOrNull.put(this.key, obj));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i == -1) {
                this.this$0.put(this.key, obj);
                return NullnessCasts.unsafeNull();
            }
            Object value = this.this$0.value(i);
            this.this$0.setValue(this.lastKnownIndex, obj);
            return value;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: CompactHashMap$ValuesView.class */
    public class ValuesView extends AbstractCollection {
        final CompactHashMap this$0;

        ValuesView(CompactHashMap compactHashMap) {
            this.this$0 = compactHashMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.this$0.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.this$0.size();
        }
    }

    CompactHashMap() {
        init(3);
    }

    CompactHashMap(int i) {
        init(i);
    }

    static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i = compactHashMap.size;
        compactHashMap.size = i - 1;
        return i;
    }

    public static CompactHashMap create() {
        return new CompactHashMap();
    }

    public static CompactHashMap createWithExpectedSize(int i) {
        return new CompactHashMap(i);
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Object obj) {
        int next;
        if (needsAllocArrays()) {
            return -1;
        }
        int smearedHash = Hashing.smearedHash(obj);
        int hashTableMask = hashTableMask();
        int tableGet = CompactHashing.tableGet(requireTable(), smearedHash & hashTableMask);
        if (tableGet == 0) {
            return -1;
        }
        int hashPrefix = CompactHashing.getHashPrefix(smearedHash, hashTableMask);
        do {
            int i = tableGet - 1;
            int entry = entry(i);
            if (CompactHashing.getHashPrefix(entry, hashTableMask) == hashPrefix && Objects.equal(obj, key(i))) {
                return i;
            }
            next = CompactHashing.getNext(entry, hashTableMask);
            tableGet = next;
        } while (next != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object key(int i) {
        return requireKeys()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeHelper(Object obj) {
        int hashTableMask;
        int remove;
        if (!needsAllocArrays() && (remove = CompactHashing.remove(obj, null, (hashTableMask = hashTableMask()), requireTable(), requireEntries(), requireKeys(), null)) != -1) {
            Object value = value(remove);
            moveLastEntry(remove, hashTableMask);
            this.size--;
            incrementModCount();
            return value;
        }
        return NOT_FOUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    private void resizeMeMaybe(int i) {
        int min;
        int length = requireEntries().length;
        if (i <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(min);
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        Object createTable = CompactHashing.createTable(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.tableSet(createTable, i3 & i5, i4 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int tableGet = CompactHashing.tableGet(requireTable, i6);
            while (true) {
                int i7 = tableGet;
                if (i7 != 0) {
                    int i8 = i7 - 1;
                    int i9 = requireEntries[i8];
                    int hashPrefix = CompactHashing.getHashPrefix(i9, i) | i6;
                    int i10 = hashPrefix & i5;
                    int tableGet2 = CompactHashing.tableGet(createTable, i10);
                    CompactHashing.tableSet(createTable, i10, i7);
                    requireEntries[i8] = CompactHashing.maskCombine(hashPrefix, tableGet2, i5);
                    tableGet = CompactHashing.getNext(i9, i);
                }
            }
        }
        this.table = createTable;
        setHashTableMask(i5);
        return i5;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void setKey(int i, Object obj) {
        requireKeys()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, Object obj) {
        requireValues()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object value(int i) {
        return requireValues()[i];
    }

    void accessEntry(int i) {
    }

    int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int tableSize = CompactHashing.tableSize(i);
        this.table = CompactHashing.createTable(tableSize);
        setHashTableMask(tableSize - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, 1073741823);
            delegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.containsKey(obj) : indexOf(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (Objects.equal(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    Map convertToHashFloodingResistantImplementation() {
        Map createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (true) {
            int i = firstEntryIndex;
            if (i < 0) {
                this.table = createHashFloodingResistantDelegate;
                this.entries = null;
                this.keys = null;
                this.values = null;
                incrementModCount();
                return createHashFloodingResistantDelegate;
            }
            createHashFloodingResistantDelegate.put(key(i), value(i));
            firstEntryIndex = getSuccessor(i);
        }
    }

    Set createEntrySet() {
        return new EntrySetView(this);
    }

    Map createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    Set createKeySet() {
        return new KeySetView(this);
    }

    Collection createValues() {
        return new ValuesView(this);
    }

    Map delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.entrySetView;
        Set set2 = set;
        if (set == null) {
            set2 = createEntrySet();
            this.entrySetView = set2;
        }
        return set2;
    }

    Iterator entrySetIterator() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.entrySet().iterator() : new Itr(this) { // from class: com.google.common.collect.CompactHashMap.2
            final CompactHashMap this$0;

            {
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.CompactHashMap.Itr
            public Map.Entry getOutput(int i) {
                return new MapEntry(this.this$0, i);
            }
        };
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        accessEntry(indexOf);
        return value(indexOf);
    }

    int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 >= this.size) {
            i2 = -1;
        }
        return i2;
    }

    void incrementModCount() {
        this.metadata += 32;
    }

    void init(int i) {
        Preconditions.checkArgument(i >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i, 1, 1073741823);
    }

    void insertEntry(int i, Object obj, Object obj2, int i2, int i3) {
        setEntry(i, CompactHashing.maskCombine(i2, 0, i3));
        setKey(i, obj);
        setValue(i, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.keySetView;
        Set set2 = set;
        if (set == null) {
            set2 = createKeySet();
            this.keySetView = set2;
        }
        return set2;
    }

    Iterator keySetIterator() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.keySet().iterator() : new Itr(this) { // from class: com.google.common.collect.CompactHashMap.1
            final CompactHashMap this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            Object getOutput(int i) {
                return this.this$0.key(i);
            }
        };
    }

    void moveLastEntry(int i, int i2) {
        int i3;
        int i4;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int size = size();
        int i5 = size - 1;
        if (i >= i5) {
            requireKeys[i] = null;
            requireValues[i] = null;
            requireEntries[i] = 0;
            return;
        }
        Object obj = requireKeys[i5];
        requireKeys[i] = obj;
        requireValues[i] = requireValues[i5];
        requireKeys[i5] = null;
        requireValues[i5] = null;
        requireEntries[i] = requireEntries[i5];
        requireEntries[i5] = 0;
        int smearedHash = Hashing.smearedHash(obj) & i2;
        int tableGet = CompactHashing.tableGet(requireTable, smearedHash);
        int i6 = tableGet;
        if (tableGet == size) {
            CompactHashing.tableSet(requireTable, smearedHash, i + 1);
            return;
        }
        do {
            i3 = i6 - 1;
            i4 = requireEntries[i3];
            i6 = CompactHashing.getNext(i4, i2);
        } while (i6 != size);
        requireEntries[i3] = CompactHashing.maskCombine(i4, i + 1, i2);
    }

    boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int resizeTable;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(obj, obj2);
        }
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int i3 = this.size;
        int i4 = i3 + 1;
        int smearedHash = Hashing.smearedHash(obj);
        int hashTableMask = hashTableMask();
        int i5 = smearedHash & hashTableMask;
        int tableGet = CompactHashing.tableGet(requireTable(), i5);
        if (tableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(smearedHash, hashTableMask);
            int i6 = 0;
            do {
                i = tableGet - 1;
                i2 = requireEntries[i];
                if (CompactHashing.getHashPrefix(i2, hashTableMask) == hashPrefix && Objects.equal(obj, requireKeys[i])) {
                    Object obj3 = requireValues[i];
                    requireValues[i] = obj2;
                    accessEntry(i);
                    return obj3;
                }
                tableGet = CompactHashing.getNext(i2, hashTableMask);
                i6++;
            } while (tableGet != 0);
            if (i6 >= 9) {
                return convertToHashFloodingResistantImplementation().put(obj, obj2);
            }
            if (i4 > hashTableMask) {
                resizeTable = resizeTable(hashTableMask, CompactHashing.newCapacity(hashTableMask), smearedHash, i3);
            } else {
                requireEntries[i] = CompactHashing.maskCombine(i2, i4, hashTableMask);
                resizeTable = hashTableMask;
            }
        } else if (i4 > hashTableMask) {
            resizeTable = resizeTable(hashTableMask, CompactHashing.newCapacity(hashTableMask), smearedHash, i3);
        } else {
            CompactHashing.tableSet(requireTable(), i5, i4);
            resizeTable = hashTableMask;
        }
        resizeMeMaybe(i4);
        insertEntry(i3, obj, obj2, smearedHash, resizeTable);
        this.size = i4;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        Object removeHelper = removeHelper(obj);
        Object obj2 = removeHelper;
        if (removeHelper == NOT_FOUND) {
            obj2 = null;
        }
        return obj2;
    }

    void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.keys = Arrays.copyOf(requireKeys(), i);
        this.values = Arrays.copyOf(requireValues(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.valuesView;
        Collection collection2 = collection;
        if (collection == null) {
            collection2 = createValues();
            this.valuesView = collection2;
        }
        return collection2;
    }

    Iterator valuesIterator() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.values().iterator() : new Itr(this) { // from class: com.google.common.collect.CompactHashMap.3
            final CompactHashMap this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            Object getOutput(int i) {
                return this.this$0.value(i);
            }
        };
    }
}
