package com.google.android.gms.games.internal;

/* loaded from: zzar.class */
public final class zzar {
    private static final zzar zza = new zzar();
    private volatile boolean zzb = false;

    zzar() {
    }

    public static zzar zza() {
        return zza;
    }

    public final void zzb() {
        this.zzb = true;
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
