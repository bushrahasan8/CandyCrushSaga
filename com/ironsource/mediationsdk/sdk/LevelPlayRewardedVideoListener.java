package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* loaded from: LevelPlayRewardedVideoListener.class */
public interface LevelPlayRewardedVideoListener extends LevelPlayRewardedVideoBaseListener {
    void onAdAvailable(AdInfo adInfo);

    void onAdUnavailable();
}
