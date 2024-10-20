package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: zzcmh.class */
public final class zzcmh implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzcmh(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbzp zzb() {
        Context zza = ((zzclm) this.zza).zza();
        zzfnc zzfncVar = (zzfnc) this.zzb.zzb();
        zzbrx zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcei.zza(), zzfncVar);
        zzbrr zzbrrVar = zzbru.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbrrVar, zzbrrVar);
        return new zzbzo(zza, com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcei.zza(), zzfncVar).zza("google.afma.sdkConstants.getSdkConstants", zzbrrVar, zzbrrVar));
    }
}
