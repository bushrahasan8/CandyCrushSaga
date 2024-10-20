package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: ConfigurationError.class */
public final class ConfigurationError extends VungleError {
    public ConfigurationError() {
        super(10003, Sdk$SDKError.Reason.API_REQUEST_ERROR, "Config: Configuration Error", null, null, null, 56, null);
    }
}
