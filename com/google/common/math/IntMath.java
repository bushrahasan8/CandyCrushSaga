package com.google.common.math;

import com.google.android.gms.drive.ExecutionOptions;
import com.ironsource.t2;

/* loaded from: IntMath.class */
public abstract class IntMath {
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, t2.z, 10000000, 100000000, 1000000000};
    static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
    /* loaded from: IntMath$1.class */
    static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$java$math$RoundingMode;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x007d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                r0 = r4
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L14:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L1f:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L2a:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L35:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L71 java.lang.NoSuchFieldError -> L75
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L75
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L75
            L40:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L75 java.lang.NoSuchFieldError -> L79
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L4c:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L79 java.lang.NoSuchFieldError -> L7d
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L58:
                int[] r0 = com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L81
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L81
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L81
            L64:
                return
            L65:
                r4 = move-exception
                goto L14
            L69:
                r4 = move-exception
                goto L1f
            L6d:
                r4 = move-exception
                goto L2a
            L71:
                r4 = move-exception
                goto L35
            L75:
                r4 = move-exception
                goto L40
            L79:
                r4 = move-exception
                goto L4c
            L7d:
                r4 = move-exception
                goto L58
            L81:
                r4 = move-exception
                goto L64
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.IntMath.AnonymousClass1.m2589clinit():void");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if ((r5 & r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r0 > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r0 > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        if (r0 < 0) goto L35;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0038. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int divide(int r4, int r5, java.math.RoundingMode r6) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.IntMath.divide(int, int, java.math.RoundingMode):int");
    }
}
