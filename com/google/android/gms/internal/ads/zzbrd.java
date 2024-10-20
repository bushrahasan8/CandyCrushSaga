package com.google.android.gms.internal.ads;

/* loaded from: zzbrd.class */
public final class zzbrd extends zzcfb {
    private final Object zza = new Object();
    private final zzbri zzb;
    private boolean zzc;

    public zzbrd(zzbri zzbriVar) {
        this.zzb = zzbriVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzi(new zzbra(this), new zzcex());
            zzi(new zzbrb(this), new zzbrc(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}
