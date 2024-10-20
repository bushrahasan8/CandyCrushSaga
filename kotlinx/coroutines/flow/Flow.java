package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: Flow.class */
public interface Flow {
    Object collect(FlowCollector flowCollector, Continuation continuation);
}
