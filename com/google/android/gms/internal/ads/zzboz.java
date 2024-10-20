package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzboz.class */
public final class zzboz implements Runnable {
    final zzbpc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboz(zzbpc zzbpcVar) {
        this.zza = zzbpcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbpc.zzc(this.zza);
    }
}
