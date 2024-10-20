package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: DebugStringsKt.class */
public abstract class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(Continuation continuation) {
        Object m7129constructorimpl;
        String str;
        if (continuation instanceof DispatchedContinuation) {
            str = continuation.toString();
        } else {
            try {
                Result.Companion companion = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl(continuation + '@' + getHexAddress(continuation));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7132exceptionOrNullimpl(m7129constructorimpl) != null) {
                m7129constructorimpl = continuation.getClass().getName() + '@' + getHexAddress(continuation);
            }
            str = (String) m7129constructorimpl;
        }
        return str;
    }
}
