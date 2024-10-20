package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: NetworkUnreachable.class */
public final class NetworkUnreachable extends VungleError {
    public NetworkUnreachable() {
        super(Integer.valueOf(VungleError.NETWORK_UNREACHABLE), Sdk$SDKError.Reason.API_REQUEST_ERROR, "Config: Network Unreachable", null, null, null, 56, null);
    }
}
