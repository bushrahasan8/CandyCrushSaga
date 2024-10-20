package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: FlowKt__ZipKt.class */
abstract /* synthetic */ class FlowKt__ZipKt {
    public static final Flow flowCombine(final Flow flow, final Flow flow2, final Function3 function3) {
        return new Flow(flow, flow2, function3) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            final Flow $flow$inlined;
            final Flow $this_combine$inlined;
            final Function3 $transform$inlined;

            {
                this.$this_combine$inlined = flow;
                this.$flow$inlined = flow2;
                this.$transform$inlined = function3;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Function0 function0;
                Flow flow3 = this.$this_combine$inlined;
                Flow flow4 = this.$flow$inlined;
                function0 = new Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Void invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, new Flow[]{flow3, flow4}, function0, new FlowKt__ZipKt$combine$1$1(this.$transform$inlined, null), continuation);
                return combineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : Unit.INSTANCE;
            }
        };
    }
}
