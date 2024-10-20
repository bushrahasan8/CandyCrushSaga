package com.google.common.collect;

import com.google.common.collect.Multimaps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: AbstractMultimap.class */
abstract class AbstractMultimap implements Multimap {
    private transient Map asMap;
    private transient Collection entries;
    private transient Set keySet;
    private transient Collection values;

    /* loaded from: AbstractMultimap$Entries.class */
    class Entries extends Multimaps.Entries {
        final AbstractMultimap this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Entries(AbstractMultimap abstractMultimap) {
            this.this$0 = abstractMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.this$0.entryIterator();
        }

        @Override // com.google.common.collect.Multimaps.Entries
        Multimap multimap() {
            return this.this$0;
        }
    }

    /* loaded from: AbstractMultimap$EntrySet.class */
    class EntrySet extends Entries implements Set {
        /* JADX INFO: Access modifiers changed from: package-private */
        public EntrySet(AbstractMultimap abstractMultimap) {
            super(abstractMultimap);
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

    /* loaded from: AbstractMultimap$Values.class */
    class Values extends AbstractCollection {
        final AbstractMultimap this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Values(AbstractMultimap abstractMultimap) {
            this.this$0 = abstractMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.this$0.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.this$0.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.this$0.size();
        }
    }

    @Override // com.google.common.collect.Multimap
    public Map asMap() {
        Map map = this.asMap;
        Map map2 = map;
        if (map == null) {
            map2 = createAsMap();
            this.asMap = map2;
        }
        return map2;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(Object obj) {
        Iterator it = asMap().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map createAsMap();

    abstract Collection createEntries();

    abstract Set createKeySet();

    abstract Collection createValues();

    @Override // com.google.common.collect.Multimap
    public Collection entries() {
        Collection collection = this.entries;
        Collection collection2 = collection;
        if (collection == null) {
            collection2 = createEntries();
            this.entries = collection2;
        }
        return collection2;
    }

    abstract Iterator entryIterator();

    public boolean equals(Object obj) {
        return Multimaps.equalsImpl(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set keySet() {
        Set set = this.keySet;
        Set set2 = set;
        if (set == null) {
            set2 = createKeySet();
            this.keySet = set2;
        }
        return set2;
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    abstract Iterator valueIterator();

    @Override // com.google.common.collect.Multimap
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
