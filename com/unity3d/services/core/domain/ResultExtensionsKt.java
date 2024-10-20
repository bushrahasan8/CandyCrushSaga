package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ResultExtensionsKt.class */
public final class ResultExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Exception] */
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
        Intrinsics.reifiedOperationMarker(3, "E");
        return m7132exceptionOrNullimpl instanceof Exception ? (Exception) m7132exceptionOrNullimpl : null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
        Intrinsics.reifiedOperationMarker(3, "E");
        if (m7132exceptionOrNullimpl instanceof Exception) {
            return (E) m7132exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
        return m7132exceptionOrNullimpl instanceof InitializationException ? (InitializationException) m7132exceptionOrNullimpl : null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable m7132exceptionOrNullimpl = Result.m7132exceptionOrNullimpl(obj);
        if (m7132exceptionOrNullimpl instanceof InitializationException) {
            return (InitializationException) m7132exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
