package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: RewardedInterstitialAdListener.class */
public interface RewardedInterstitialAdListener extends AdListener {
    void onRewardedInterstitialClosed();

    void onRewardedInterstitialCompleted();
}
