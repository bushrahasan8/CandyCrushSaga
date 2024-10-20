package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfyh.class */
public class zzfyh implements Iterator {
    final Iterator zza;
    Object zzb;
    Collection zzc;
    Iterator zzd;
    final zzfyt zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyh(zzfyt zzfytVar) {
        Map map;
        this.zze = zzfytVar;
        map = zzfytVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgai.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zzd.remove();
        Collection collection = this.zzc;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfyt zzfytVar = this.zze;
        i = zzfytVar.zzb;
        zzfytVar.zzb = i - 1;
    }
}
