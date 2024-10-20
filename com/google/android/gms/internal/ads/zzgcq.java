package com.google.android.gms.internal.ads;

/* loaded from: zzgcq.class */
public final class zzgcq {
    private static final long[][] zza = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r0 > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (r0 < 0) goto L26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0035. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zza(long r7, long r9, java.math.RoundingMode r11) {
        /*
            r0 = r11
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            r1 = r9
            long r0 = r0 / r1
            r14 = r0
            r0 = r7
            r1 = r9
            r2 = r14
            long r1 = r1 * r2
            long r0 = r0 - r1
            r16 = r0
            r0 = r16
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
            goto Lbf
        L1d:
            int[] r0 = com.google.android.gms.internal.ads.zzgcp.zza
            r1 = r11
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r13 = r0
            r0 = r7
            r1 = r9
            long r0 = r0 ^ r1
            r1 = 63
            long r0 = r0 >> r1
            int r0 = (int) r0
            r1 = 1
            r0 = r0 | r1
            r12 = r0
            r0 = r13
            switch(r0) {
                case 1: goto Lbb;
                case 2: goto Lbf;
                case 3: goto Laf;
                case 4: goto Lb4;
                case 5: goto La7;
                case 6: goto L6c;
                case 7: goto L6c;
                case 8: goto L6c;
                default: goto L64;
            }
        L64:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L6c:
            r0 = r16
            long r0 = java.lang.Math.abs(r0)
            r7 = r0
            r0 = r7
            r1 = r9
            long r1 = java.lang.Math.abs(r1)
            r2 = r7
            long r1 = r1 - r2
            long r0 = r0 - r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L9f
            r0 = r11
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP
            if (r0 == r1) goto Lb4
            r0 = r11
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            if (r0 != r1) goto Lbf
            r0 = 1
            r1 = r14
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lbf
            goto Lb4
        L9f:
            r0 = r13
            if (r0 <= 0) goto Lbf
            goto Lb4
        La7:
            r0 = r12
            if (r0 <= 0) goto Lbf
            goto Lb4
        Laf:
            r0 = r12
            if (r0 >= 0) goto Lbf
        Lb4:
            r0 = r14
            r1 = r12
            long r1 = (long) r1
            long r0 = r0 + r1
            return r0
        Lbb:
            r0 = 0
            com.google.android.gms.internal.ads.zzgcr.zzb(r0)
        Lbf:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcq.zza(long, long, java.math.RoundingMode):long");
    }

    public static long zzb(long j, long j2) {
        zzgcr.zza("a", j);
        zzgcr.zza("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        long j5 = j3;
        while (j5 != j4) {
            long j6 = j5 - j4;
            long j7 = (j6 >> 63) & j6;
            long j8 = (j6 - j7) - j7;
            j5 = j8 >> Long.numberOfTrailingZeros(j8);
            j4 += j7;
        }
        return j5 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long zzc(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(j2 ^ (-1));
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        boolean z = false;
        boolean z2 = numberOfLeadingZeros < 64;
        boolean z3 = j < 0;
        if (j2 == Long.MIN_VALUE) {
            z = true;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (z2 || (z & z3)) {
            return j3;
        }
        long j4 = j * j2;
        return (j == 0 || j4 / j == j2) ? j4 : j3;
    }
}
