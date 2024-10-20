package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.ironsource.t2;
import java.util.Map;

/* loaded from: g.class */
abstract class g implements Map.Entry {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            z = false;
            if (Objects.equal(getKey(), entry.getKey())) {
                z = false;
                if (Objects.equal(getValue(), entry.getValue())) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return getKey() + t2.i.b + getValue();
    }
}
