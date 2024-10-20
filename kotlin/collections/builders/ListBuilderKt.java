package kotlin.collections.builders;

import com.ironsource.t2;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ListBuilderKt.class */
public abstract class ListBuilderKt {
    public static final /* synthetic */ boolean access$subarrayContentEquals(Object[] objArr, int i, int i2, List list) {
        return subarrayContentEquals(objArr, i, i2, list);
    }

    public static final /* synthetic */ int access$subarrayContentHashCode(Object[] objArr, int i, int i2) {
        return subarrayContentHashCode(objArr, i, i2);
    }

    public static final /* synthetic */ String access$subarrayContentToString(Object[] objArr, int i, int i2) {
        return subarrayContentToString(objArr, i, i2);
    }

    public static final Object[] arrayOfUninitializedElements(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final Object[] copyOfUninitializedElements(Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final void resetAt(Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i] = null;
    }

    public static final void resetRange(Object[] objArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i < i2) {
            resetAt(objArr, i);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subarrayContentEquals(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!Intrinsics.areEqual(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int subarrayContentHashCode(Object[] objArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subarrayContentToString(Object[] objArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append(t2.i.d);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i + i3]);
        }
        sb.append(t2.i.e);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
