package kotlinx.coroutines;

import kotlinx.coroutines.internal.Segment;

/* loaded from: Waiter.class */
public interface Waiter {
    void invokeOnCancellation(Segment segment, int i);
}
