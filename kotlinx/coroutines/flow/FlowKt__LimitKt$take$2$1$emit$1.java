package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: FlowKt__LimitKt$take$2$1$emit$1.class */
public final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {
    int label;
    Object result;
    final FlowKt__LimitKt$take$2$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$2$1$emit$1(FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1, Continuation continuation) {
        super(continuation);
        this.this$0 = flowKt__LimitKt$take$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
