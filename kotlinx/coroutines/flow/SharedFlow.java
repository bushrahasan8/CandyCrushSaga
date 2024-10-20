package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: SharedFlow.class */
public interface SharedFlow extends Flow {
    @Override // kotlinx.coroutines.flow.Flow
    Object collect(FlowCollector flowCollector, Continuation continuation);
}
