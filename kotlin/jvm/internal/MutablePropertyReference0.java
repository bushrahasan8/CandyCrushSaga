package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty$Setter;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;

/* loaded from: MutablePropertyReference0.class */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.mutableProperty0(this);
    }

    @Override // kotlin.reflect.KProperty0
    public Object getDelegate() {
        return ((KMutableProperty0) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ KProperty.Getter getGetter() {
        mo7270getGetter();
        return null;
    }

    @Override // kotlin.reflect.KProperty0
    /* renamed from: getGetter, reason: collision with other method in class */
    public KProperty0.Getter mo7270getGetter() {
        ((KMutableProperty0) getReflected()).mo7270getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ KMutableProperty$Setter getSetter() {
        mo7271getSetter();
        return null;
    }

    @Override // kotlin.reflect.KMutableProperty0
    /* renamed from: getSetter, reason: collision with other method in class */
    public KMutableProperty0.Setter mo7271getSetter() {
        ((KMutableProperty0) getReflected()).mo7271getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }
}
