package com.google.android.gms.internal.ads;

/* loaded from: zzgld.class */
public final class zzgld {
    public static final zzgld zza = new zzgld("ASSUME_AES_GCM");
    public static final zzgld zzb = new zzgld("ASSUME_XCHACHA20POLY1305");
    public static final zzgld zzc = new zzgld("ASSUME_CHACHA20POLY1305");
    public static final zzgld zzd = new zzgld("ASSUME_AES_CTR_HMAC");
    public static final zzgld zze = new zzgld("ASSUME_AES_EAX");
    public static final zzgld zzf = new zzgld("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgld(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
