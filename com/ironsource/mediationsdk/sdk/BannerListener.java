package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

@Deprecated
/* loaded from: BannerListener.class */
public interface BannerListener {
    @Deprecated
    void onBannerAdClicked();

    @Deprecated
    void onBannerAdLeftApplication();

    @Deprecated
    void onBannerAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onBannerAdLoaded();

    @Deprecated
    void onBannerAdScreenDismissed();

    @Deprecated
    void onBannerAdScreenPresented();
}
