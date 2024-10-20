package com.google.android.gms.internal.ads;

/* loaded from: zzgcl.class */
public final class zzgcl {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (java.lang.Math.abs(r5 - r0) == 0.5d) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zza(double r5, java.math.RoundingMode r7) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcl.zza(double, java.math.RoundingMode):long");
    }

    public static boolean zzb(double d) {
        boolean z = false;
        if (zzgcm.zza(d)) {
            if (d != 0.0d) {
                zzfxe.zzf(zzgcm.zza(d), "not a normal value");
                int exponent = Math.getExponent(d);
                long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d)) {
                    return true;
                }
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }
}
