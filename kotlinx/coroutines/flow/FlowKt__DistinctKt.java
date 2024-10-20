package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: FlowKt__DistinctKt.class */
public abstract /* synthetic */ class FlowKt__DistinctKt {
    private static final Function1 defaultKeySelector = new Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    };
    private static final Function2 defaultAreEquivalent = new Function2() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
        }
    };

    public static final Flow distinctUntilChanged(Flow flow) {
        if (!(flow instanceof StateFlow)) {
            flow = distinctUntilChangedBy$FlowKt__DistinctKt(flow, defaultKeySelector, defaultAreEquivalent);
        }
        return flow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.areEquivalent == r8) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlinx.coroutines.flow.Flow distinctUntilChangedBy$FlowKt__DistinctKt(kotlinx.coroutines.flow.Flow r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function2 r8) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof kotlinx.coroutines.flow.DistinctFlowImpl
            if (r0 == 0) goto L1f
            r0 = r6
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = (kotlinx.coroutines.flow.DistinctFlowImpl) r0
            r9 = r0
            r0 = r9
            kotlin.jvm.functions.Function1 r0 = r0.keySelector
            r1 = r7
            if (r0 != r1) goto L1f
            r0 = r9
            kotlin.jvm.functions.Function2 r0 = r0.areEquivalent
            r1 = r8
            if (r0 != r1) goto L1f
            goto L2a
        L1f:
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = new kotlinx.coroutines.flow.DistinctFlowImpl
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            r6 = r0
        L2a:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DistinctKt.distinctUntilChangedBy$FlowKt__DistinctKt(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):kotlinx.coroutines.flow.Flow");
    }
}
