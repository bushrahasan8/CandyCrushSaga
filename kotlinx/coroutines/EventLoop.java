package kotlinx.coroutines;

import kotlin.collections.ArrayDeque;

/* loaded from: EventLoop.class */
public abstract class EventLoop extends CoroutineDispatcher {
    private boolean shared;
    private ArrayDeque unconfinedQueue;
    private long useCount;

    public static /* synthetic */ void decrementUseCount$default(EventLoop eventLoop, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.decrementUseCount(z);
    }

    private final long delta(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void incrementUseCount$default(EventLoop eventLoop, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.incrementUseCount(z);
    }

    public final void decrementUseCount(boolean z) {
        long delta = this.useCount - delta(z);
        this.useCount = delta;
        if (delta <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(DispatchedTask dispatchedTask) {
        ArrayDeque arrayDeque = this.unconfinedQueue;
        ArrayDeque arrayDeque2 = arrayDeque;
        if (arrayDeque == null) {
            arrayDeque2 = new ArrayDeque();
            this.unconfinedQueue = arrayDeque2;
        }
        arrayDeque2.addLast(dispatchedTask);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long getNextTime() {
        ArrayDeque arrayDeque = this.unconfinedQueue;
        long j = Long.MAX_VALUE;
        if (arrayDeque == null) {
            return Long.MAX_VALUE;
        }
        if (!arrayDeque.isEmpty()) {
            j = 0;
        }
        return j;
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (z) {
            return;
        }
        this.shared = true;
    }

    public final boolean isUnconfinedLoopActive() {
        boolean z = true;
        if (this.useCount < delta(true)) {
            z = false;
        }
        return z;
    }

    public final boolean isUnconfinedQueueEmpty() {
        ArrayDeque arrayDeque = this.unconfinedQueue;
        return arrayDeque != null ? arrayDeque.isEmpty() : true;
    }

    public abstract long processNextEvent();

    public final boolean processUnconfinedEvent() {
        DispatchedTask dispatchedTask;
        ArrayDeque arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null || (dispatchedTask = (DispatchedTask) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public abstract void shutdown();
}
