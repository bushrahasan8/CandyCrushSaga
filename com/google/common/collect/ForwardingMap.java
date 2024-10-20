package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: ForwardingMap.class */
public abstract class ForwardingMap extends ForwardingObject implements Map {
    protected ForwardingMap() {
    }

    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract Map delegate();

    @Override // java.util.Map
    public Set entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    protected boolean standardContainsValue(Object obj) {
        return Maps.containsValueImpl(this, obj);
    }

    protected boolean standardEquals(Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.Map
    public Collection values() {
        return delegate().values();
    }
}
