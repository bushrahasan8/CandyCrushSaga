package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfyt.class */
public abstract class zzfyt extends zzfyw implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfyt(Map map) {
        zzfxe.zze(map.isEmpty());
        this.zza = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzfyt zzfytVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfytVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException e) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfytVar.zzb -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    final Collection zzf() {
        return new zzfyv(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfyw
    public final Iterator zzg() {
        return new zzfyd(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzh(Object obj, List list, zzfyq zzfyqVar) {
        return list instanceof RandomAccess ? new zzfym(this, obj, list, zzfyqVar) : new zzfys(this, obj, list, zzfyqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    Map zzj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfyk(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfyn(this, (SortedMap) map) : new zzfyg(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    Set zzl() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfyl(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfyo(this, (SortedMap) map) : new zzfyj(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyw, com.google.android.gms.internal.ads.zzgaw
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection zza = zza();
        if (!zza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, zza);
        return true;
    }
}
