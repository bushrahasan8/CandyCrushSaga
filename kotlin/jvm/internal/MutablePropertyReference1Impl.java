package kotlin.jvm.internal;

/* loaded from: MutablePropertyReference1Impl.class */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        getGetter();
        throw null;
    }
}
