package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: zzdkh.class */
public final class zzdkh implements zzhhd {
    private final zzdjr zza;
    private final zzhhu zzb;

    public zzdkh(zzdjr zzdjrVar, zzhhu zzhhuVar) {
        this.zza = zzdjrVar;
        this.zzb = zzhhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
