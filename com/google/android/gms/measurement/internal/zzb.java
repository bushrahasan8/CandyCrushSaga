package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzb.class */
public final class zzb implements Runnable {
    private final String zza;
    private final long zzb;
    private final zza zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(zza zzaVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zza.zzb(this.zzc, this.zza, this.zzb);
    }
}
