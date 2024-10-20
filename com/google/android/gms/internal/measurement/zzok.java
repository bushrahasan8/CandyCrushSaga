package com.google.android.gms.internal.measurement;

/* loaded from: zzok.class */
public final class zzok implements zzol {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Long> zzb;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.disable_npa_for_dasher_and_unicorn", false);
        zzb = zza2.zza("measurement.id.disable_npa_for_dasher_and_unicorn.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzol
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzol
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
