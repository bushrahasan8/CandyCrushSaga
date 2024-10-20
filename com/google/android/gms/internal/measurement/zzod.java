package com.google.android.gms.internal.measurement;

/* loaded from: zzod.class */
public final class zzod implements zzoa {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;
    private static final zzhg<Boolean> zzc;
    private static final zzhg<Long> zzd;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.client.consent_state_v1", true);
        zzb = zza2.zza("measurement.client.3p_consent_state_v1", true);
        zzc = zza2.zza("measurement.service.consent_state_v1_W36", true);
        zzd = zza2.zza("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final long zza() {
        return zzd.zza().longValue();
    }
}
