package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: StackTraceRecoveryKt.class */
public abstract class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineBoundary();
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClassName;

    static {
        Object m7129constructorimpl;
        Object m7129constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m7129constructorimpl = Result.m7129constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m7129constructorimpl = Result.m7129constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7132exceptionOrNullimpl(m7129constructorimpl) != null) {
            m7129constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m7129constructorimpl;
        try {
            m7129constructorimpl2 = Result.m7129constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m7129constructorimpl2 = Result.m7129constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m7132exceptionOrNullimpl(m7129constructorimpl2) != null) {
            m7129constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m7129constructorimpl2;
    }

    public static final Throwable recoverStackTrace(Throwable th) {
        return th;
    }
}
