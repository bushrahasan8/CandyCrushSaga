package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* loaded from: zzfjr.class */
public final class zzfjr {
    private final zzfiv zza;
    private final zzfjp zzb;
    private final zzfir zzc;
    private zzfjx zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfjr(zzfiv zzfivVar, zzfir zzfirVar, zzfjp zzfjpVar) {
        this.zza = zzfivVar;
        this.zzc = zzfirVar;
        this.zzb = zzfjpVar;
        zzfirVar.zzb(new zzfjm(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgp)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zzh()) {
                this.zzd.clear();
                return;
            }
            if (zzi()) {
                while (!this.zzd.isEmpty()) {
                    zzfjq zzfjqVar = (zzfjq) this.zzd.pollFirst();
                    if (zzfjqVar == null || (zzfjqVar.zza() != null && this.zza.zze(zzfjqVar.zza()))) {
                        zzfjx zzfjxVar = new zzfjx(this.zza, this.zzb, zzfjqVar);
                        this.zze = zzfjxVar;
                        zzfjxVar.zzd(new zzfjn(this, zzfjqVar));
                        return;
                    }
                }
            }
        }
    }

    private final boolean zzi() {
        zzfjx zzfjxVar;
        synchronized (this) {
            zzfjxVar = this.zze;
        }
        return zzfjxVar == null;
    }

    public final ListenableFuture zza(zzfjq zzfjqVar) {
        synchronized (this) {
            this.zzf = 2;
            if (zzi()) {
                return null;
            }
            return this.zze.zza(zzfjqVar);
        }
    }

    public final void zze(zzfjq zzfjqVar) {
        synchronized (this) {
            this.zzd.add(zzfjqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
