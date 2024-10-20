package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzdj.class */
public final class zzdj {
    public final int zzb;
    private final zzcz zzg;
    private final int[] zzh;
    private final boolean[] zzi;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdi
    };

    public zzdj(zzcz zzczVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzczVar.zzb;
        this.zzb = 1;
        this.zzg = zzczVar;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdj.class != obj.getClass()) {
            return false;
        }
        zzdj zzdjVar = (zzdj) obj;
        return this.zzg.equals(zzdjVar.zzg) && Arrays.equals(this.zzh, zzdjVar.zzh) && Arrays.equals(this.zzi, zzdjVar.zzi);
    }

    public final int hashCode() {
        return (((this.zzg.hashCode() * 961) + Arrays.hashCode(this.zzh)) * 31) + Arrays.hashCode(this.zzi);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzam zzb(int i) {
        return this.zzg.zzb(0);
    }

    public final boolean zzc() {
        boolean z;
        boolean[] zArr = this.zzi;
        int length = zArr.length;
        int i = 0;
        while (true) {
            z = false;
            if (i >= length) {
                break;
            }
            if (zArr[i]) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    public final boolean zzd(int i) {
        return this.zzi[0];
    }
}
