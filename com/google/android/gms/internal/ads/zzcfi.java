package com.google.android.gms.internal.ads;

/* loaded from: zzcfi.class */
final class zzcfi implements Runnable {
    final zzcfp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfi(zzcfp zzcfpVar) {
        this.zza = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfq zzcfqVar;
        zzcfq zzcfqVar2;
        zzcfp zzcfpVar = this.zza;
        zzcfqVar = zzcfpVar.zzq;
        if (zzcfqVar != null) {
            zzcfqVar2 = zzcfpVar.zzq;
            zzcfqVar2.zza();
        }
    }
}
