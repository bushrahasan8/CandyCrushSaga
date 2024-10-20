package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: zzdll.class */
public final class zzdll implements zzhhd {
    private final zzhhu zza;

    public zzdll(zzhhu zzhhuVar) {
        this.zza = zzhhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdli) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzhhl.zzb(singleton);
        return singleton;
    }
}
