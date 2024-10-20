package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

/* loaded from: ThreadLocalEventLoop.class */
public final class ThreadLocalEventLoop {
    public static final ThreadLocalEventLoop INSTANCE = new ThreadLocalEventLoop();
    private static final ThreadLocal ref = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));

    private ThreadLocalEventLoop() {
    }

    public final EventLoop currentOrNull$kotlinx_coroutines_core() {
        return (EventLoop) ref.get();
    }

    public final EventLoop getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal threadLocal = ref;
        EventLoop eventLoop = (EventLoop) threadLocal.get();
        EventLoop eventLoop2 = eventLoop;
        if (eventLoop == null) {
            eventLoop2 = EventLoopKt.createEventLoop();
            threadLocal.set(eventLoop2);
        }
        return eventLoop2;
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        ref.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(EventLoop eventLoop) {
        ref.set(eventLoop);
    }
}
