package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzcht.class */
public final class zzcht implements Runnable {
    final String zza;
    final String zzb;
    final int zzc;
    final zzchw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcht(zzchw zzchwVar, String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = zzchwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzchw.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
