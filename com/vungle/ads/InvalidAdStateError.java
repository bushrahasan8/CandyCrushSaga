package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InvalidAdStateError.class */
public final class InvalidAdStateError extends VungleError {
    public InvalidAdStateError() {
        this(0, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAdStateError(int i, Sdk$SDKError.Reason reason, String errorMessage, String str, String str2, String str3) {
        super(Integer.valueOf(i), reason, errorMessage, str, str2, str3, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public /* synthetic */ InvalidAdStateError(int i, Sdk$SDKError.Reason reason, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10042 : i, (i2 & 2) != 0 ? null : reason, (i2 & 4) != 0 ? "Ad state is invalid" : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4);
    }
}
