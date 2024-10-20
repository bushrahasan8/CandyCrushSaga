package com.google.android.gms.internal.measurement;

/* loaded from: zzqm.class */
public final class zzqm implements zzqn {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;
    private static final zzhg<Boolean> zzc;
    private static final zzhg<Boolean> zzd;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzb = zza2.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zzc = zza2.zza("measurement.session_stitching_token_enabled", false);
        zzd = zza2.zza("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqn
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqn
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqn
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqn
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }
}
