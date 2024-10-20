package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: DistinctFlowImpl$collect$2.class */
final class DistinctFlowImpl$collect$2 implements FlowCollector {
    final FlowCollector $collector;
    final Ref$ObjectRef $previousKey;
    final DistinctFlowImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DistinctFlowImpl$collect$2(DistinctFlowImpl distinctFlowImpl, Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector) {
        this.this$0 = distinctFlowImpl;
        this.$previousKey = ref$ObjectRef;
        this.$collector = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            if (r0 == 0) goto L29
            r0 = r7
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
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
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
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
            if (r0 != r1) goto L54
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lc8
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = r0.this$0
            kotlin.jvm.functions.Function1 r0 = r0.keySelector
            r1 = r6
            java.lang.Object r0 = r0.invoke(r1)
            r11 = r0
            r0 = r5
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.$previousKey
            java.lang.Object r0 = r0.element
            r10 = r0
            r0 = r10
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r0 == r1) goto La3
            r0 = r5
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = r0.this$0
            kotlin.jvm.functions.Function2 r0 = r0.areEquivalent
            r1 = r10
            r2 = r11
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L9f
            goto La3
        L9f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La3:
            r0 = r5
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.$previousKey
            r1 = r11
            r0.element = r1
            r0 = r5
            kotlinx.coroutines.flow.FlowCollector r0 = r0.$collector
            r10 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r9
            if (r0 != r1) goto Lc8
            r0 = r9
            return r0
        Lc8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
