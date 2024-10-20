package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzgmn.class */
public final class zzgmn {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i >= length) {
                long j6 = j + (j5 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j2 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j3 + ((j10 >> 26) * 5);
                long j13 = j12 & 67108863;
                long j14 = j13 + 5;
                long j15 = (j5 & 67108863) + (j12 >> 26);
                long j16 = j15 + (j14 >> 26);
                long j17 = (j16 >> 26) + j7;
                long j18 = j9 + (j17 >> 26);
                long j19 = (j11 + (j18 >> 26)) - 67108864;
                long j20 = j19 >> 63;
                long j21 = j20 ^ (-1);
                long j22 = (j15 & j20) | (j16 & 67108863 & j21);
                long j23 = (j7 & j20) | (j17 & 67108863 & j21);
                long j24 = (j9 & j20) | (j18 & 67108863 & j21);
                long zzc = (((j20 & j13) | (j14 & 67108863 & j21) | (j22 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = zzc(bArr, 20);
                long zzc3 = zzc(bArr, 24);
                long zzc4 = zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                long j25 = (((j22 >> 6) | (j23 << 20)) & 4294967295L) + zzc2 + (zzc >> 32);
                zzd(bArr4, j25 & 4294967295L, 4);
                long j26 = (((j23 >> 12) | (j24 << 14)) & 4294967295L) + zzc3 + (j25 >> 32);
                zzd(bArr4, j26 & 4294967295L, 8);
                zzd(bArr4, ((((j24 >> 18) | (((j11 & j20) | (j19 & j21)) << 8)) & 4294967295L) + zzc4 + (j26 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i);
            System.arraycopy(bArr2, i, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long j27 = zzb5 * 5;
            long j28 = zzb4 * 5;
            long j29 = zzb3 * 5;
            long zzb6 = j3 + zzb(bArr3, 0, 0);
            long zzb7 = j5 + zzb(bArr3, 3, 2);
            long zzb8 = j + zzb(bArr3, 6, 4);
            long zzb9 = j2 + zzb(bArr3, 9, 6);
            long zzb10 = j4 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
            long j30 = (zzb6 * zzb) + (zzb7 * j27) + (zzb8 * j28) + (zzb9 * j29) + (zzb2 * 5 * zzb10);
            long j31 = (zzb6 * zzb2) + (zzb7 * zzb) + (zzb8 * j27) + (zzb9 * j28) + (j29 * zzb10) + (j30 >> 26);
            long j32 = (zzb6 * zzb3) + (zzb7 * zzb2) + (zzb8 * zzb) + (zzb9 * j27) + (j28 * zzb10) + (j31 >> 26);
            long j33 = (zzb6 * zzb4) + (zzb7 * zzb3) + (zzb8 * zzb2) + (zzb9 * zzb) + (zzb10 * j27) + (j32 >> 26);
            long j34 = (zzb6 * zzb5) + (zzb7 * zzb4) + (zzb8 * zzb3) + (zzb9 * zzb2) + (zzb10 * zzb) + (j33 >> 26);
            long j35 = (j30 & 67108863) + ((j34 >> 26) * 5);
            j5 = (j31 & 67108863) + (j35 >> 26);
            i += 16;
            j = j32 & 67108863;
            j2 = j33 & 67108863;
            j4 = j34 & 67108863;
            j3 = j35 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        byte b = bArr[i];
        return (((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (b & 255) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
