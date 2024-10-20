package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzapl.class */
public final class zzapl implements Runnable {
    final zzaqa zza;
    final zzapm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapl(zzapm zzapmVar, zzaqa zzaqaVar) {
        this.zza = zzaqaVar;
        this.zzb = zzapmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
