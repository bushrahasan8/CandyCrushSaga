package kotlin.internal;

/* loaded from: ProgressionUtilKt.class */
public abstract class ProgressionUtilKt {
    private static final int differenceModulo(int i, int i2, int i3) {
        return mod(mod(i, i3) - mod(i2, i3), i3);
    }

    private static final long differenceModulo(long j, long j2, long j3) {
        return mod(mod(j, j3) - mod(j2, j3), j3);
    }

    public static final int getProgressionLastElement(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                i2 -= differenceModulo(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                i2 += differenceModulo(i, i2, -i3);
            }
        }
        return i2;
    }

    public static final long getProgressionLastElement(long j, long j2, long j3) {
        if (j3 > 0) {
            if (j < j2) {
                j2 -= differenceModulo(j2, j, j3);
            }
        } else {
            if (j3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j2) {
                j2 += differenceModulo(j, j2, -j3);
            }
        }
        return j2;
    }

    private static final int mod(int i, int i2) {
        int i3 = i % i2;
        if (i3 < 0) {
            i3 += i2;
        }
        return i3;
    }

    private static final long mod(long j, long j2) {
        long j3 = j % j2;
        if (j3 < 0) {
            j3 += j2;
        }
        return j3;
    }
}
