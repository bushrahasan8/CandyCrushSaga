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

/* loaded from: ClassValueParametrizedCache.class */
final class ClassValueParametrizedCache implements ParametrizedSerializerCache {
    private final ClassValueParametrizedCache$initClassValue$1 classValue;
    private final Function2 compute;

    public ClassValueParametrizedCache(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = initClassValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.internal.ClassValueParametrizedCache$initClassValue$1] */
    private final ClassValueParametrizedCache$initClassValue$1 initClassValue() {
        return new ClassValue() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$initClassValue$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ClassValue
            public ParametrizedCacheEntry computeValue(Class type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new ParametrizedCacheEntry();
            }
        };
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s, reason: not valid java name */
    public Object mo7513getgIAlus(KClass key, List types) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        Object m7129constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        obj = get(JvmClassMappingKt.getJavaClass(key));
        concurrentHashMap = ((ParametrizedCacheEntry) obj).serializers;
        Object obj2 = concurrentHashMap.get(types);
        Object obj3 = obj2;
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl((KSerializer) this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(th));
            }
            obj3 = Result.m7128boximpl(m7129constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(types, obj3);
            if (putIfAbsent != null) {
                obj3 = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((Result) obj3).m7137unboximpl();
    }
}
