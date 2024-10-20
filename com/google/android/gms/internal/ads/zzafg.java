package com.google.android.gms.internal.ads;

/* loaded from: zzafg.class */
abstract class zzafg {
    protected final zzaea zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzafg(zzaea zzaeaVar) {
        this.zza = zzaeaVar;
    }

    protected abstract boolean zza(zzfp zzfpVar) throws zzcc;

    protected abstract boolean zzb(zzfp zzfpVar, long j) throws zzcc;

    public final boolean zzf(zzfp zzfpVar, long j) throws zzcc {
        return zza(zzfpVar) && zzb(zzfpVar, j);
    }
}
