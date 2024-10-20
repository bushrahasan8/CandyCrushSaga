package kotlin.reflect;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: KProperty1.class */
public interface KProperty1 extends KProperty, Function1 {

    /* loaded from: KProperty1$Getter.class */
    public interface Getter extends KProperty.Getter, Function1 {
    }

    Object get(Object obj);

    Getter getGetter();
}
