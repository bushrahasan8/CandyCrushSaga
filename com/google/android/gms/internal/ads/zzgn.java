package com.google.android.gms.internal.ads;

/* loaded from: zzgn.class */
public final class zzgn {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzgn(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i2;
        zzh();
    }

    private final int zzg() {
        int i = 0;
        int i2 = 0;
        while (!zzf()) {
            i2++;
        }
        if (i2 > 0) {
            i = zza(i2);
        }
        return ((1 << i2) - 1) + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3.zzd == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzh() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.zzc
            r5 = r0
            r0 = 0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r5
            if (r0 < 0) goto L2d
            r0 = r3
            int r0 = r0.zzb
            r4 = r0
            r0 = r5
            r1 = r4
            if (r0 < r1) goto L2b
            r0 = r7
            r6 = r0
            r0 = r5
            r1 = r4
            if (r0 != r1) goto L2d
            r0 = r7
            r6 = r0
            r0 = r3
            int r0 = r0.zzd
            if (r0 != 0) goto L2d
        L2b:
            r0 = 1
            r6 = r0
        L2d:
            r0 = r6
            com.google.android.gms.internal.ads.zzek.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgn.zzh():void");
    }

    private final boolean zzi(int i) {
        if (i < 2 || i >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0;
    }

    public final int zza(int i) {
        int i2;
        int i3;
        this.zzd += i;
        int i4 = 0;
        while (true) {
            i2 = this.zzd;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.zzd = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzc;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != zzi(i6 + 1)) {
                i3 = 1;
            }
            this.zzc = i6 + i3;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzc;
        byte b = bArr2[i7];
        if (i2 == 8) {
            this.zzd = 0;
            if (true != zzi(i7 + 1)) {
                i3 = 1;
            }
            this.zzc = i7 + i3;
        }
        zzh();
        return ((-1) >>> (32 - i)) & (i4 | ((b & 255) >> (8 - i2)));
    }

    public final int zzb() {
        int zzg = zzg();
        int i = 1;
        if (zzg % 2 == 0) {
            i = -1;
        }
        return i * ((zzg + 1) / 2);
    }

    public final int zzc() {
        return zzg();
    }

    public final void zzd() {
        int i = 1;
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 8) {
            this.zzd = 0;
            int i3 = this.zzc;
            if (true == zzi(i3 + 1)) {
                i = 2;
            }
            this.zzc = i3 + i;
        }
        zzh();
    }

    public final void zze(int i) {
        int i2 = this.zzc;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.zzc = i4;
        int i5 = this.zzd + (i - (i3 * 8));
        this.zzd = i5;
        int i6 = i2;
        if (i5 > 7) {
            this.zzc = i4 + 1;
            this.zzd = i5 - 8;
            i6 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            if (i7 > this.zzc) {
                zzh();
                return;
            }
            i6 = i7;
            if (zzi(i7)) {
                this.zzc++;
                i6 = i7 + 2;
            }
        }
    }

    public final boolean zzf() {
        byte b = this.zza[this.zzc];
        int i = this.zzd;
        zzd();
        return (b & (128 >> i)) != 0;
    }
}
