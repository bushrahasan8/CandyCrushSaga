package com.google.android.gms.internal.measurement;

/* loaded from: zzph.class */
public final class zzph implements zzpe {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;
    private static final zzhg<Long> zzc;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.gbraid_campaign.gbraid.client.dev", false);
        zzb = zza2.zza("measurement.gbraid_campaign.gbraid.service", false);
        zzc = zza2.zza("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpe
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpe
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpe
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
