package com.google.android.gms.internal.measurement;

/* loaded from: zzqx.class */
public final class zzqx implements zzqu {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;
    private static final zzhg<Boolean> zzc;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.sgtm.client.dev", false);
        zzb = zza2.zza("measurement.sgtm.preview_mode_enabled.dev", false);
        zzc = zza2.zza("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqu
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqu
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqu
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }
}
