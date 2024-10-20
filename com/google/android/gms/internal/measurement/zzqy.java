package com.google.android.gms.internal.measurement;

/* loaded from: zzqy.class */
public final class zzqy implements zzqz {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.tcf.client", false);
        zzb = zza2.zza("measurement.tcf.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqz
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqz
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqz
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
