package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: AbstractFlow.class */
public abstract class AbstractFlow implements Flow {
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1
            if (r0 == 0) goto L29
            r0 = r7
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) r0
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
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
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
            if (r0 == 0) goto L6a
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L60
            r0 = r7
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r0 = (kotlinx.coroutines.flow.internal.SafeCollector) r0
            r6 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5c
            goto L98
        L5c:
            r7 = move-exception
            goto La1
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6a:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.flow.internal.SafeCollector r0 = new kotlinx.coroutines.flow.internal.SafeCollector
            r1 = r0
            r2 = r6
            r3 = r7
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r7
            r1 = r6
            r0.L$0 = r1     // Catch: java.lang.Throwable -> La0
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> La0
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.collectSafely(r1, r2)     // Catch: java.lang.Throwable -> La0
            r7 = r0
            r0 = r7
            r1 = r9
            if (r0 != r1) goto L98
            r0 = r9
            return r0
        L98:
            r0 = r6
            r0.releaseIntercepted()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La0:
            r7 = move-exception
        La1:
            r0 = r6
            r0.releaseIntercepted()
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Object collectSafely(FlowCollector flowCollector, Continuation continuation);
}
