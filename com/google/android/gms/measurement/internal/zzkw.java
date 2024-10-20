package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzkw.class */
public final class zzkw implements Runnable {
    private final zzkv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkw(zzkv zzkvVar) {
        this.zza = zzkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzkv zzkvVar = this.zza;
        zzksVar = zzkvVar.zzh;
        zzkvVar.zza = zzksVar;
    }
}
