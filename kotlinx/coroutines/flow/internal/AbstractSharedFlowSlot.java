package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;

/* loaded from: AbstractSharedFlowSlot.class */
public abstract class AbstractSharedFlowSlot {
    public abstract boolean allocateLocked(Object obj);

    public abstract Continuation[] freeLocked(Object obj);
}
