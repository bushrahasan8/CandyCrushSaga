package com.google.android.gms.internal.ads;

/* loaded from: zzauy.class */
final class zzauy implements zzfru {
    final zzfqr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauy(zzfqr zzfqrVar) {
        this.zza = zzfqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
