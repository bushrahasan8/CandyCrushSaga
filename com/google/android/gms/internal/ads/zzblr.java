package com.google.android.gms.internal.ads;

/* loaded from: zzblr.class */
public final class zzblr {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private zzbkh zzc;

    public zzblr(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    public final zzbkh zzf(zzbkg zzbkgVar) {
        synchronized (this) {
            zzbkh zzbkhVar = this.zzc;
            if (zzbkhVar != null) {
                return zzbkhVar;
            }
            zzbkh zzbkhVar2 = new zzbkh(zzbkgVar);
            this.zzc = zzbkhVar2;
            return zzbkhVar2;
        }
    }

    public final zzbkq zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzblo(this, null);
    }

    public final zzbkt zzd() {
        return new zzblq(this, null);
    }
}
