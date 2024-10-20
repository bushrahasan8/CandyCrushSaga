package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: AbstractMapBasedMultimap.class */
public abstract class AbstractMapBasedMultimap extends AbstractMultimap implements Serializable {
    private transient Map map;
    private transient int totalSize;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AbstractMapBasedMultimap$AsMap.class */
    public class AsMap extends Maps.ViewCachingAbstractMap {
        final transient Map submap;
        final AbstractMapBasedMultimap this$0;

        /* loaded from: AbstractMapBasedMultimap$AsMap$AsMapEntries.class */
        class AsMapEntries extends Maps.EntrySet {
            final AsMap this$1;

            AsMapEntries(AsMap asMap) {
                this.this$1 = asMap;
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.safeContains(this.this$1.submap.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new AsMapIterator(this.this$1);
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map map() {
                return this.this$1;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                this.this$1.this$0.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        /* loaded from: AbstractMapBasedMultimap$AsMap$AsMapIterator.class */
        class AsMapIterator implements Iterator {
            Collection collection;
            final Iterator delegateIterator;
            final AsMap this$1;

            AsMapIterator(AsMap asMap) {
                this.this$1 = asMap;
                this.delegateIterator = asMap.submap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.delegateIterator.next();
                this.collection = (Collection) entry.getValue();
                return this.this$1.wrapEntry(entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.collection != null, "no calls to next() since the last call to remove()");
                this.delegateIterator.remove();
                AbstractMapBasedMultimap.access$220(this.this$1.this$0, this.collection.size());
                this.collection.clear();
                this.collection = null;
            }
        }

        AsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map) {
            this.this$0 = abstractMapBasedMultimap;
            this.submap = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.submap == this.this$0.map) {
                this.this$0.clear();
            } else {
                Iterators.clear(new AsMapIterator(this));
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.safeContainsKey(this.submap, obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return new AsMapEntries(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.submap.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection collection = (Collection) Maps.safeGet(this.submap, obj);
            if (collection == null) {
                return null;
            }
            return this.this$0.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.submap.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return this.this$0.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.submap.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection createCollection = this.this$0.createCollection();
            createCollection.addAll(collection);
            AbstractMapBasedMultimap.access$220(this.this$0, collection.size());
            collection.clear();
            return createCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.submap.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.submap.toString();
        }

        Map.Entry wrapEntry(Map.Entry entry) {
            Object key = entry.getKey();
            return Maps.immutableEntry(key, this.this$0.wrapCollection(key, (Collection) entry.getValue()));
        }
    }

    /* loaded from: AbstractMapBasedMultimap$Itr.class */
    private abstract class Itr implements Iterator {
        final Iterator keyIterator;
        final AbstractMapBasedMultimap this$0;
        Object key = null;
        Collection collection = null;
        Iterator valueIterator = Iterators.emptyModifiableIterator();

        Itr(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            this.this$0 = abstractMapBasedMultimap;
            this.keyIterator = abstractMapBasedMultimap.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.keyIterator.hasNext() || this.valueIterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.valueIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) this.keyIterator.next();
                this.key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.collection = collection;
                this.valueIterator = collection.iterator();
            }
            return output(NullnessCasts.uncheckedCastNullableTToT(this.key), this.valueIterator.next());
        }

        abstract Object output(Object obj, Object obj2);

        @Override // java.util.Iterator
        public void remove() {
            this.valueIterator.remove();
            Collection collection = this.collection;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.keyIterator.remove();
            }
            AbstractMapBasedMultimap.access$210(this.this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AbstractMapBasedMultimap$KeySet.class */
    public class KeySet extends Maps.KeySet {
        final AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        KeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map) {
            super(map);
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.clear(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return map().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || map().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return map().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new Iterator(this, map().entrySet().iterator()) { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1
                Map.Entry entry;
                final KeySet this$1;
                final Iterator val$entryIterator;

                {
                    this.this$1 = this;
                    this.val$entryIterator = r5;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.val$entryIterator.hasNext();
                }

                @Override // java.util.Iterator
                public Object next() {
                    Map.Entry entry = (Map.Entry) this.val$entryIterator.next();
                    this.entry = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    Preconditions.checkState(this.entry != null, "no calls to next() since the last call to remove()");
                    Collection collection = (Collection) this.entry.getValue();
                    this.val$entryIterator.remove();
                    AbstractMapBasedMultimap.access$220(this.this$1.this$0, collection.size());
                    collection.clear();
                    this.entry = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) map().remove(obj);
            boolean z = false;
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.access$220(this.this$0, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                z = true;
            }
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AbstractMapBasedMultimap$NavigableAsMap.class */
    public class NavigableAsMap extends SortedAsMap implements NavigableMap {
        final AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        NavigableAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap navigableMap) {
            super(abstractMapBasedMultimap, navigableMap);
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = sortedMap().ceilingEntry(obj);
            return ceilingEntry == null ? null : wrapEntry(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return sortedMap().ceilingKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public NavigableSet createKeySet() {
            return new NavigableKeySet(this.this$0, sortedMap());
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new NavigableAsMap(this.this$0, sortedMap().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry firstEntry = sortedMap().firstEntry();
            return firstEntry == null ? null : wrapEntry(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = sortedMap().floorEntry(obj);
            return floorEntry == null ? null : wrapEntry(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return sortedMap().floorKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return new NavigableAsMap(this.this$0, sortedMap().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = sortedMap().higherEntry(obj);
            return higherEntry == null ? null : wrapEntry(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return sortedMap().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, java.util.AbstractMap, java.util.Map
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry lastEntry = sortedMap().lastEntry();
            return lastEntry == null ? null : wrapEntry(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = sortedMap().lowerEntry(obj);
            return lowerEntry == null ? null : wrapEntry(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return sortedMap().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        Map.Entry pollAsMapEntry(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection createCollection = this.this$0.createCollection();
            createCollection.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.immutableEntry(entry.getKey(), this.this$0.unmodifiableCollectionSubclass(createCollection));
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return pollAsMapEntry(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return pollAsMapEntry(descendingMap().entrySet().iterator());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public NavigableMap sortedMap() {
            return (NavigableMap) super.sortedMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new NavigableAsMap(this.this$0, sortedMap().subMap(obj, z, obj2, z2));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return new NavigableAsMap(this.this$0, sortedMap().tailMap(obj, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AbstractMapBasedMultimap$NavigableKeySet.class */
    public class NavigableKeySet extends SortedKeySet implements NavigableSet {
        final AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        NavigableKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap navigableMap) {
            super(abstractMapBasedMultimap, navigableMap);
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return sortedMap().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new NavigableKeySet(this.this$0, sortedMap().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return sortedMap().floorKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return new NavigableKeySet(this.this$0, sortedMap().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return sortedMap().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return sortedMap().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.pollNext(descendingIterator());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public NavigableMap sortedMap() {
            return (NavigableMap) super.sortedMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new NavigableKeySet(this.this$0, sortedMap().subMap(obj, z, obj2, z2));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return new NavigableKeySet(this.this$0, sortedMap().tailMap(obj, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AbstractMapBasedMultimap$RandomAccessWrappedList.class */
    public class RandomAccessWrappedList extends WrappedList implements RandomAccess {
        RandomAccessWrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, WrappedCollection wrappedCollection) {
            super(abstractMapBasedMultimap, obj, list, wrappedCollection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AbstractMapBasedMultimap$SortedAsMap.class */
    public class SortedAsMap extends AsMap implements SortedMap {
        SortedSet sortedKeySet;
        final AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        SortedAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap sortedMap) {
            super(abstractMapBasedMultimap, sortedMap);
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return sortedMap().comparator();
        }

        SortedSet createKeySet() {
            return new SortedKeySet(this.this$0, sortedMap());
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return sortedMap().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new SortedAsMap(this.this$0, sortedMap().headMap(obj));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, java.util.AbstractMap, java.util.Map
        public SortedSet keySet() {
            SortedSet sortedSet = this.sortedKeySet;
            SortedSet sortedSet2 = sortedSet;
            if (sortedSet == null) {
                sortedSet2 = createKeySet();
                this.sortedKeySet = sortedSet2;
            }
            return sortedSet2;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return sortedMap().lastKey();
        }

        SortedMap sortedMap() {
            return (SortedMap) this.submap;
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMap(this.this$0, sortedMap().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new SortedAsMap(this.this$0, sortedMap().tailMap(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AbstractMapBasedMultimap$SortedKeySet.class */
    public class SortedKeySet extends KeySet implements SortedSet {
        final AbstractMapBasedMultimap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        SortedKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap sortedMap) {
            super(abstractMapBasedMultimap, sortedMap);
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return sortedMap().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(this.this$0, sortedMap().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return sortedMap().lastKey();
        }

        SortedMap sortedMap() {
            return (SortedMap) super.map();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(this.this$0, sortedMap().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(this.this$0, sortedMap().tailMap(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AbstractMapBasedMultimap$WrappedCollection.class */
    public abstract class WrappedCollection extends AbstractCollection {
        final WrappedCollection ancestor;
        final Collection ancestorDelegate;
        Collection delegate;
        final Object key;
        final AbstractMapBasedMultimap this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: AbstractMapBasedMultimap$WrappedCollection$WrappedIterator.class */
        public class WrappedIterator implements Iterator {
            final Iterator delegateIterator;
            final Collection originalDelegate;
            final WrappedCollection this$1;

            WrappedIterator(WrappedCollection wrappedCollection) {
                this.this$1 = wrappedCollection;
                Collection collection = wrappedCollection.delegate;
                this.originalDelegate = collection;
                this.delegateIterator = AbstractMapBasedMultimap.iteratorOrListIterator(collection);
            }

            WrappedIterator(WrappedCollection wrappedCollection, Iterator it) {
                this.this$1 = wrappedCollection;
                this.originalDelegate = wrappedCollection.delegate;
                this.delegateIterator = it;
            }

            Iterator getDelegateIterator() {
                validateIterator();
                return this.delegateIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                validateIterator();
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                validateIterator();
                return this.delegateIterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.delegateIterator.remove();
                AbstractMapBasedMultimap.access$210(this.this$1.this$0);
                this.this$1.removeIfEmpty();
            }

            void validateIterator() {
                this.this$1.refreshIfEmpty();
                if (this.this$1.delegate != this.originalDelegate) {
                    throw new ConcurrentModificationException();
                }
            }
        }

        WrappedCollection(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, Collection collection, WrappedCollection wrappedCollection) {
            this.this$0 = abstractMapBasedMultimap;
            this.key = obj;
            this.delegate = collection;
            this.ancestor = wrappedCollection;
            this.ancestorDelegate = wrappedCollection == null ? null : wrappedCollection.getDelegate();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            refreshIfEmpty();
            boolean isEmpty = this.delegate.isEmpty();
            boolean add = this.delegate.add(obj);
            if (add) {
                AbstractMapBasedMultimap.access$208(this.this$0);
                if (isEmpty) {
                    addToMap();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.delegate.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(this.this$0, this.delegate.size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        void addToMap() {
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.addToMap();
            } else {
                this.this$0.map.put(this.key, this.delegate);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.delegate.clear();
            AbstractMapBasedMultimap.access$220(this.this$0, size);
            removeIfEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            refreshIfEmpty();
            return this.delegate.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            refreshIfEmpty();
            return this.delegate.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            refreshIfEmpty();
            return this.delegate.equals(obj);
        }

        WrappedCollection getAncestor() {
            return this.ancestor;
        }

        Collection getDelegate() {
            return this.delegate;
        }

        Object getKey() {
            return this.key;
        }

        @Override // java.util.Collection
        public int hashCode() {
            refreshIfEmpty();
            return this.delegate.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            refreshIfEmpty();
            return new WrappedIterator(this);
        }

        void refreshIfEmpty() {
            Collection collection;
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.refreshIfEmpty();
                if (this.ancestor.getDelegate() != this.ancestorDelegate) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.delegate.isEmpty() || (collection = (Collection) this.this$0.map.get(this.key)) == null) {
                    return;
                }
                this.delegate = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            refreshIfEmpty();
            boolean remove = this.delegate.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.access$210(this.this$0);
                removeIfEmpty();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.delegate.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.access$212(this.this$0, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAll;
        }

        void removeIfEmpty() {
            WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.removeIfEmpty();
            } else if (this.delegate.isEmpty()) {
                this.this$0.map.remove(this.key);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.delegate.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.access$212(this.this$0, this.delegate.size() - size);
                removeIfEmpty();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            refreshIfEmpty();
            return this.delegate.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            refreshIfEmpty();
            return this.delegate.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: AbstractMapBasedMultimap$WrappedList.class */
    public class WrappedList extends WrappedCollection implements List {
        final AbstractMapBasedMultimap this$0;

        /* loaded from: AbstractMapBasedMultimap$WrappedList$WrappedListIterator.class */
        private class WrappedListIterator extends WrappedCollection.WrappedIterator implements ListIterator {
            final WrappedList this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            WrappedListIterator(WrappedList wrappedList) {
                super(wrappedList);
                this.this$1 = wrappedList;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WrappedListIterator(WrappedList wrappedList, int i) {
                super(wrappedList, wrappedList.getListDelegate().listIterator(i));
                this.this$1 = wrappedList;
            }

            private ListIterator getDelegateListIterator() {
                return (ListIterator) getDelegateIterator();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = this.this$1.isEmpty();
                getDelegateListIterator().add(obj);
                AbstractMapBasedMultimap.access$208(this.this$1.this$0);
                if (isEmpty) {
                    this.this$1.addToMap();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return getDelegateListIterator().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                getDelegateListIterator().set(obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        WrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, WrappedCollection wrappedCollection) {
            super(abstractMapBasedMultimap, obj, list, wrappedCollection);
            this.this$0 = abstractMapBasedMultimap;
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            refreshIfEmpty();
            boolean isEmpty = getDelegate().isEmpty();
            getListDelegate().add(i, obj);
            AbstractMapBasedMultimap.access$208(this.this$0);
            if (isEmpty) {
                addToMap();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = getListDelegate().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(this.this$0, getDelegate().size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public Object get(int i) {
            refreshIfEmpty();
            return getListDelegate().get(i);
        }

        List getListDelegate() {
            return (List) getDelegate();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            refreshIfEmpty();
            return new WrappedListIterator(this);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            refreshIfEmpty();
            return new WrappedListIterator(this, i);
        }

        @Override // java.util.List
        public Object remove(int i) {
            refreshIfEmpty();
            Object remove = getListDelegate().remove(i);
            AbstractMapBasedMultimap.access$210(this.this$0);
            removeIfEmpty();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            refreshIfEmpty();
            return getListDelegate().set(i, obj);
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            refreshIfEmpty();
            return this.this$0.wrapList(getKey(), getListDelegate().subList(i, i2), getAncestor() == null ? this : getAncestor());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractMapBasedMultimap(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.map = map;
    }

    static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i + 1;
        return i;
    }

    static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i - 1;
        return i;
    }

    static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize + i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize - i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator iteratorOrListIterator(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) Maps.safeRemove(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator it = this.map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    abstract Collection createCollection();

    Collection createCollection(Object obj) {
        return createCollection();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection createEntries() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet(this) : new AbstractMultimap.Entries(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map createMaybeNavigableAsMap() {
        Map map = this.map;
        return map instanceof NavigableMap ? new NavigableAsMap(this, (NavigableMap) this.map) : map instanceof SortedMap ? new SortedAsMap(this, (SortedMap) this.map) : new AsMap(this, this.map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set createMaybeNavigableKeySet() {
        Map map = this.map;
        return map instanceof NavigableMap ? new NavigableKeySet(this, (NavigableMap) this.map) : map instanceof SortedMap ? new SortedKeySet(this, (SortedMap) this.map) : new KeySet(this, this.map);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection createValues() {
        return new AbstractMultimap.Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator entryIterator() {
        return new Itr(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            public Map.Entry output(Object obj, Object obj2) {
                return Maps.immutableEntry(obj, obj2);
            }
        };
    }

    @Override // com.google.common.collect.Multimap
    public Collection get(Object obj) {
        Collection collection = (Collection) this.map.get(obj);
        Collection collection2 = collection;
        if (collection == null) {
            collection2 = createCollection(obj);
        }
        return wrapCollection(obj, collection2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.totalSize++;
            return true;
        }
        Collection createCollection = createCollection(obj);
        if (!createCollection.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.totalSize++;
        this.map.put(obj, createCollection);
        return true;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.totalSize;
    }

    abstract Collection unmodifiableCollectionSubclass(Collection collection);

    @Override // com.google.common.collect.AbstractMultimap
    Iterator valueIterator() {
        return new Itr(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            Object output(Object obj, Object obj2) {
                return obj2;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection values() {
        return super.values();
    }

    abstract Collection wrapCollection(Object obj, Collection collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List wrapList(Object obj, List list, WrappedCollection wrappedCollection) {
        return list instanceof RandomAccess ? new RandomAccessWrappedList(this, obj, list, wrappedCollection) : new WrappedList(this, obj, list, wrappedCollection);
    }
}
