package com.google.android.gms.internal.ads;

import com.ironsource.t2;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzchs.class */
public final class zzchs implements Runnable {
    final String zza;
    final String zzb;
    final int zzc;
    final int zzd;
    final long zze;
    final long zzf;
    final boolean zzg;
    final int zzh;
    final int zzi;
    final zzchw zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchs(zzchw zzchwVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
        this.zzj = zzchwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("bufferedDuration", Long.toString(this.zze));
        hashMap.put("totalDuration", Long.toString(this.zzf));
        hashMap.put("cacheReady", true != this.zzg ? t2.h : "1");
        hashMap.put("playerCount", Integer.toString(this.zzh));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzi));
        zzchw.zze(this.zzj, "onPrecacheEvent", hashMap);
    }
}
