package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: Maps.class */
public abstract class Maps {

    /* renamed from: com.google.common.collect.Maps$1, reason: invalid class name */
    /* loaded from: Maps$1.class */
    abstract class AnonymousClass1 extends TransformedIterator {
    }

    /* loaded from: Maps$EntryFunction.class */
    private enum EntryFunction implements Function {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };

        /* synthetic */ EntryFunction(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* loaded from: Maps$EntrySet.class */
    static abstract class EntrySet extends Sets.ImprovedAbstractSet {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        abstract Map map();

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException e) {
                return Sets.removeAllImpl(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException e) {
                HashSet newHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        newHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return map().keySet().retainAll(newHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }
    }

    /* loaded from: Maps$KeySet.class */
    static abstract class KeySet extends Sets.ImprovedAbstractSet {
        final Map map;

        /* JADX INFO: Access modifiers changed from: package-private */
        public KeySet(Map map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return map().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return map().isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return map().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: Maps$Values.class */
    public static class Values extends AbstractCollection {
        final Map map;

        Values(Map map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            map().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return map().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return map().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Maps.valueIterator(map().entrySet().iterator());
        }

        final Map map() {
            return this.map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException e) {
                for (Map.Entry entry : map().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        map().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException e) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().removeAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException e) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry entry : map().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().retainAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return map().size();
        }
    }

    /* loaded from: Maps$ViewCachingAbstractMap.class */
    static abstract class ViewCachingAbstractMap extends AbstractMap {
        private transient Set entrySet;
        private transient Collection values;

        abstract Set createEntrySet();

        Collection createValues() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.entrySet;
            Set set2 = set;
            if (set == null) {
                set2 = createEntrySet();
                this.entrySet = set2;
            }
            return set2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.values;
            Collection collection2 = collection;
            if (collection == null) {
                collection2 = createValues();
                this.values = collection2;
            }
            return collection2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int capacity(int i) {
        if (i < 3) {
            CollectPreconditions.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean containsValueImpl(Map map, Object obj) {
        return Iterators.contains(valueIterator(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean equalsImpl(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry immutableEntry(Object obj, Object obj2) {
        return new ImmutableEntry(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Function keyFunction() {
        return EntryFunction.KEY;
    }

    public static HashMap newHashMapWithExpectedSize(int i) {
        return new HashMap(capacity(i));
    }

    public static IdentityHashMap newIdentityHashMap() {
        return new IdentityHashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean safeContainsKey(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object safeGet(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object safeRemove(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toStringImpl(Map map) {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        Iterator it = map.entrySet().iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                newStringBuilderForCollection.append('}');
                return newStringBuilderForCollection.toString();
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!z2) {
                newStringBuilderForCollection.append(", ");
            }
            newStringBuilderForCollection.append(entry.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(entry.getValue());
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Function valueFunction() {
        return EntryFunction.VALUE;
    }

    static Iterator valueIterator(Iterator it) {
        return new TransformedIterator(it) { // from class: com.google.common.collect.Maps.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public Object transform(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }
}
