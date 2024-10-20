package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: zzflt.class */
public final class zzflt {
    private final Executor zza;
    private final zzceh zzb;

    public zzflt(Executor executor, zzceh zzcehVar) {
        this.zza = executor;
        this.zzb = zzcehVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzfls
            public final zzflt zza;
            public final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb);
            }
        });
    }
}
