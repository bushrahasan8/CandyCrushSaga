package kotlin.coroutines;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CoroutineContext.class */
public interface CoroutineContext {

    /* loaded from: CoroutineContext$DefaultImpls.class */
    public static final abstract class DefaultImpls {
        public static CoroutineContext plus(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (context != EmptyCoroutineContext.INSTANCE) {
                coroutineContext = (CoroutineContext) context.fold(coroutineContext, new Function2() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.coroutines.CombinedContext] */
                    /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.coroutines.CombinedContext] */
                    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.coroutines.CombinedContext] */
                    @Override // kotlin.jvm.functions.Function2
                    public final CoroutineContext invoke(CoroutineContext acc, CoroutineContext.Element element) {
                        CoroutineContext.Element combinedContext;
                        Intrinsics.checkNotNullParameter(acc, "acc");
                        Intrinsics.checkNotNullParameter(element, "element");
                        CoroutineContext minusKey = acc.minusKey(element.getKey());
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        if (minusKey != emptyCoroutineContext) {
                            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
                            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(key);
                            if (continuationInterceptor == null) {
                                combinedContext = new CombinedContext(minusKey, element);
                            } else {
                                CoroutineContext minusKey2 = minusKey.minusKey(key);
                                if (minusKey2 == emptyCoroutineContext) {
                                    element = new CombinedContext(element, continuationInterceptor);
                                } else {
                                    combinedContext = new CombinedContext(new CombinedContext(minusKey2, element), continuationInterceptor);
                                }
                            }
                            element = combinedContext;
                        }
                        return element;
                    }
                });
            }
            return coroutineContext;
        }
    }

    /* loaded from: CoroutineContext$Element.class */
    public interface Element extends CoroutineContext {

        /* loaded from: CoroutineContext$Element$DefaultImpls.class */
        public static final abstract class DefaultImpls {
            public static Object fold(Element element, Object obj, Function2 operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(obj, element);
            }

            public static Element get(Element element, Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (Intrinsics.areEqual(element.getKey(), key)) {
                    Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                } else {
                    element = null;
                }
                return element;
            }

            public static CoroutineContext minusKey(Element element, Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                CoroutineContext coroutineContext = element;
                if (Intrinsics.areEqual(element.getKey(), key)) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                return coroutineContext;
            }

            public static CoroutineContext plus(Element element, CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return DefaultImpls.plus(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        Element get(Key key);

        Key getKey();
    }

    /* loaded from: CoroutineContext$Key.class */
    public interface Key {
    }

    Object fold(Object obj, Function2 function2);

    Element get(Key key);

    CoroutineContext minusKey(Key key);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
