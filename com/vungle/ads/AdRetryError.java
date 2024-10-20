package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: AdRetryError.class */
public final class AdRetryError extends VungleError {
    public AdRetryError() {
        super(Integer.valueOf(VungleError.SERVER_RETRY_ERROR), Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER, "Ads retry-after: Server is busy", null, null, null, 56, null);
    }
}
