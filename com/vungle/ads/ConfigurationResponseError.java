package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: ConfigurationResponseError.class */
public final class ConfigurationResponseError extends VungleError {
    public ConfigurationResponseError() {
        super(10003, Sdk$SDKError.Reason.INVALID_CONFIG_RESPONSE, "Config: Configuration failed due to bad response.", null, null, null, 56, null);
    }
}
