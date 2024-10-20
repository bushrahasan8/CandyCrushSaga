package com.google.android.gms.internal.play_games_inputmapping;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzah.class */
public final class zzah implements Runnable {
    final zzag zza;
    final zzai zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(zzai zzaiVar, zzag zzagVar) {
        this.zzb = zzaiVar;
        this.zza = zzagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.zzb.zza;
        concurrentHashMap.remove(this.zza);
    }
}
