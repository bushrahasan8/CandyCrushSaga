package com.google.android.gms.internal.ads;

/* loaded from: zzado.class */
public final class zzado {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        boolean zzm;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int i6;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int[] iArr5;
        int i8;
        int[] iArr6;
        zzm = zzadp.zzm(i);
        if (!zzm || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = i4 - 1;
        this.zza = i2;
        strArr = zzadp.zza;
        this.zzb = strArr[3 - i3];
        iArr = zzadp.zzb;
        int i10 = iArr[i5];
        this.zzd = i10;
        if (i2 == 2) {
            i6 = i10 / 2;
            this.zzd = i6;
        } else {
            i6 = i10;
            if (i2 == 0) {
                i6 = i10 / 4;
                this.zzd = i6;
            }
        }
        int i11 = (i >>> 9) & 1;
        zzl = zzadp.zzl(i2, i3);
        this.zzg = zzl;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = zzadp.zzc;
                i8 = iArr6[i9];
            } else {
                iArr5 = zzadp.zzd;
                i8 = iArr5[i9];
            }
            this.zzf = i8;
            this.zzc = (((i8 * 12) / i6) + i11) * 4;
        } else {
            int i12 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = zzadp.zze;
                    i7 = iArr4[i9];
                } else {
                    iArr3 = zzadp.zzf;
                    i7 = iArr3[i9];
                }
                this.zzf = i7;
                this.zzc = ((i7 * 144) / i6) + i11;
            } else {
                iArr2 = zzadp.zzg;
                int i13 = iArr2[i9];
                this.zzf = i13;
                if (i3 == 1) {
                    i12 = 72;
                }
                this.zzc = ((i12 * i13) / i6) + i11;
            }
        }
        int i14 = 2;
        if (((i >> 6) & 3) == 3) {
            i14 = 1;
        }
        this.zze = i14;
        return true;
    }
}
