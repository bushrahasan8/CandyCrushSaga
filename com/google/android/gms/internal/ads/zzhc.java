package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: zzhc.class */
public final class zzhc implements zzgv {
    private final Context zza;
    private final zzgv zzb;

    public zzhc(Context context) {
        zzhe zzheVar = new zzhe();
        this.zza = context.getApplicationContext();
        this.zzb = zzheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final /* bridge */ /* synthetic */ zzgw zza() {
        return new zzhd(this.zza, ((zzhe) this.zzb).zza());
    }
}
