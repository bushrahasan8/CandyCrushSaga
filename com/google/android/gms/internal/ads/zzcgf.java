package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: zzcgf.class */
public final class zzcgf {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzD)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcfq zzcfqVar) {
        if (zzcfqVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = this.zzb;
            if (Math.abs(timestamp - j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable(zzcfqVar) { // from class: com.google.android.gms.internal.ads.zzcge
            public final zzcfq zza;

            {
                this.zza = zzcfqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
