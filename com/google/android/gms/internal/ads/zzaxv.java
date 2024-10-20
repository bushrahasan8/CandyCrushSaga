package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzaxv.class */
public final class zzaxv implements Runnable {
    final zzaxw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxv(zzaxw zzaxwVar) {
        this.zza = zzaxwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaxw.zzb(this.zza);
    }
}
