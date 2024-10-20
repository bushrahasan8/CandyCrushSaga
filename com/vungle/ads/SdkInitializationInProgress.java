package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: SdkInitializationInProgress.class */
public final class SdkInitializationInProgress extends VungleError {
    public SdkInitializationInProgress() {
        super(3, Sdk$SDKError.Reason.CURRENTLY_INITIALIZING, "Config: Init Ongoing", null, null, null, 56, null);
    }
}
