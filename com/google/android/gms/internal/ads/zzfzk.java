package com.google.android.gms.internal.ads;

/* loaded from: zzfzk.class */
final class zzfzk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int zzb = zzfzs.zzb(obj);
        int i4 = zzb & i;
        int zzc = zzc(obj3, i4);
        if (zzc == 0) {
            return -1;
        }
        int i5 = i ^ (-1);
        int i6 = -1;
        while (true) {
            i2 = i6;
            i3 = zzc - 1;
            int i7 = iArr[i3];
            zzc = i7 & i;
            if ((i7 & i5) != (zzb & i5) || !zzfwy.zza(obj, objArr[i3]) || (objArr2 != null && !zzfwy.zza(obj2, objArr2[i3]))) {
                if (zzc == 0) {
                    return -1;
                }
                i6 = i3;
            }
        }
        if (i2 == -1) {
            zze(obj3, i4, zzc);
        } else {
            iArr[i2] = (iArr[i2] & i5) | (zzc & i);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzd(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
