package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: zzewa.class */
public final class zzewa implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;
    private final zzhhu zzc;

    public zzewa(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
        this.zzc = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevz(((zzeap) this.zza).zzb(), (PackageInfo) this.zzb.zzb(), ((zzclm) this.zzc).zza());
    }
}
