package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: SubscribedSharedFlow$collect$1.class */
public final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {
    int label;
    Object result;
    final SubscribedSharedFlow this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedSharedFlow$collect$1(SubscribedSharedFlow subscribedSharedFlow, Continuation continuation) {
        super(continuation);
        this.this$0 = subscribedSharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
