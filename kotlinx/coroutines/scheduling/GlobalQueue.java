package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.LockFreeTaskQueue;

/* loaded from: GlobalQueue.class */
public final class GlobalQueue extends LockFreeTaskQueue {
    public GlobalQueue() {
        super(false);
    }
}
