package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzeru.class */
public final class zzeru implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzeru(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        ListenableFuture listenableFuture = (ListenableFuture) this.zza.zzb();
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        return new zzert(listenableFuture, zzgeyVar);
    }
}
