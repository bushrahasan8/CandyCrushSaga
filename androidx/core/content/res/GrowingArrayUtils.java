package androidx.core.content.res;

import java.lang.reflect.Array;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: GrowingArrayUtils.class */
public abstract class GrowingArrayUtils {
    public static int[] append(int[] iArr, int i, int i2) {
        int[] iArr2 = iArr;
        if (i + 1 > iArr.length) {
            iArr2 = new int[growSize(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
        }
        iArr2[i] = i2;
        return iArr2;
    }

    public static Object[] append(Object[] objArr, int i, Object obj) {
        Object[] objArr2 = objArr;
        if (i + 1 > objArr.length) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), growSize(i));
            System.arraycopy(objArr, 0, objArr2, 0, i);
        }
        objArr2[i] = obj;
        return objArr2;
    }

    public static int growSize(int i) {
        return i <= 4 ? 8 : i * 2;
    }
}
