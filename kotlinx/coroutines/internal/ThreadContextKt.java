package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* loaded from: ThreadContextKt.class */
public abstract class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final Function2 countAll = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Integer] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            if (!(element instanceof ThreadContextElement)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            if (intValue != 0) {
                element = Integer.valueOf(intValue + 1);
            }
            return element;
        }
    };
    private static final Function2 findOne = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        public final ThreadContextElement invoke(ThreadContextElement threadContextElement, CoroutineContext.Element element) {
            if (threadContextElement != null) {
                return threadContextElement;
            }
            return element instanceof ThreadContextElement ? (ThreadContextElement) element : null;
        }
    };
    private static final Function2 updateState = new Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        public final ThreadState invoke(ThreadState threadState, CoroutineContext.Element element) {
            if (element instanceof ThreadContextElement) {
                ThreadContextElement threadContextElement = (ThreadContextElement) element;
                threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
            }
            return threadState;
        }
    };

    public static final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, findOne);
        Intrinsics.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((ThreadContextElement) fold).restoreThreadContext(coroutineContext, obj);
    }

    public static final Object threadContextElements(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, countAll);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final Object updateThreadContext(CoroutineContext coroutineContext, Object obj) {
        Object updateThreadContext;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = threadContextElements(coroutineContext);
        }
        if (obj2 == 0) {
            updateThreadContext = NO_THREAD_ELEMENTS;
        } else if (obj2 instanceof Integer) {
            updateThreadContext = coroutineContext.fold(new ThreadState(coroutineContext, ((Number) obj2).intValue()), updateState);
        } else {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            updateThreadContext = ((ThreadContextElement) obj2).updateThreadContext(coroutineContext);
        }
        return updateThreadContext;
    }
}
