package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: CollectionToArray.class */
public abstract class CollectionToArray {
    private static final Object[] EMPTY = new Object[0];

    public static final Object[] toArray(Collection collection) {
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 < objArr.length) {
                        objArr2 = objArr;
                        if (!it.hasNext()) {
                            objArr = Arrays.copyOf(objArr, i2);
                            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(result, size)");
                            break;
                        }
                        i = i2;
                        objArr = objArr2;
                    } else {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        int i4 = i3;
                        if (i3 <= i2) {
                            i4 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr, i4);
                        Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(result, newSize)");
                        i = i2;
                        objArr = objArr2;
                    }
                }
                return objArr;
            }
        }
        objArr = EMPTY;
        return objArr;
    }

    public static final Object[] toArray(Collection collection, Object[] objArr) {
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            objArr3 = objArr;
            if (objArr.length > 0) {
                objArr[0] = null;
                objArr3 = objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    objArr3 = objArr2;
                    int i2 = i + 1;
                    objArr3[i] = it.next();
                    if (i2 < objArr3.length) {
                        objArr4 = objArr3;
                        if (it.hasNext()) {
                            i = i2;
                            objArr2 = objArr4;
                        } else if (objArr3 == objArr) {
                            objArr[i2] = null;
                            objArr3 = objArr;
                        } else {
                            objArr3 = Arrays.copyOf(objArr3, i2);
                            Intrinsics.checkNotNullExpressionValue(objArr3, "copyOf(result, size)");
                        }
                    } else {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        int i4 = i3;
                        if (i3 <= i2) {
                            i4 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr4 = Arrays.copyOf(objArr3, i4);
                        Intrinsics.checkNotNullExpressionValue(objArr4, "copyOf(result, newSize)");
                        i = i2;
                        objArr2 = objArr4;
                    }
                }
            } else {
                objArr3 = objArr;
                if (objArr.length > 0) {
                    objArr[0] = null;
                    objArr3 = objArr;
                }
            }
        }
        return objArr3;
    }
}
