package com.google.common.collect;

import java.util.Iterator;

/* loaded from: UnmodifiableIterator.class */
public abstract class UnmodifiableIterator implements Iterator {
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
