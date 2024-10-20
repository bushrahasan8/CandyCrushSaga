package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: FlowExceptions_commonKt.class */
public abstract class FlowExceptions_commonKt {
    public static final void checkOwnership(AbortFlowException abortFlowException, FlowCollector flowCollector) {
        if (abortFlowException.owner != flowCollector) {
            throw abortFlowException;
        }
    }
}
