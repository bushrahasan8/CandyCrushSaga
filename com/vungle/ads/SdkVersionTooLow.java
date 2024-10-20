package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: SdkVersionTooLow.class */
public final class SdkVersionTooLow extends VungleError {
    public SdkVersionTooLow() {
        super(Integer.valueOf(VungleError.SDK_VERSION_BELOW_REQUIRED_VERSION), Sdk$SDKError.Reason.API_REQUEST_ERROR, "Config: SDK is supported only for API versions 21 and above", null, null, null, 56, null);
    }
}
