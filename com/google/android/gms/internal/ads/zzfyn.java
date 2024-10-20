package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfyn.class */
public class zzfyn extends zzfyg implements SortedMap {
    SortedSet zzd;
    final zzfyt zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyn(zzfyt zzfytVar, SortedMap sortedMap) {
        super(zzfytVar, sortedMap);
        this.zze = zzfytVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfyn(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfyn(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfyn(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) ((zzfyg) this).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgau
    public SortedSet zzg() {
        return new zzfyo(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfyg, com.google.android.gms.internal.ads.zzgau, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        SortedSet sortedSet2 = sortedSet;
        if (sortedSet == null) {
            sortedSet2 = zzg();
            this.zzd = sortedSet2;
        }
        return sortedSet2;
    }
}
