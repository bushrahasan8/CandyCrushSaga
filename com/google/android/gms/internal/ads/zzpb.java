package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* loaded from: zzpb.class */
public final class zzpb {
    public static final zzpb zza;
    private final zzpa zzb;

    static {
        zza = zzfy.zza < 31 ? new zzpb() : new zzpb(zzpa.zza);
    }

    public zzpb() {
        zzek.zzf(zzfy.zza < 31);
        this.zzb = null;
    }

    public zzpb(LogSessionId logSessionId) {
        this.zzb = new zzpa(logSessionId);
    }

    private zzpb(zzpa zzpaVar) {
        this.zzb = zzpaVar;
    }

    public final LogSessionId zza() {
        zzpa zzpaVar = this.zzb;
        zzpaVar.getClass();
        return zzpaVar.zzb;
    }
}
