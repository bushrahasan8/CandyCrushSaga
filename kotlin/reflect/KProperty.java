package kotlin.reflect;

/* loaded from: KProperty.class */
public interface KProperty extends KCallable {

    /* loaded from: KProperty$Getter.class */
    public interface Getter extends KFunction {
    }

    boolean isConst();

    boolean isLateinit();
}
