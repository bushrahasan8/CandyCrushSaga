package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: FlowKt__ErrorsKt$catchImpl$2.class */
final class FlowKt__ErrorsKt$catchImpl$2 implements FlowCollector {
    final FlowCollector $collector;
    final Ref$ObjectRef $fromDownstream;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ErrorsKt$catchImpl$2(FlowCollector flowCollector, Ref$ObjectRef ref$ObjectRef) {
        this.$collector = flowCollector;
        this.$fromDownstream = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
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
            boolean r0 = r0 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L29
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
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
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
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
            if (r0 == 0) goto L6d
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L63
            r0 = r7
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r0
            r9 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5d
            goto L95
        L5d:
            r6 = move-exception
            r0 = r6
            r7 = r0
            goto L9f
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6d:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            kotlinx.coroutines.flow.FlowCollector r0 = r0.$collector     // Catch: java.lang.Throwable -> L99
            r10 = r0
            r0 = r7
            r1 = r5
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L99
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L99
            r0 = r10
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.emit(r1, r2)     // Catch: java.lang.Throwable -> L99
            r6 = r0
            r0 = r6
            r1 = r9
            if (r0 != r1) goto L95
            r0 = r9
            return r0
        L95:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L99:
            r7 = move-exception
            r0 = r5
            r6 = r0
            r0 = r6
            r9 = r0
        L9f:
            r0 = r9
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.$fromDownstream
            r1 = r7
            r0.element = r1
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
