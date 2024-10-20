package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ModuleNameRetriever.class */
public final class ModuleNameRetriever {
    private static Cache cache;
    public static final ModuleNameRetriever INSTANCE = new ModuleNameRetriever();
    private static final Cache notOnJava9 = new Cache(null, null, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ModuleNameRetriever$Cache.class */
    public static final class Cache {
        public final Method getDescriptorMethod;
        public final Method getModuleMethod;
        public final Method nameMethod;

        public Cache(Method method, Method method2, Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    private ModuleNameRetriever() {
    }

    private final Cache buildCache(BaseContinuationImpl baseContinuationImpl) {
        try {
            Cache cache2 = new Cache(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            cache = cache2;
            return cache2;
        } catch (Exception e) {
            Cache cache3 = notOnJava9;
            cache = cache3;
            return cache3;
        }
    }

    public final String getModuleName(BaseContinuationImpl continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Cache cache2 = cache;
        Cache cache3 = cache2;
        if (cache2 == null) {
            cache3 = buildCache(continuation);
        }
        if (cache3 == notOnJava9) {
            return null;
        }
        Method method = cache3.getModuleMethod;
        Object invoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = cache3.getDescriptorMethod;
        Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = cache3.nameMethod;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
        String str = null;
        if (invoke3 instanceof String) {
            str = (String) invoke3;
        }
        return str;
    }
}
