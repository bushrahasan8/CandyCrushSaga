package kotlinx.coroutines;

/* loaded from: EventLoopKt.class */
public abstract class EventLoopKt {
    public static final EventLoop createEventLoop() {
        return new BlockingEventLoop(Thread.currentThread());
    }
}
