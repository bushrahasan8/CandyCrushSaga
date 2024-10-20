package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfmx.class */
public final class zzfmx implements zzgej {
    final zzfmz zza;
    final zzfmo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmx(zzfmz zzfmzVar, zzfmo zzfmoVar) {
        this.zza = zzfmzVar;
        this.zzb = zzfmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th) {
        zzfmo zzfmoVar = this.zzb;
        zzfmoVar.zzg(th);
        zzfmoVar.zzf(false);
        this.zza.zza(zzfmoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
    }
}
