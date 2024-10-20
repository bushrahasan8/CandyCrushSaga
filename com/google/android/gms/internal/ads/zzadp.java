package com.google.android.gms.internal.ads;

/* loaded from: zzadp.class */
public final class zzadp {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i4 - 1;
        int i8 = zzb[i5];
        if (i2 == 2) {
            i6 = i8 / 2;
        } else {
            i6 = i8;
            if (i2 == 0) {
                i6 = i8 / 4;
            }
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? zzc[i7] : zzd[i7]) * 12) / i6) + i9) * 4;
        }
        int i10 = i2 == 3 ? i3 == 2 ? zze[i7] : zzf[i7] : zzg[i7];
        int i11 = 144;
        if (i2 == 3) {
            return ((i10 * 144) / i6) + i9;
        }
        if (i3 == 1) {
            i11 = 72;
        }
        return ((i11 * i10) / i6) + i9;
    }

    public static int zzc(int i) {
        int i2;
        int i3;
        int i4;
        if (!zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || ((i >>> 10) & 3) == 3) {
            return -1;
        }
        return zzl(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? 384 : 1152 : i == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i) {
        return (i & (-2097152)) == -2097152;
    }
}
