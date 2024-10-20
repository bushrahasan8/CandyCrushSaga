package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: TpatRetryFailure.class */
public final class TpatRetryFailure extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TpatRetryFailure(String url) {
        super(137, Sdk$SDKError.Reason.TPAT_RETRY_FAILED, "Pinging Tpat did not succeed during all allowed reries. Failed url is " + url, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
