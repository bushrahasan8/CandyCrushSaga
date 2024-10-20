package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: PlacementNotFoundError.class */
public final class PlacementNotFoundError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacementNotFoundError(String placementId) {
        super(201, Sdk$SDKError.Reason.INVALID_PLACEMENT_ID, "Placement '" + placementId + "' is invalid", placementId, null, null, 48, null);
        Intrinsics.checkNotNullParameter(placementId, "placementId");
    }
}
