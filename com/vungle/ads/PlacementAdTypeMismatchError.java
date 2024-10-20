package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: PlacementAdTypeMismatchError.class */
public final class PlacementAdTypeMismatchError extends VungleError {
    public PlacementAdTypeMismatchError(String str) {
        super(207, Sdk$SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH, str + " Ad type does not match with placement type.", str, null, null, 48, null);
    }
}
