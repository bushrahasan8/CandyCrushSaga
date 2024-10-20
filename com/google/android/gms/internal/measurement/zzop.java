package com.google.android.gms.internal.measurement;

/* loaded from: zzop.class */
public final class zzop implements zzom {
    private static final zzhg<Boolean> zza;
    private static final zzhg<Boolean> zzb;
    private static final zzhg<Boolean> zzc;
    private static final zzhg<Boolean> zzd;
    private static final zzhg<Boolean> zze;
    private static final zzhg<Boolean> zzf;
    private static final zzhg<Long> zzg;

    static {
        zzho zza2 = new zzho(zzhh.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.dma_consent.client", true);
        zzb = zza2.zza("measurement.dma_consent.client_bow_check2", true);
        zzc = zza2.zza("measurement.dma_consent.service", true);
        zzd = zza2.zza("measurement.dma_consent.service_dcu_event", false);
        zze = zza2.zza("measurement.dma_consent.service_npa_remote_default", true);
        zzf = zza2.zza("measurement.dma_consent.service_split_batch_on_consent", true);
        zzg = zza2.zza("measurement.id.dma_consent.service_dcu_event", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean zzf() {
        return zze.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean zzg() {
        return zzf.zza().booleanValue();
    }
}
