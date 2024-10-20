package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: AppLovinWaterfallInterstitialAd.class */
public class AppLovinWaterfallInterstitialAd extends AppLovinInterstitialRenderer implements MediationInterstitialAd {
    protected static final HashMap appLovinWaterfallInterstitialAds = new HashMap();
    private Context context;
    private boolean enableMultipleAdLoading;
    private Bundle networkExtras;
    private AppLovinSdk sdk;

    public AppLovinWaterfallInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
        this.enableMultipleAdLoading = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer
    public void adHidden(AppLovinAd appLovinAd) {
        unregister();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer
    public void failedToReceiveAd(int i) {
        unregister();
        super.failedToReceiveAd(i);
    }

    public void loadAd() {
        this.context = this.interstitialAdConfiguration.getContext();
        Bundle serverParameters = this.interstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("sdkKey");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(AppLovinInterstitialRenderer.TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(serverParameters)) {
                this.enableMultipleAdLoading = true;
            }
            this.appLovinInitializer.initialize(this.context, string, new AppLovinInitializer.OnInitializeSuccessListener(this, serverParameters) { // from class: com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.1
                final AppLovinWaterfallInterstitialAd this$0;
                final Bundle val$serverParameters;

                {
                    this.this$0 = this;
                    this.val$serverParameters = serverParameters;
                }

                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(String str) {
                    this.this$0.zoneId = AppLovinUtils.retrieveZoneId(this.val$serverParameters);
                    HashMap hashMap = AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds;
                    if (hashMap.containsKey(this.this$0.zoneId) && ((WeakReference) hashMap.get(this.this$0.zoneId)).get() != null) {
                        AdError adError2 = new AdError(105, AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                        Log.e(AppLovinInterstitialRenderer.TAG, adError2.getMessage());
                        this.this$0.interstitialAdLoadCallback.onFailure(adError2);
                        return;
                    }
                    hashMap.put(this.this$0.zoneId, new WeakReference(this.this$0));
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd = this.this$0;
                    appLovinWaterfallInterstitialAd.sdk = appLovinWaterfallInterstitialAd.appLovinInitializer.retrieveSdk(this.val$serverParameters, appLovinWaterfallInterstitialAd.context);
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd2 = this.this$0;
                    appLovinWaterfallInterstitialAd2.networkExtras = appLovinWaterfallInterstitialAd2.networkExtras;
                    Log.d(AppLovinInterstitialRenderer.TAG, "Requesting interstitial for zone: " + this.this$0.zoneId);
                    if (TextUtils.isEmpty(this.this$0.zoneId)) {
                        this.this$0.sdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, this.this$0);
                        return;
                    }
                    AppLovinAdService adService = this.this$0.sdk.getAdService();
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd3 = this.this$0;
                    adService.loadNextAdForZoneId(appLovinWaterfallInterstitialAd3.zoneId, appLovinWaterfallInterstitialAd3);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog createInterstitialAdDialog = this.appLovinAdFactory.createInterstitialAdDialog(this.sdk, context);
        createInterstitialAdDialog.setAdDisplayListener(this);
        createInterstitialAdDialog.setAdClickListener(this);
        createInterstitialAdDialog.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            String str = AppLovinInterstitialRenderer.TAG;
            Log.d(str, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                Log.d(str, "Showing interstitial preloaded by SDK.");
                createInterstitialAdDialog.show();
                return;
            }
            return;
        }
        Log.d(AppLovinInterstitialRenderer.TAG, "Showing interstitial for zone: " + this.zoneId);
        createInterstitialAdDialog.showAndRender(this.appLovinInterstitialAd);
        if (this.enableMultipleAdLoading) {
            unregister();
        }
    }

    void unregister() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap hashMap = appLovinWaterfallInterstitialAds;
        if (hashMap.containsKey(this.zoneId) && equals(((WeakReference) hashMap.get(this.zoneId)).get())) {
            hashMap.remove(this.zoneId);
        }
    }
}
