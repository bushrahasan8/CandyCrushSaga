package com.google.android.gms.internal.appset;

import com.google.android.gms.common.util.DefaultClock;

/* loaded from: zzj.class */
final class zzj implements Runnable {
    final zzl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long zza = this.zza.zza();
        if (zza == -1 || DefaultClock.getInstance().currentTimeMillis() <= zza) {
            return;
        }
        zzl.zze(zzl.zzb(this.zza));
    }
}
