package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: AppLovinAdFactory.class */
public class AppLovinAdFactory {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdViewWrapper createAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        return AppLovinAdViewWrapper.newInstance(appLovinSdk, appLovinAdSize, context);
    }

    public AppLovinIncentivizedInterstitial createIncentivizedInterstitial(AppLovinSdk appLovinSdk) {
        return AppLovinIncentivizedInterstitial.create(appLovinSdk);
    }

    public AppLovinIncentivizedInterstitial createIncentivizedInterstitial(String str, AppLovinSdk appLovinSdk) {
        return AppLovinIncentivizedInterstitial.create(str, appLovinSdk);
    }

    public AppLovinInterstitialAdDialog createInterstitialAdDialog(AppLovinSdk appLovinSdk, Context context) {
        return AppLovinInterstitialAd.create(appLovinSdk, context);
    }
}
