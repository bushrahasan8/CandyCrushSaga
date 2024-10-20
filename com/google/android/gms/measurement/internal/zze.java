package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zze.class */
public final class zze implements Runnable {
    private final long zza;
    private final zza zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(zza zzaVar, long j) {
        this.zza = j;
        this.zzb = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
