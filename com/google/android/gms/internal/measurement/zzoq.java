package com.google.android.gms.internal.measurement;

/* loaded from: zzoq.class */
public final class zzoq implements zzor {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;
    private static final zzhg<Boolean> zzc;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.collection.event_safelist", true);
        zzb = zza2.zza("measurement.service.store_null_safelist", true);
        zzc = zza2.zza("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final boolean zzc() {
        return zzc.zza().booleanValue();
    }
}
