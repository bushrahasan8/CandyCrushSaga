package com.google.android.gms.internal.measurement;

/* loaded from: zzoe.class */
public final class zzoe implements zzof {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.consent.stop_reset_on_ads_storage_denied.client.dev", false);
        zzb = zza2.zza("measurement.consent.stop_reset_on_ads_storage_denied.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
