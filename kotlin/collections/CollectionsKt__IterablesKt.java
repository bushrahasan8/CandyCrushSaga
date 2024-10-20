package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CollectionsKt__IterablesKt.class */
public abstract class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {
    public static int collectionSizeOrDefault(Iterable iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        return i;
    }

    public static final Integer collectionSizeOrNull(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
    }
}
