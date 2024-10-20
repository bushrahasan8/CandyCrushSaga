package kotlin;

/* loaded from: KotlinVersionCurrentValue.class */
final class KotlinVersionCurrentValue {
    public static final KotlinVersionCurrentValue INSTANCE = new KotlinVersionCurrentValue();

    private KotlinVersionCurrentValue() {
    }

    public static final KotlinVersion get() {
        return new KotlinVersion(1, 8, 21);
    }
}
