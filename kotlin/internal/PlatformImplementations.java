package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;

/* loaded from: PlatformImplementations.class */
public class PlatformImplementations {

    /* loaded from: PlatformImplementations$ReflectThrowable.class */
    private static final class ReflectThrowable {
        public static final ReflectThrowable INSTANCE = new ReflectThrowable();
        public static final Method addSuppressed;
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] throwableMethods = Throwable.class.getMethods();
            Intrinsics.checkNotNullExpressionValue(throwableMethods, "throwableMethods");
            int length = throwableMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = throwableMethods[i];
                if (Intrinsics.areEqual(method.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    if (Intrinsics.areEqual(ArraysKt.singleOrNull(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i++;
            }
            addSuppressed = method;
            int length2 = throwableMethods.length;
            int i2 = 0;
            while (true) {
                method2 = null;
                if (i2 >= length2) {
                    break;
                }
                method2 = throwableMethods[i2];
                if (Intrinsics.areEqual(method2.getName(), "getSuppressed")) {
                    break;
                } else {
                    i2++;
                }
            }
            getSuppressed = method2;
        }

        private ReflectThrowable() {
        }
    }

    public void addSuppressed(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = ReflectThrowable.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }
}
