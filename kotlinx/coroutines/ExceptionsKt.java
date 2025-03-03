package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: ExceptionsKt.class */
public abstract class ExceptionsKt {
    public static final CancellationException CancellationException(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
