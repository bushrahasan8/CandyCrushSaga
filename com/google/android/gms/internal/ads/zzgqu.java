package com.google.android.gms.internal.ads;

/* loaded from: zzgqu.class */
public final class zzgqu {
    public static final zzgqu zza = new zzgqu("SHA1");
    public static final zzgqu zzb = new zzgqu("SHA224");
    public static final zzgqu zzc = new zzgqu("SHA256");
    public static final zzgqu zzd = new zzgqu("SHA384");
    public static final zzgqu zze = new zzgqu("SHA512");
    private final String zzf;

    private zzgqu(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
