package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: zg.class */
public class zg implements Set, RandomAccess {
    private final ArrayList a = new ArrayList();
    private final HashSet b = new HashSet();

    public Comparable a() {
        return (Comparable) this.a.get(size() - 1);
    }

    public Comparable a(int i) {
        return (Comparable) this.a.get(i);
    }

    public void a(int i, Comparable comparable) {
        this.b.remove((Comparable) this.a.get(i));
        this.a.set(i, comparable);
        this.b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(a()) > 0) {
            this.a.add(comparable);
        } else {
            this.a.add(b(comparable), comparable);
        }
        return this.b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        boolean z;
        Iterator it = collection.iterator();
        while (true) {
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    return z2;
                }
                z = add((Comparable) it.next()) || z2;
            }
        }
    }

    public int b(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.a, comparable);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        Comparable a = a(binarySearch);
        while (binarySearch >= 0 && a == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public Comparable b(int i) {
        Comparable comparable = (Comparable) this.a.remove(i);
        this.b.remove(comparable);
        return comparable;
    }

    public int c(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.a, comparable);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        Comparable a = a(binarySearch);
        while (binarySearch < size() && a == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.a.clear();
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int d = d((Comparable) obj);
        if (d == -1) {
            return false;
        }
        this.a.remove(d);
        return this.b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean z;
        Iterator it = collection.iterator();
        while (true) {
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    return false;
                }
                z = z2 || remove(it.next());
            }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.a.get(size);
            if (!collection.contains(comparable)) {
                this.a.remove(size);
                this.b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }
}
