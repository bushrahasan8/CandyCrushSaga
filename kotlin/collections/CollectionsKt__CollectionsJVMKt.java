package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CollectionsKt__CollectionsJVMKt.class */
public abstract class CollectionsKt__CollectionsJVMKt {
    public static List build(List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    public static final Object[] copyToArrayOfAny(Object[] objArr, boolean z) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (!z || !Intrinsics.areEqual(objArr.getClass(), Object[].class)) {
            objArr = Arrays.copyOf(objArr, objArr.length, Object[].class);
            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, this.size, Array<Any?>::class.java)");
        }
        return objArr;
    }

    public static List createListBuilder() {
        return new ListBuilder();
    }

    public static List listOf(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(element)");
        return singletonList;
    }
}
