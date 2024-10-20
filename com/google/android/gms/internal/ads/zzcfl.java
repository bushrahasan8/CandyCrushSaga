package com.google.android.gms.internal.ads;

/* loaded from: zzcfl.class */
final class zzcfl implements Runnable {
    final int zza;
    final int zzb;
    final zzcfp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfl(zzcfp zzcfpVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfq zzcfqVar;
        zzcfq zzcfqVar2;
        zzcfp zzcfpVar = this.zzc;
        zzcfqVar = zzcfpVar.zzq;
        if (zzcfqVar != null) {
            int i = this.zza;
            int i2 = this.zzb;
            zzcfqVar2 = zzcfpVar.zzq;
            zzcfqVar2.zzj(i, i2);
        }
    }
}
