package com.google.android.gms.internal.measurement;

/* loaded from: zzqr.class */
public final class zzqr implements zzqo {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;
    private static final zzhg<Boolean> zzc;
    private static final zzhg<Boolean> zzd;
    private static final zzhg<Boolean> zze;
    private static final zzhg<Long> zzf;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.client.sessions.background_sessions_enabled", true);
        zzb = zza2.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zzc = zza2.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzd = zza2.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zze = zza2.zza("measurement.client.sessions.session_id_enabled", true);
        zzf = zza2.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqo
    public final boolean zza() {
        return zzb.zza().booleanValue();
    }
}
