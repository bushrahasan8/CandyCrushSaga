package com.google.common.collect;

/* loaded from: ForwardingObject.class */
public abstract class ForwardingObject {
    protected abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
