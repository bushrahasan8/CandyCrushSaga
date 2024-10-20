package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: AdNotLoadedCantPlay.class */
public final class AdNotLoadedCantPlay extends VungleError {
    public AdNotLoadedCantPlay() {
        super(Integer.valueOf(VungleError.AD_UNABLE_TO_PLAY), Sdk$SDKError.Reason.AD_NOT_LOADED, "Failed to retrieve the ad object.", null, null, null, 56, null);
    }
}
