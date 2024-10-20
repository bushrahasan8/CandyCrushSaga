package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: SdkNotInitialized.class */
public final class SdkNotInitialized extends VungleError {
    public SdkNotInitialized() {
        super(10003, Sdk$SDKError.Reason.SDK_NOT_INITIALIZED, "Config: SDK response is null", null, null, null, 56, null);
    }
}
