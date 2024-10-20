package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: S2SRewardedInterstitialAdListener.class */
public interface S2SRewardedInterstitialAdListener extends RewardedInterstitialAdListener {
    void onRewardServerFailed();

    void onRewardServerSuccess();
}
