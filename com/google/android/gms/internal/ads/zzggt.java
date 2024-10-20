package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzggt.class */
public final class zzggt {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zzgvz zzd;
    private final int zze;
    private final String zzf;
    private final zzggc zzg;
    private final int zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzggt(Object obj, Object obj2, byte[] bArr, int i, zzgvz zzgvzVar, int i2, String str, zzggc zzggcVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i;
        this.zzd = zzgvzVar;
        this.zze = i2;
        this.zzf = str;
        this.zzg = zzggcVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzggc zzb() {
        return this.zzg;
    }

    public final zzgvz zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
