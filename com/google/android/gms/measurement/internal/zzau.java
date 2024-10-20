package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzau.class */
public final class zzau implements Runnable {
    private final zzio zza;
    private final zzav zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzav zzavVar, zzio zzioVar) {
        this.zza = zzioVar;
        this.zzb = zzavVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
        if (zzad.zza()) {
            this.zza.zzl().zzb(this);
            return;
        }
        boolean zzc = this.zzb.zzc();
        this.zzb.zzd = 0L;
        if (zzc) {
            this.zzb.zzb();
        }
    }
}
