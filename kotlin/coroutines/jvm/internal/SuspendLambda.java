package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: SuspendLambda.class */
public abstract class SuspendLambda extends ContinuationImpl implements FunctionBase {
    private final int arity;

    public SuspendLambda(int i, Continuation continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        String baseContinuationImpl;
        if (getCompletion() == null) {
            baseContinuationImpl = Reflection.renderLambdaToString(this);
            Intrinsics.checkNotNullExpressionValue(baseContinuationImpl, "renderLambdaToString(this)");
        } else {
            baseContinuationImpl = super.toString();
        }
        return baseContinuationImpl;
    }
}
