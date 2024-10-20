package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: zzgcc.class */
abstract class zzgcc implements Iterator {
    final Iterator zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcc(Iterator it) {
        it.getClass();
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zza(Object obj);
}
