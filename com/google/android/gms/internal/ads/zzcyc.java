package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: zzcyc.class */
public final class zzcyc implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzcyc(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcyb((Clock) this.zza.zzb(), (zzcde) this.zzb.zzb());
    }
}
