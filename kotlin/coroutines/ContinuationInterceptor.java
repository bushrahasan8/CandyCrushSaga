package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ContinuationInterceptor.class */
public interface ContinuationInterceptor extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: ContinuationInterceptor$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static CoroutineContext.Element get(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.Key == key) {
                    Intrinsics.checkNotNull(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                } else {
                    continuationInterceptor = null;
                }
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            CoroutineContext.Element element = null;
            if (abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey())) {
                CoroutineContext.Element tryCast$kotlin_stdlib = abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor);
                element = null;
                if (tryCast$kotlin_stdlib instanceof CoroutineContext.Element) {
                    element = tryCast$kotlin_stdlib;
                }
            }
            return element;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.coroutines.EmptyCoroutineContext] */
        public static CoroutineContext minusKey(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.Key == key) {
                    continuationInterceptor = EmptyCoroutineContext.INSTANCE;
                }
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            CoroutineContext coroutineContext = continuationInterceptor;
            if (abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey())) {
                coroutineContext = continuationInterceptor;
                if (abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor) != null) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
            }
            return coroutineContext;
        }
    }

    /* loaded from: ContinuationInterceptor$Key.class */
    public static final class Key implements CoroutineContext.Key {
        static final Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    Continuation interceptContinuation(Continuation continuation);

    void releaseInterceptedContinuation(Continuation continuation);
}
