package kotlin.reflect;

import kotlin.jvm.functions.Function1;

/* loaded from: KMutableProperty0.class */
public interface KMutableProperty0 extends KProperty0, KProperty {

    /* loaded from: KMutableProperty0$Setter.class */
    public interface Setter extends KMutableProperty$Setter, Function1 {
    }

    /* renamed from: getSetter */
    Setter mo7271getSetter();

    void set(Object obj);
}
