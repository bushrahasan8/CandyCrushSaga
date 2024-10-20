package kotlinx.coroutines;

import kotlin.coroutines.Continuation;

/* loaded from: Deferred.class */
public interface Deferred extends Job {
    Object await(Continuation continuation);

    Object getCompleted();
}
