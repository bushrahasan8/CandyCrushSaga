package com.applovin.impl;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: gb.class */
public class gb extends g implements Serializable {
    final Object a;
    final Object b;

    public gb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
