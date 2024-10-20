package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: zzgau.class */
abstract class zzgau extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        Set set2 = set;
        if (set == null) {
            set2 = zzb();
            this.zza = set2;
        }
        return set2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        Set set2 = set;
        if (set == null) {
            set2 = zze();
            this.zzb = set2;
        }
        return set2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        Collection collection2 = collection;
        if (collection == null) {
            collection2 = new zzgat(this);
            this.zzc = collection2;
        }
        return collection2;
    }

    abstract Set zzb();

    Set zze() {
        return new zzgas(this);
    }
}
