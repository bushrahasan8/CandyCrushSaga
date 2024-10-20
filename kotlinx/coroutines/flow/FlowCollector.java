package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: FlowCollector.class */
public interface FlowCollector {
    Object emit(Object obj, Continuation continuation);
}
