package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: JobKt__FutureKt.class */
abstract /* synthetic */ class JobKt__FutureKt {
    public static final void cancelFutureOnCancellation(CancellableContinuation cancellableContinuation, Future future) {
        cancellableContinuation.invokeOnCancellation(new CancelFutureOnCancel(future));
    }
}
