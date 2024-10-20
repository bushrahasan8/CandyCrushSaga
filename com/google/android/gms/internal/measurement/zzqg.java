package com.google.android.gms.internal.measurement;

/* loaded from: zzqg.class */
public final class zzqg implements zzqh {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Long> zzb;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.remove_app_background.client", false);
        zzb = zza2.zza("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqh
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqh
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
