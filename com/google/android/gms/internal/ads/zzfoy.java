package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: zzfoy.class */
public final class zzfoy {
    private final zzfqk zza;
    private final String zzb;
    private final zzfok zzc;
    private final String zzd = "Ad overlay";

    public zzfoy(View view, zzfok zzfokVar, String str) {
        this.zza = new zzfqk(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfokVar;
    }

    public final zzfok zza() {
        return this.zzc;
    }

    public final zzfqk zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
