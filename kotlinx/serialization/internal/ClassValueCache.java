package kotlinx.serialization.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: ClassValueCache.class */
final class ClassValueCache implements SerializerCache {
    private final ClassValueCache$initClassValue$1 classValue;
    private final Function1 compute;

    public ClassValueCache(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = initClassValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.internal.ClassValueCache$initClassValue$1] */
    private final ClassValueCache$initClassValue$1 initClassValue() {
        return new ClassValue(this) { // from class: kotlinx.serialization.internal.ClassValueCache$initClassValue$1
            final ClassValueCache this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ClassValue
            public CacheEntry computeValue(Class type) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(type, "type");
                function1 = this.this$0.compute;
                return new CacheEntry((KSerializer) function1.invoke(JvmClassMappingKt.getKotlinClass(type)));
            }
        };
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        obj = get(JvmClassMappingKt.getJavaClass(key));
        return ((CacheEntry) obj).serializer;
    }
}
