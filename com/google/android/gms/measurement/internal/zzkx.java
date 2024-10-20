package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzkx.class */
public final class zzkx implements Runnable {
    private final zzks zza;
    private final zzks zzb;
    private final long zzc;
    private final boolean zzd;
    private final zzkv zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkx(zzkv zzkvVar, zzks zzksVar, zzks zzksVar2, long j, boolean z) {
        this.zza = zzksVar;
        this.zzb = zzksVar2;
        this.zzc = j;
        this.zzd = z;
        this.zze = zzkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
