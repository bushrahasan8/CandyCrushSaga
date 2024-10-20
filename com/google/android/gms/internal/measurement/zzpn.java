package com.google.android.gms.internal.measurement;

/* loaded from: zzpn.class */
public final class zzpn implements zzpk {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Long> zzb;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.increase_param_lengths", false);
        zzb = zza2.zza("measurement.id.increase_param_lengths", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpk
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
