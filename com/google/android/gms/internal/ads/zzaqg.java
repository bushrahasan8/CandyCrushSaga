package com.google.android.gms.internal.ads;

/* loaded from: zzaqg.class */
public final class zzaqg {
    public final Object zza;
    public final zzapj zzb;
    public final zzaqj zzc;
    public boolean zzd;

    private zzaqg(zzaqj zzaqjVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaqjVar;
    }

    private zzaqg(Object obj, zzapj zzapjVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzapjVar;
        this.zzc = null;
    }

    public static zzaqg zza(zzaqj zzaqjVar) {
        return new zzaqg(zzaqjVar);
    }

    public static zzaqg zzb(Object obj, zzapj zzapjVar) {
        return new zzaqg(obj, zzapjVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
