package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzchu.class */
public final class zzchu implements Runnable {
    final String zza;
    final String zzb;
    final long zzc;
    final zzchw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchu(zzchw zzchwVar, String str, String str2, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = zzchwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzchw.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
