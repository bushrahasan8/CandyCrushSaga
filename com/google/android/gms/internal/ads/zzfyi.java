package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: zzfyi.class */
final class zzfyi implements Iterator {
    Map.Entry zza;
    final Iterator zzb;
    final zzfyj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyi(zzfyj zzfyjVar, Iterator it) {
        this.zzb = it;
        this.zzc = zzfyjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        zzfxe.zzj(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfyt zzfytVar = this.zzc.zza;
        i = zzfytVar.zzb;
        zzfytVar.zzb = i - collection.size();
        collection.clear();
        this.zza = null;
    }
}
