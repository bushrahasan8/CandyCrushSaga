package com.google.android.gms.internal.ads;

/* loaded from: zzgcr.class */
final class zzgcr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zza(String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
