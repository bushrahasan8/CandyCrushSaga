package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzfv.class */
public final class zzfv {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzfv() {
        this(10);
    }

    public zzfv(int i) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }

    private final Object zzf() {
        zzek.zzf(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i = this.zzc;
        Object obj = objArr[i];
        objArr[i] = null;
        this.zzc = (i + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final int zza() {
        int i;
        synchronized (this) {
            i = this.zzd;
        }
        return i;
    }

    public final Object zzb() {
        synchronized (this) {
            if (this.zzd == 0) {
                return null;
            }
            return zzf();
        }
    }

    public final Object zzc(long j) {
        Object obj;
        synchronized (this) {
            obj = null;
            while (this.zzd > 0 && j - this.zza[this.zzc] >= 0) {
                obj = zzf();
            }
        }
        return obj;
    }

    public final void zzd(long j, Object obj) {
        synchronized (this) {
            int i = this.zzd;
            if (i > 0) {
                int i2 = this.zzc;
                if (j <= this.zza[((i2 + i) - 1) % this.zzb.length]) {
                    zze();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i3 = length + length;
                long[] jArr = new long[i3];
                Object[] objArr = new Object[i3];
                int i4 = this.zzc;
                int i5 = length - i4;
                System.arraycopy(this.zza, i4, jArr, 0, i5);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i5);
                int i6 = this.zzc;
                if (i6 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i5, i6);
                    System.arraycopy(this.zzb, 0, objArr, i5, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i7 = this.zzc;
            int i8 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i7 + i8) % objArr2.length;
            this.zza[length2] = j;
            objArr2[length2] = obj;
            this.zzd = i8 + 1;
        }
    }

    public final void zze() {
        synchronized (this) {
            this.zzc = 0;
            this.zzd = 0;
            Arrays.fill(this.zzb, (Object) null);
        }
    }
}
