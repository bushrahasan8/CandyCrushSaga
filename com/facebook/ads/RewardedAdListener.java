package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: RewardedAdListener.class */
public interface RewardedAdListener {
    void onRewardedAdCompleted();

    void onRewardedAdServerFailed();

    void onRewardedAdServerSucceeded();
}
