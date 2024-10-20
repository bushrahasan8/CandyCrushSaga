package com.google.android.gms.measurement.internal;

/* loaded from: zzml.class */
final class zzml implements Runnable {
    private final long zza;
    private final zzmi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzml(zzmi zzmiVar, long j) {
        this.zza = j;
        this.zzb = zzmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmi.zzb(this.zzb, this.zza);
    }
}
