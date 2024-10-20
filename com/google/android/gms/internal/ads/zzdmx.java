package com.google.android.gms.internal.ads;

/* loaded from: zzdmx.class */
public final class zzdmx {
    private zzbjj zza;

    public zzdmx(zzdmj zzdmjVar) {
        this.zza = zzdmjVar;
    }

    public final zzbjj zza() {
        zzbjj zzbjjVar;
        synchronized (this) {
            zzbjjVar = this.zza;
        }
        return zzbjjVar;
    }

    public final void zzb(zzbjj zzbjjVar) {
        synchronized (this) {
            this.zza = zzbjjVar;
        }
    }
}
