package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: zzeul.class */
public final class zzeul implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzeul(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        return new zzeuj(context, zzgeyVar);
    }
}
