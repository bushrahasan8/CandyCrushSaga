package kotlinx.coroutines.internal;

/* loaded from: ThreadLocalKt.class */
public abstract class ThreadLocalKt {
    public static final ThreadLocal commonThreadLocal(Symbol symbol) {
        return new ThreadLocal();
    }
}
