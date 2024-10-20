package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: zzfyw.class */
abstract class zzfyw implements zzgaw {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            z = true;
        } else {
            if (obj instanceof zzgaw) {
                return zzs().equals(((zzgaw) obj).zzs());
            }
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    abstract Collection zzf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator zzg() {
        throw null;
    }

    abstract Map zzj();

    abstract Set zzl();

    @Override // com.google.android.gms.internal.ads.zzgaw
    public boolean zzq(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final Collection zzr() {
        Collection collection = this.zzb;
        Collection collection2 = collection;
        if (collection == null) {
            collection2 = zzf();
            this.zzb = collection2;
        }
        return collection2;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final Map zzs() {
        Map map = this.zzc;
        Map map2 = map;
        if (map == null) {
            map2 = zzj();
            this.zzc = map2;
        }
        return map2;
    }

    public final Set zzt() {
        Set set = this.zza;
        Set set2 = set;
        if (set == null) {
            set2 = zzl();
            this.zza = set2;
        }
        return set2;
    }
}
