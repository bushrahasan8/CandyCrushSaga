package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: CompletableDeferredKt.class */
public abstract class CompletableDeferredKt {
    public static final CompletableDeferred CompletableDeferred(Job job) {
        return new CompletableDeferredImpl(job);
    }

    public static /* synthetic */ CompletableDeferred CompletableDeferred$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }

    public static final boolean completeWith(CompletableDeferred completableDeferred, Object obj) {
        Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
        return m7132exceptionOrNullimpl == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(m7132exceptionOrNullimpl);
    }
}
