package com.google.android.gms.internal.ads;

import com.ironsource.t2;
import java.util.HashMap;

/* loaded from: zzchq.class */
final class zzchq implements Runnable {
    final String zza;
    final String zzb;
    final int zzc;
    final int zzd;
    final zzchw zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchq(zzchw zzchwVar, String str, String str2, int i, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzchwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", t2.h);
        zzchw.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
