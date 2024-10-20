package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: MapsKt__MapsKt.class */
public abstract class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    public static Map emptyMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        Intrinsics.checkNotNull(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static Object getValue(Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return MapsKt__MapWithDefaultKt.getOrImplicitDefaultNullable(map, obj);
    }

    public static HashMap hashMapOf(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap hashMap = new HashMap(MapsKt.mapCapacity(pairs.length));
        putAll(hashMap, pairs);
        return hashMap;
    }

    public static Map mapOf(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return pairs.length > 0 ? toMap(pairs, new LinkedHashMap(MapsKt.mapCapacity(pairs.length))) : MapsKt.emptyMap();
    }

    public static Map minus(Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map mutableMap = MapsKt.toMutableMap(map);
        mutableMap.remove(obj);
        return optimizeReadOnlyMap(mutableMap);
    }

    public static Map mutableMapOf(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(pairs.length));
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map optimizeReadOnlyMap(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            map = MapsKt.emptyMap();
        } else if (size == 1) {
            map = MapsKt__MapsJVMKt.toSingletonMap(map);
        }
        return map;
    }

    public static Map plus(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map] */
    public static Map plus(Map map, Pair pair) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            linkedHashMap = MapsKt.mapOf(pair);
        } else {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final void putAll(Map map, Iterable pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final void putAll(Map map, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static Map toMap(Iterable iterable) {
        Map emptyMap;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return optimizeReadOnlyMap(toMap(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            emptyMap = MapsKt.emptyMap();
        } else if (size != 1) {
            emptyMap = toMap(iterable, new LinkedHashMap(MapsKt.mapCapacity(collection.size())));
        } else {
            emptyMap = MapsKt.mapOf((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        return emptyMap;
    }

    public static final Map toMap(Iterable iterable, Map destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        putAll(destination, iterable);
        return destination;
    }

    public static Map toMap(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? MapsKt.toMutableMap(map) : MapsKt__MapsJVMKt.toSingletonMap(map) : MapsKt.emptyMap();
    }

    public static final Map toMap(Pair[] pairArr, Map destination) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        putAll(destination, pairArr);
        return destination;
    }

    public static Map toMutableMap(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
