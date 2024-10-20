package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: b.class */
abstract class b implements Iterator {
    private a a = a.NOT_READY;
    private Object b;

    /* loaded from: b$a.class */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.a = a.FAILED;
        this.b = a();
        if (this.a == a.DONE) {
            return false;
        }
        this.a = a.READY;
        return true;
    }

    protected abstract Object a();

    public final Object b() {
        this.a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.a != a.FAILED);
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = a.NOT_READY;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
