package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: zzdf.class */
final class zzdf extends zzdj {
    private static final Object zza = new Object();
    private Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdf(Object obj) {
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
