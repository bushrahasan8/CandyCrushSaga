package com.google.android.gms.internal.measurement;

/* loaded from: zzny.class */
public final class zzny implements zznz {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.consent_regional_defaults.client", false);
        zzb = zza2.zza("measurement.consent_regional_defaults.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zznz
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznz
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznz
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
