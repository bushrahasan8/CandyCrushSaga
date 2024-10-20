package kotlin.coroutines;

/* loaded from: Continuation.class */
public interface Continuation<T> {
    CoroutineContext getContext();

    void resumeWith(Object obj);
}
