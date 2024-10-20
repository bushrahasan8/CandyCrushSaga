package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfpy.class */
public final class zzfpy implements Runnable {
    final zzfqd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpy(zzfqd zzfqdVar) {
        this.zza = zzfqdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfpx zzfpxVar;
        zzfpxVar = this.zza.zzl;
        zzfpxVar.zzb();
    }
}
