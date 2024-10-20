package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzc.class */
public final class zzc implements Runnable {
    private final String zza;
    private final long zzb;
    private final zza zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(zza zzaVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zza.zza(this.zzc, this.zza, this.zzb);
    }
}
