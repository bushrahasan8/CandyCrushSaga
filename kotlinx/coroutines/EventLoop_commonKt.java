package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: EventLoop_commonKt.class */
public abstract class EventLoop_commonKt {
    private static final Symbol DISPOSED_TASK = new Symbol("REMOVED_TASK");
    private static final Symbol CLOSED_EMPTY = new Symbol("CLOSED_EMPTY");

    public static final long delayToNanos(long j) {
        return j <= 0 ? 0L : j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
    }
}
