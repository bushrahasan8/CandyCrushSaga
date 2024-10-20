package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CollectionsKt__IteratorsKt.class */
abstract class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
    public static Iterator withIndex(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return new IndexingIterator(it);
    }
}
