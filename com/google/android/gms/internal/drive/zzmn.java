package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: zzmn.class */
final class zzmn implements Iterator<Object> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
