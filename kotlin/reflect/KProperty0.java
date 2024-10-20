package kotlin.reflect;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* loaded from: KProperty0.class */
public interface KProperty0 extends KProperty, Function0 {

    /* loaded from: KProperty0$Getter.class */
    public interface Getter extends KProperty.Getter, Function0 {
    }

    Object get();

    Object getDelegate();

    /* renamed from: getGetter */
    Getter mo7270getGetter();
}
