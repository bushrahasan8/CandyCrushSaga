package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzcst.class */
public final class zzcst implements zzbng {
    final zzcsw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcst(zzcsw zzcswVar) {
        this.zza = zzcswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcsw.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcss
                public final zzcst zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzctb zzctbVar;
                    zzctbVar = this.zza.zza.zzd;
                    zzctbVar.zzg();
                }
            });
        }
    }
}
