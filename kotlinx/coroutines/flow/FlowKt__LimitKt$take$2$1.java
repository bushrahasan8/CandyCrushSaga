package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: FlowKt__LimitKt$take$2$1.class */
public final class FlowKt__LimitKt$take$2$1 implements FlowCollector {
    final Ref$IntRef $consumed;
    final int $count;
    final FlowCollector $this_unsafeFlow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i, FlowCollector flowCollector) {
        this.$consumed = ref$IntRef;
        this.$count = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
