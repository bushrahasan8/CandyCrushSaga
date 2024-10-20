package kotlinx.coroutines.internal;

/* loaded from: LimitedDispatcherKt.class */
public abstract class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
