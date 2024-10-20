package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: zzcvw.class */
public final class zzcvw implements zzdcl, zzayq {
    private final zzfgm zza;
    private final zzdbp zzb;
    private final zzdcu zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcvw(zzfgm zzfgmVar, zzdbp zzdbpVar, zzdcu zzdcuVar) {
        this.zza = zzfgmVar;
        this.zzb = zzdbpVar;
        this.zzc = zzdcuVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzby(zzayp zzaypVar) {
        if (this.zza.zzf == 1 && zzaypVar.zzj) {
            zza();
        }
        if (zzaypVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        synchronized (this) {
            if (this.zza.zzf != 1) {
                zza();
            }
        }
    }
}
