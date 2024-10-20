package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: zzhgt.class */
final class zzhgt implements Iterator {
    int zza = 0;
    final zzhgu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhgt(zzhgu zzhguVar) {
        this.zzb = zzhguVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhgu zzhguVar = this.zzb;
            zzhguVar.zza.add(zzhguVar.zzb.next());
            return next();
        }
        zzhgu zzhguVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzhguVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
