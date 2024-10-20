package com.google.android.gms.internal.ads;

/* loaded from: zzaec.class */
public final class zzaec {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzaec(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final int zza() {
        return (this.zzc * 8) + this.zzd;
    }

    public final int zzb(int i) {
        int i2 = this.zzc;
        int i3 = this.zzd;
        int i4 = i2 + 1;
        byte[] bArr = this.zza;
        int min = Math.min(i, 8 - i3);
        int i5 = ((bArr[i2] & 255) >> this.zzd) & (255 >> (8 - min));
        while (min < i) {
            i5 |= (this.zza[i4] & 255) << min;
            min += 8;
            i4++;
        }
        zzc(i);
        return i5 & ((-1) >>> (32 - i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (r6 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(int r6) {
        /*
            r5 = this;
            r0 = r5
            int r0 = r0.zzc
            r8 = r0
            r0 = r6
            r1 = 8
            int r0 = r0 / r1
            r7 = r0
            r0 = r8
            r1 = r7
            int r0 = r0 + r1
            r8 = r0
            r0 = r5
            r1 = r8
            r0.zzc = r1
            r0 = r5
            int r0 = r0.zzd
            r1 = r6
            r2 = r7
            r3 = 8
            int r2 = r2 * r3
            int r1 = r1 - r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r5
            r1 = r9
            r0.zzd = r1
            r0 = r8
            r7 = r0
            r0 = r9
            r6 = r0
            r0 = r9
            r1 = 7
            if (r0 <= r1) goto L46
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r7 = r0
            r0 = r5
            r1 = r7
            r0.zzc = r1
            r0 = r9
            r1 = 8
            int r0 = r0 - r1
            r6 = r0
            r0 = r5
            r1 = r6
            r0.zzd = r1
        L46:
            r0 = 0
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r7
            if (r0 < 0) goto L6f
            r0 = r5
            int r0 = r0.zzb
            r8 = r0
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L6c
            r0 = r11
            r10 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L6f
            r0 = r11
            r10 = r0
            r0 = r6
            if (r0 != 0) goto L6f
        L6c:
            r0 = 1
            r10 = r0
        L6f:
            r0 = r10
            com.google.android.gms.internal.ads.zzek.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaec.zzc(int):void");
    }

    public final boolean zzd() {
        byte b = this.zza[this.zzc];
        int i = this.zzd;
        zzc(1);
        return 1 == (((b & 255) >> i) & 1);
    }
}
