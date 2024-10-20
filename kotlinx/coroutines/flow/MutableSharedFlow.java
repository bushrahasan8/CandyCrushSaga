package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: MutableSharedFlow.class */
public interface MutableSharedFlow extends SharedFlow, FlowCollector {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(Object obj, Continuation continuation);

    StateFlow getSubscriptionCount();

    void resetReplayCache();

    boolean tryEmit(Object obj);
}
