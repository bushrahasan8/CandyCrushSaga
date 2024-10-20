package com.google.common.math;

import java.math.RoundingMode;

/* loaded from: DoubleMath.class */
public abstract class DoubleMath {
    private static final double LN_2 = Math.log(2.0d);
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    /* loaded from: DoubleMath$1.class */
    public static abstract /* synthetic */ class AnonymousClass1 {
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
                com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                r0 = r4
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L14:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L1f:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L2a:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L35:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L71 java.lang.NoSuchFieldError -> L75
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L75
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L75
            L40:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L75 java.lang.NoSuchFieldError -> L79
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L4c:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L79 java.lang.NoSuchFieldError -> L7d
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L58:
                int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L81
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.DoubleMath.AnonymousClass1.m2587clinit():void");
        }
    }

    public static boolean isMathematicalInteger(double d) {
        return DoubleUtils.isFinite(d) && (d == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d)) <= Math.getExponent(d));
    }

    static double roundIntermediate(double d, RoundingMode roundingMode) {
        if (!DoubleUtils.isFinite(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        double d2 = d;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d));
                return d;
            case 2:
                double d3 = d;
                if (d < 0.0d) {
                    d3 = isMathematicalInteger(d) ? d : ((long) d) - 1;
                }
                return d3;
            case 3:
                double d4 = d;
                if (d > 0.0d) {
                    d4 = isMathematicalInteger(d) ? d : ((long) d) + 1;
                }
                return d4;
            case 4:
                break;
            case 5:
                if (!isMathematicalInteger(d)) {
                    d2 = ((long) d) + (d > 0.0d ? 1 : -1);
                    break;
                } else {
                    return d;
                }
            case 6:
                return Math.rint(d);
            case 7:
                double rint = Math.rint(d);
                return Math.abs(d - rint) == 0.5d ? d + Math.copySign(0.5d, d) : rint;
            case 8:
                double rint2 = Math.rint(d);
                return Math.abs(d - rint2) == 0.5d ? d : rint2;
            default:
                throw new AssertionError();
        }
        return d2;
    }

    public static long roundToLong(double d, RoundingMode roundingMode) {
        double roundIntermediate = roundIntermediate(d, roundingMode);
        boolean z = false;
        boolean z2 = (-9.223372036854776E18d) - roundIntermediate < 1.0d;
        if (roundIntermediate < 9.223372036854776E18d) {
            z = true;
        }
        MathPreconditions.checkInRangeForRoundingInputs(z2 & z, d, roundingMode);
        return (long) roundIntermediate;
    }
}
