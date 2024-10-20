package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;

/* loaded from: Semaphore.class */
public interface Semaphore {
    Object acquire(Continuation continuation);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
