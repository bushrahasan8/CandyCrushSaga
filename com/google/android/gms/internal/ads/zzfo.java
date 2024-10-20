package com.google.android.gms.internal.ads;

/* loaded from: zzfo.class */
public final class zzfo {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzfo() {
        this.zza = zzfy.zzf;
    }

    public zzfo(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3.zzc == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzp() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.zzb
            r4 = r0
            r0 = 0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 < 0) goto L2d
            r0 = r3
            int r0 = r0.zzd
            r5 = r0
            r0 = r4
            r1 = r5
            if (r0 < r1) goto L2b
            r0 = r7
            r6 = r0
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L2d
            r0 = r7
            r6 = r0
            r0 = r3
            int r0 = r0.zzc
            if (r0 != 0) goto L2d
        L2b:
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            com.google.android.gms.internal.ads.zzek.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.zzp():void");
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        zzek.zzf(this.zzc == 0);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i) {
        int i2;
        int i3;
        if (i == 0) {
            return 0;
        }
        this.zzc += i;
        int i4 = 0;
        while (true) {
            i2 = i4;
            i3 = this.zzc;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.zzc = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzb;
            this.zzb = i6 + 1;
            i4 = i2 | ((bArr[i6] & 255) << i5);
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzb;
        byte b = bArr2[i7];
        if (i3 == 8) {
            this.zzc = 0;
            this.zzb = i7 + 1;
        }
        zzp();
        return ((-1) >>> (32 - i)) & (i2 | ((b & 255) >> (8 - i3)));
    }

    public final void zze() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzp();
    }

    public final void zzf(int i, int i2) {
        int min = Math.min(8 - this.zzc, 14);
        int i3 = this.zzc;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.zza;
        int i5 = this.zzb;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - min;
        int i7 = i & 16383;
        bArr[i5] = (byte) (b | ((i7 >>> i6) << i4));
        int i8 = i6;
        int i9 = i5 + 1;
        while (i8 > 8) {
            i8 -= 8;
            this.zza[i9] = (byte) (i7 >>> i8);
            i9++;
        }
        int i10 = 8 - i8;
        byte[] bArr2 = this.zza;
        byte b2 = (byte) (bArr2[i9] & ((1 << i10) - 1));
        bArr2[i9] = b2;
        bArr2[i9] = (byte) (((i7 & ((1 << i8) - 1)) << i10) | b2);
        zzm(14);
        zzp();
    }

    public final void zzg(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i5 = this.zzb;
            int i6 = i5 + 1;
            this.zzb = i6;
            byte b = bArr2[i5];
            int i7 = this.zzc;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((bArr2[i6] & 255) >> (8 - i7)) | b2);
            i4++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.zzc;
        byte b4 = b3;
        int i10 = i9;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            byte b5 = (byte) (b3 | ((bArr3[i11] & 255) << i9));
            bArr[i3] = b5;
            i10 = i9 - 8;
            b4 = b5;
        }
        int i12 = i10 + i8;
        this.zzc = i12;
        byte[] bArr4 = this.zza;
        int i13 = this.zzb;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i8))) | b4);
        if (i12 == 8) {
            this.zzc = 0;
            this.zzb = i13 + 1;
        }
        zzp();
    }

    public final void zzh(byte[] bArr, int i, int i2) {
        zzek.zzf(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i2);
        this.zzb += i2;
        zzp();
    }

    public final void zzi(zzfp zzfpVar) {
        zzj(zzfpVar.zzM(), zzfpVar.zze());
        zzk(zzfpVar.zzd() * 8);
    }

    public final void zzj(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i;
    }

    public final void zzk(int i) {
        int i2 = i / 8;
        this.zzb = i2;
        this.zzc = i - (i2 * 8);
        zzp();
    }

    public final void zzl() {
        int i = this.zzc + 1;
        this.zzc = i;
        if (i == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzp();
    }

    public final void zzm(int i) {
        int i2 = i / 8;
        int i3 = this.zzb + i2;
        this.zzb = i3;
        int i4 = this.zzc + (i - (i2 * 8));
        this.zzc = i4;
        if (i4 > 7) {
            this.zzb = i3 + 1;
            this.zzc = i4 - 8;
        }
        zzp();
    }

    public final void zzn(int i) {
        zzek.zzf(this.zzc == 0);
        this.zzb += i;
        zzp();
    }

    public final boolean zzo() {
        byte b = this.zza[this.zzb];
        int i = this.zzc;
        zzl();
        return (b & (128 >> i)) != 0;
    }
}
