package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: CoroutineExceptionHandler.class */
public interface CoroutineExceptionHandler extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: CoroutineExceptionHandler$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static Object fold(CoroutineExceptionHandler coroutineExceptionHandler, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(coroutineExceptionHandler, obj, function2);
        }

        public static CoroutineContext.Element get(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.get(coroutineExceptionHandler, key);
        }

        public static CoroutineContext minusKey(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(coroutineExceptionHandler, key);
        }

        public static CoroutineContext plus(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(coroutineExceptionHandler, coroutineContext);
        }
    }

    /* loaded from: CoroutineExceptionHandler$Key.class */
    public static final class Key implements CoroutineContext.Key {
        static final Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
