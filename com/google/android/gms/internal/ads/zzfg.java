package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzfg.class */
public final class zzfg {
    private int zza;
    private long[] zzb;

    public zzfg() {
        this(32);
    }

    public zzfg(int i) {
        this.zzb = new long[32];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i) {
        if (i >= 0 && i < this.zza) {
            return this.zzb[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.zza);
    }

    public final void zzc(long j) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i2 = this.zza;
        this.zza = i2 + 1;
        jArr2[i2] = j;
    }
}
