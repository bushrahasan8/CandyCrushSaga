package kotlin.jvm.internal;

import java.util.Iterator;

/* loaded from: ArrayIteratorKt.class */
public abstract class ArrayIteratorKt {
    public static final Iterator iterator(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayIterator(array);
    }
}
