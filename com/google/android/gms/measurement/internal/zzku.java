package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzku.class */
public final class zzku implements Runnable {
    private final Bundle zza;
    private final zzks zzb;
    private final zzks zzc;
    private final long zzd;
    private final zzkv zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzku(zzkv zzkvVar, Bundle bundle, zzks zzksVar, zzks zzksVar2, long j) {
        this.zza = bundle;
        this.zzb = zzksVar;
        this.zzc = zzksVar2;
        this.zzd = j;
        this.zze = zzkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkv.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
