package com.google.android.gms.measurement.internal;

/* loaded from: zzmk.class */
final class zzmk implements Runnable {
    private final long zza;
    private final zzmi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmk(zzmi zzmiVar, long j) {
        this.zza = j;
        this.zzb = zzmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmi.zza(this.zzb, this.zza);
    }
}
