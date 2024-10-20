package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: InvalidWaterfallPlacementError.class */
public final class InvalidWaterfallPlacementError extends VungleError {
    public InvalidWaterfallPlacementError(String str) {
        super(222, Sdk$SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID, str + " header bidding status does not match with loadAd parameters", str, null, null, 48, null);
    }
}
