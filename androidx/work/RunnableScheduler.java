package androidx.work;

/* loaded from: RunnableScheduler.class */
public interface RunnableScheduler {
    void cancel(Runnable runnable);

    void scheduleWithDelay(long j, Runnable runnable);
}
