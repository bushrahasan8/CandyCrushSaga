package kotlin.coroutines.jvm.internal;

/* loaded from: Boxing.class */
public abstract class Boxing {
    public static final Boolean boxBoolean(boolean z) {
        return Boolean.valueOf(z);
    }

    public static final Double boxDouble(double d) {
        return new Double(d);
    }

    public static final Integer boxInt(int i) {
        return new Integer(i);
    }

    public static final Long boxLong(long j) {
        return new Long(j);
    }
}
