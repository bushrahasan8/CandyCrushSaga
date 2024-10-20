package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: S2SRewardedVideoAdListener.class */
public interface S2SRewardedVideoAdListener extends RewardedVideoAdListener {
    void onRewardServerFailed();

    void onRewardServerSuccess();
}
