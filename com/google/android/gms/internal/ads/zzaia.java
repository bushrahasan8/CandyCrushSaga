package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: zzaia.class */
final class zzaia {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= 8) {
                i2 = -1;
                break;
            }
            i2 = i4 + 1;
            if ((zza[i4] & i) != 0) {
                break;
            }
            i3 = i2;
        }
        return i2;
    }

    public static long zzc(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        long j2 = j;
        if (z) {
            j2 = j & (zza[i - 1] ^ (-1));
        }
        for (int i2 = 1; i2 < i; i2++) {
            j2 = (j2 << 8) | (bArr[i2] & 255);
        }
        return j2;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzacv zzacvVar, boolean z, boolean z2, int i) throws IOException {
        if (this.zzc == 0) {
            if (!zzacvVar.zzn(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int zzb = zzb(this.zzb[0] & 255);
            this.zzd = zzb;
            if (zzb == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i2 = this.zzd;
        if (i2 > i) {
            this.zzc = 0;
            return -2L;
        }
        if (i2 != 1) {
            ((zzack) zzacvVar).zzn(this.zzb, 1, i2 - 1, false);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z2);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}
