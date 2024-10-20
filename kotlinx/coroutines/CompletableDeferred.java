package kotlinx.coroutines;

/* loaded from: CompletableDeferred.class */
public interface CompletableDeferred extends Deferred {
    boolean complete(Object obj);

    boolean completeExceptionally(Throwable th);
}
