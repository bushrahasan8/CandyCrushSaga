package com.unity3d.services.core.extensions;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: AbortRetryException.class */
public final class AbortRetryException extends Exception {
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortRetryException(String reason) {
        super(reason);
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }
}
