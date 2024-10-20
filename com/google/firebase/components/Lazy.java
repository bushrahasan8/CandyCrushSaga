package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: Lazy.class */
public class Lazy implements Provider {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile Provider provider;

    public Lazy(Provider provider) {
        this.provider = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public Object get() {
        Object obj = this.instance;
        Object obj2 = UNINITIALIZED;
        Object obj3 = obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj4 = this.instance;
                obj3 = obj4;
                if (obj4 == obj2) {
                    obj3 = this.provider.get();
                    this.instance = obj3;
                    this.provider = null;
                }
            }
        }
        return obj3;
    }
}
