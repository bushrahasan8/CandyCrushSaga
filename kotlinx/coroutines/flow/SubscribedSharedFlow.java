package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: SubscribedSharedFlow.class */
public final class SubscribedSharedFlow implements SharedFlow {
    private final Function2 action;
    private final SharedFlow sharedFlow;

    public SubscribedSharedFlow(SharedFlow sharedFlow, Function2 function2) {
        this.sharedFlow = sharedFlow;
        this.action = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            if (r0 == 0) goto L29
            r0 = r7
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = (kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5e
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8c
        L5e:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            kotlinx.coroutines.flow.SharedFlow r0 = r0.sharedFlow
            r10 = r0
            kotlinx.coroutines.flow.SubscribedFlowCollector r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector
            r1 = r0
            r2 = r6
            r3 = r5
            kotlin.jvm.functions.Function2 r3 = r3.action
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r9
            if (r0 != r1) goto L8c
            r0 = r9
            return r0
        L8c:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedSharedFlow.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
