package com.google.android.gms.internal.ads;

/* loaded from: zzgxr.class */
public final class zzgxr {
    private final zzgxq zza;

    private zzgxr(zzgxq zzgxqVar) {
        this.zza = zzgxqVar;
    }

    public static zzgxr zzb(byte[] bArr, zzghc zzghcVar) {
        return new zzgxr(zzgxq.zzb(bArr));
    }

    public static zzgxr zzc(int i) {
        return new zzgxr(zzgxq.zzb(zzgpa.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzghc zzghcVar) {
        return this.zza.zzc();
    }
}
