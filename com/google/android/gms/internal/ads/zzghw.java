package com.google.android.gms.internal.ads;

/* loaded from: zzghw.class */
public final class zzghw {
    public static final zzghw zza = new zzghw("SHA1");
    public static final zzghw zzb = new zzghw("SHA224");
    public static final zzghw zzc = new zzghw("SHA256");
    public static final zzghw zzd = new zzghw("SHA384");
    public static final zzghw zze = new zzghw("SHA512");
    private final String zzf;

    private zzghw(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
