package kotlin.math;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: MathKt__MathJVMKt.class */
public abstract class MathKt__MathJVMKt extends MathKt__MathHKt {
    public static int roundToInt(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return d > 2.147483647E9d ? Integer.MAX_VALUE : d < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d);
    }

    public static int roundToInt(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long roundToLong(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }
}
