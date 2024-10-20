package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: zzhab.class */
public final class zzhab extends AbstractList {
    private final List zza;
    private final zzhaa zzb;

    public zzhab(List list, zzhaa zzhaaVar) {
        this.zza = list;
        this.zzb = zzhaaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzbcn zzb = zzbcn.zzb(((Integer) this.zza.get(i)).intValue());
        zzbcn zzbcnVar = zzb;
        if (zzb == null) {
            zzbcnVar = zzbcn.AD_FORMAT_TYPE_UNSPECIFIED;
        }
        return zzbcnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
