package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: CompletionStateKt.class */
public abstract class CompletionStateKt {
    public static final Object recoverResult(Object obj, Continuation continuation) {
        Object m7129constructorimpl;
        if (obj instanceof CompletedExceptionally) {
            Result.Companion companion = Result.Companion;
            m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(((CompletedExceptionally) obj).cause));
        } else {
            m7129constructorimpl = Result.m7129constructorimpl(obj);
        }
        return m7129constructorimpl;
    }

    public static final Object toState(Object obj, Function1 function1) {
        Object completedExceptionally;
        Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
        if (m7132exceptionOrNullimpl == null) {
            completedExceptionally = obj;
            if (function1 != null) {
                completedExceptionally = new CompletedWithCancellation(obj, function1);
            }
        } else {
            completedExceptionally = new CompletedExceptionally(m7132exceptionOrNullimpl, false, 2, null);
        }
        return completedExceptionally;
    }

    public static final Object toState(Object obj, CancellableContinuation cancellableContinuation) {
        Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
        if (m7132exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(m7132exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object toState$default(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return toState(obj, function1);
    }
}
