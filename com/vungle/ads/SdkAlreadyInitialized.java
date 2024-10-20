package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: SdkAlreadyInitialized.class */
public final class SdkAlreadyInitialized extends VungleError {
    public SdkAlreadyInitialized() {
        super(null, Sdk$SDKError.Reason.ALREADY_INITIALIZED, "Config: Vungle SDK is already initialized", null, null, null, 57, null);
    }
}
