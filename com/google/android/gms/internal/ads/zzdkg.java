package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: zzdkg.class */
public final class zzdkg implements zzhhd {
    private final zzhhu zza;

    public zzdkg(zzhhu zzhhuVar) {
        this.zza = zzhhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdim((zzdkz) this.zza.zzb(), zzcep.zzf));
        zzhhl.zzb(singleton);
        return singleton;
    }
}
