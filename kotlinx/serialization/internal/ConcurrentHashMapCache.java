package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: ConcurrentHashMapCache.class */
final class ConcurrentHashMapCache implements SerializerCache {
    private final ConcurrentHashMap cache;
    private final Function1 compute;

    public ConcurrentHashMapCache(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.cache;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap.get(javaClass);
        Object obj2 = obj;
        if (obj == null) {
            obj2 = new CacheEntry((KSerializer) this.compute.invoke(key));
            Object putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, obj2);
            if (putIfAbsent != null) {
                obj2 = putIfAbsent;
            }
        }
        return ((CacheEntry) obj2).serializer;
    }
}
