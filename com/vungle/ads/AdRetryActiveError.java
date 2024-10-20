package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: AdRetryActiveError.class */
public final class AdRetryActiveError extends VungleError {
    public AdRetryActiveError() {
        super(Integer.valueOf(VungleError.SERVER_RETRY_ERROR), Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER, "Ads: Server Retry Error active", null, null, null, 56, null);
    }
}
