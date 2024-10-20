package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: zzcby.class */
public final class zzcby implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzcby(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbx zzb() {
        return new zzcbx((Clock) this.zza.zzb(), (zzcbv) this.zzb.zzb());
    }
}
