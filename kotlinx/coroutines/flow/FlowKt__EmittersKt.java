package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: FlowKt__EmittersKt.class */
public abstract /* synthetic */ class FlowKt__EmittersKt {
    public static final void ensureActive(FlowCollector flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector r5, kotlin.jvm.functions.Function3 r6, java.lang.Throwable r7, kotlin.coroutines.Continuation r8) {
        /*
            r0 = r8
            boolean r0 = r0 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L29
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L33
        L29:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r10 = r0
        L33:
            r0 = r10
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L70
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L66
            r0 = r10
            java.lang.Object r0 = r0.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r8 = r0
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L62
            goto L9b
        L62:
            r5 = move-exception
            goto L9f
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L70:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r8 = r0
            r0 = r10
            r1 = r7
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L62
            r0 = r7
            r8 = r0
            r0 = r10
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L62
            r0 = r7
            r8 = r0
            r0 = r6
            r1 = r5
            r2 = r7
            r3 = r10
            java.lang.Object r0 = r0.invoke(r1, r2, r3)     // Catch: java.lang.Throwable -> L62
            r5 = r0
            r0 = r5
            r1 = r11
            if (r0 != r1) goto L9b
            r0 = r11
            return r0
        L9b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9f:
            r0 = r8
            if (r0 == 0) goto Lad
            r0 = r8
            r1 = r5
            if (r0 == r1) goto Lad
            r0 = r5
            r1 = r8
            kotlin.ExceptionsKt.addSuppressed(r0, r1)
        Lad:
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Flow onCompletion(Flow flow, Function3 function3) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, function3);
    }

    public static final Flow onStart(Flow flow, Function2 function2) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(function2, flow);
    }
}
