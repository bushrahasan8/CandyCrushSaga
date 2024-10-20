package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: AdExpiredError.class */
public final class AdExpiredError extends VungleError {
    public AdExpiredError() {
        super(304, Sdk$SDKError.Reason.AD_EXPIRED, "Ad expired", null, null, null, 56, null);
    }
}
