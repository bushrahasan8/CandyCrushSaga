package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: zzgaj.class */
final class zzgaj extends zzgce {
    private static final Object zza = new Object();
    private Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgaj(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.zzb;
        Object obj2 = zza;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.zzb = obj2;
        return obj;
    }
}
