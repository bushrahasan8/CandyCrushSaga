package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: zzj.class */
abstract class zzj implements Iterator {
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        this.zzb = 4;
        this.zza = zza();
        if (this.zzb == 3) {
            return false;
        }
        this.zzb = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzb = 2;
        Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract Object zza();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
