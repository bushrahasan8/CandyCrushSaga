package kotlinx.serialization.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: ConcurrentHashMapParametrizedCache.class */
final class ConcurrentHashMapParametrizedCache implements ParametrizedSerializerCache {
    private final ConcurrentHashMap cache;
    private final Function2 compute;

    public ConcurrentHashMapParametrizedCache(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public Object mo7513getgIAlus(KClass key, List types) {
        ConcurrentHashMap concurrentHashMap;
        Object m7129constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap2 = this.cache;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap2.get(javaClass);
        Object obj2 = obj;
        if (obj == null) {
            obj2 = new ParametrizedCacheEntry();
            Object putIfAbsent = concurrentHashMap2.putIfAbsent(javaClass, obj2);
            if (putIfAbsent != null) {
                obj2 = putIfAbsent;
            }
        }
        concurrentHashMap = ((ParametrizedCacheEntry) obj2).serializers;
        Object obj3 = concurrentHashMap.get(types);
        Object obj4 = obj3;
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl((KSerializer) this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(th));
            }
            obj4 = Result.m7128boximpl(m7129constructorimpl);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(types, obj4);
            if (putIfAbsent2 != null) {
                obj4 = putIfAbsent2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj4, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((Result) obj4).m7137unboximpl();
    }
}
