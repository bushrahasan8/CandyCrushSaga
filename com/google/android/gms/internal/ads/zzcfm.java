package com.google.android.gms.internal.ads;

/* loaded from: zzcfm.class */
final class zzcfm implements Runnable {
    final zzcfp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfm(zzcfp zzcfpVar) {
        this.zza = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfq zzcfqVar;
        zzcfq zzcfqVar2;
        zzcfq zzcfqVar3;
        zzcfp zzcfpVar = this.zza;
        zzcfqVar = zzcfpVar.zzq;
        if (zzcfqVar != null) {
            zzcfqVar2 = zzcfpVar.zzq;
            zzcfqVar2.zzd();
            zzcfqVar3 = this.zza.zzq;
            zzcfqVar3.zzi();
        }
    }
}
