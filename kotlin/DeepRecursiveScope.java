package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DeepRecursiveScope.class */
public abstract class DeepRecursiveScope {
    private DeepRecursiveScope() {
    }

    public /* synthetic */ DeepRecursiveScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object callRecursive(Object obj, Continuation continuation);
}
