package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: zzbhi.class */
public final class zzbhi implements zzhhd {
    private final zzhhu zza;

    public zzbhi(zzhhu zzhhuVar) {
        this.zza = zzhhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbhh zzb() {
        return new zzbhh((ScheduledExecutorService) this.zza.zzb());
    }
}
