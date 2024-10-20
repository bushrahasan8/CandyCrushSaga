package com.google.android.gms.internal.measurement;

/* loaded from: zzpu.class */
public final class zzpu implements zzpv {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Double> zzb;
    private static final zzhg<Long> zzc;
    private static final zzhg<Long> zzd;
    private static final zzhg<String> zze;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.test.boolean_flag", false);
        zzb = zza2.zza("measurement.test.double_flag", -3.0d);
        zzc = zza2.zza("measurement.test.int_flag", -2L);
        zzd = zza2.zza("measurement.test.long_flag", -1L);
        zze = zza2.zza("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final double zza() {
        return zzb.zza().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final long zzb() {
        return zzc.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final String zzd() {
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzpv
    public final boolean zze() {
        return zza.zza().booleanValue();
    }
}
