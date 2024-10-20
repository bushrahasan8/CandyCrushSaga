package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: zzedr.class */
public final class zzedr implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzedr(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedq zzb() {
        return new zzedq(((zzclm) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
