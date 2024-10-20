package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: InvalidAppId.class */
public final class InvalidAppId extends VungleError {
    public InvalidAppId() {
        super(2, Sdk$SDKError.Reason.INVALID_APP_ID, "App ID is empty", null, null, null, 56, null);
    }
}
