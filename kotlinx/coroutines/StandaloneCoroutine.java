package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: StandaloneCoroutine.class */
public class StandaloneCoroutine extends AbstractCoroutine {
    public StandaloneCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean handleJobException(Throwable th) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
        return true;
    }
}
