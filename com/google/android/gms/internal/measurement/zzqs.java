package com.google.android.gms.internal.measurement;

/* loaded from: zzqs.class */
public final class zzqs implements zzqt {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.sfmc.client", true);
        zzb = zza2.zza("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqt
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqt
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqt
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
