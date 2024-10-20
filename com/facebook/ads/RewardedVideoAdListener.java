package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: RewardedVideoAdListener.class */
public interface RewardedVideoAdListener extends AdListener {
    void onRewardedVideoClosed();

    void onRewardedVideoCompleted();
}
