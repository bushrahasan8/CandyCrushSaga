package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: zzdv.class */
final class zzdv {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzdv(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.zzb * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] zzl = zzl(this.zzl, this.zzm, i2);
        this.zzl = zzl;
        int i3 = this.zzm;
        int i4 = this.zzb;
        System.arraycopy(sArr, i * i4, zzl, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if ((r0 + r0) <= (r9.zzt * 3)) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk() {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdv.zzk():void");
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i = this.zzm - min;
        this.zzm = i;
        int i2 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        float f = i2;
        int i3 = this.zzm;
        float f2 = this.zzo;
        float f3 = this.zzc;
        float f4 = this.zze;
        float f5 = this.zzd;
        int i4 = i3 + ((int) ((((f / (f3 / f5)) + f2) / (f4 * f5)) + 0.5f));
        int i5 = this.zzh;
        this.zzj = zzl(this.zzj, i2, i5 + i5 + i2);
        int i6 = 0;
        while (true) {
            int i7 = this.zzh;
            int i8 = this.zzb;
            i = i7 + i7;
            if (i6 >= i * i8) {
                break;
            }
            this.zzj[(i8 * i2) + i6] = 0;
            i6++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i4) {
            this.zzm = i4;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] zzl = zzl(this.zzj, this.zzk, i2);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }
}
