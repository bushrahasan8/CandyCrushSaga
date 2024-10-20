package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: SubscriptionCountStateFlow.class */
public final class SubscriptionCountStateFlow extends SharedFlowImpl implements StateFlow {
    public SubscriptionCountStateFlow(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        tryEmit(Integer.valueOf(i));
    }

    public final boolean increment(int i) {
        boolean tryEmit;
        synchronized (this) {
            tryEmit = tryEmit(Integer.valueOf(((Number) getLastReplayedLocked()).intValue() + i));
        }
        return tryEmit;
    }
}
