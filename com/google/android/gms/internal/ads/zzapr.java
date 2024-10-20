package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: zzapr.class */
public final class zzapr {
    private final Executor zza;

    public zzapr(Handler handler) {
        this.zza = new zzapp(this, handler);
    }

    public final void zza(zzaqa zzaqaVar, zzaqj zzaqjVar) {
        zzaqaVar.zzm("post-error");
        ((zzapp) this.zza).zza.post(new zzapq(zzaqaVar, zzaqg.zza(zzaqjVar), null));
    }

    public final void zzb(zzaqa zzaqaVar, zzaqg zzaqgVar, Runnable runnable) {
        zzaqaVar.zzq();
        zzaqaVar.zzm("post-response");
        ((zzapp) this.zza).zza.post(new zzapq(zzaqaVar, zzaqgVar, runnable));
    }
}
