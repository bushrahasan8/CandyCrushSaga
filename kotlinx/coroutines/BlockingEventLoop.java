package kotlinx.coroutines;

/* loaded from: BlockingEventLoop.class */
public final class BlockingEventLoop extends EventLoopImplBase {
    private final Thread thread;

    public BlockingEventLoop(Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected Thread getThread() {
        return this.thread;
    }
}
