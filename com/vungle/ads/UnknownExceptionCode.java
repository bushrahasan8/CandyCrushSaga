package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UnknownExceptionCode.class */
public final class UnknownExceptionCode extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownExceptionCode(String errorMessage) {
        super(Integer.valueOf(VungleError.UNKNOWN_EXCEPTION_CODE), Sdk$SDKError.Reason.UNKNOWN_ERROR, errorMessage, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
