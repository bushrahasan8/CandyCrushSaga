package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* loaded from: zzawm.class */
public final class zzawm {
    public static final int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static long zza(double d, int i, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            char[] cArr2 = zzb;
            char c = cArr2[(b & 255) >>> 4];
            int i2 = i + i;
            cArr[i2] = c;
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean zzc() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzd(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] zzf(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
