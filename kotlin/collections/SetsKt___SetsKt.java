package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: SetsKt___SetsKt.class */
public abstract class SetsKt___SetsKt extends SetsKt__SetsKt {
    public static Set minus(Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = z;
            boolean z3 = true;
            if (!z) {
                z2 = z;
                z3 = true;
                if (Intrinsics.areEqual(obj2, obj)) {
                    z2 = true;
                    z3 = false;
                }
            }
            z = z2;
            if (z3) {
                linkedHashSet.add(obj2);
                z = z2;
            }
        }
        return linkedHashSet;
    }

    public static Set plus(Set set, Iterable elements) {
        int size;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer collectionSizeOrNull = CollectionsKt__IterablesKt.collectionSizeOrNull(elements);
        if (collectionSizeOrNull != null) {
            size = set.size() + collectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(size));
        linkedHashSet.addAll(set);
        CollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set plus(Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
