package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
/* loaded from: RewardedInterstitialAdApi.class */
public interface RewardedInterstitialAdApi extends FullScreenAd {

    /* loaded from: RewardedInterstitialAdApi$_CC.class */
    public abstract /* synthetic */ class _CC {
    }

    @Override // com.facebook.ads.FullScreenAd
    /* bridge */ /* synthetic */ Ad.LoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    /* bridge */ /* synthetic */ FullScreenAd.ShowConfigBuilder buildShowAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig();

    @Override // com.facebook.ads.Ad
    void destroy();

    @Override // com.facebook.ads.Ad
    String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    @Override // com.facebook.ads.Ad
    void loadAd();

    void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig);

    void registerAdCompanionView(AdCompanionView adCompanionView);

    @Override // com.facebook.ads.Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    @Override // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig);

    void unregisterAdCompanionView();
}
