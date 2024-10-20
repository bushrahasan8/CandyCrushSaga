package com.google.android.gms.internal.ads;

/* loaded from: zzaom.class */
public final class zzaom {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzfp zzfpVar, int i, int i2) {
        zzfpVar.zzK(i);
        if (zzfpVar.zzb() < 5) {
            return -9223372036854775807L;
        }
        int zzg = zzfpVar.zzg();
        if ((8388608 & zzg) != 0 || ((zzg >> 8) & 8191) != i2 || (zzg & 32) == 0 || zzfpVar.zzm() < 7 || zzfpVar.zzb() < 7 || (zzfpVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzfpVar.zzG(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3];
        long j5 = bArr[4];
        long j6 = j4 & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j6 + j6) | ((j5 & 255) >> 7);
    }
}
