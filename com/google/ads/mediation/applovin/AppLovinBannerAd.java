package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: AppLovinBannerAd.class */
public class AppLovinBannerAd implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private static final String TAG = "AppLovinBannerAd";
    private final AppLovinAdFactory appLovinAdFactory;
    private AppLovinAdViewWrapper appLovinAdViewWrapper;
    private final AppLovinInitializer appLovinInitializer;
    private MediationBannerAdCallback bannerAdCallback;
    private Context context;
    private final MediationAdLoadCallback mediationAdLoadCallback;
    private final MediationBannerAdConfiguration mediationBannerAdConfiguration;
    private AppLovinSdk sdk;
    private String zoneId;

    private AppLovinBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        this.mediationBannerAdConfiguration = mediationBannerAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
    }

    public static AppLovinBannerAd newInstance(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        return new AppLovinBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
    }

    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(TAG, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner dismissed.");
    }

    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + this.zoneId);
        this.appLovinAdViewWrapper.renderAd(appLovinAd);
        this.bannerAdCallback = (MediationBannerAdCallback) this.mediationAdLoadCallback.onSuccess(this);
    }

    public void failedToReceiveAd(int i) {
        AdError adError = AppLovinUtils.getAdError(i);
        Log.w(TAG, "Failed to load banner ad with error: " + i);
        this.mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.appLovinAdViewWrapper.getAppLovinAdView();
    }

    public void loadAd() {
        this.context = this.mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = this.mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = this.mediationBannerAdConfiguration.getAdSize();
        String string = serverParameters.getString("sdkKey");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        AppLovinAdSize appLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(this.context, adSize);
        if (appLovinAdSizeFromAdMobAdSize != null) {
            this.appLovinInitializer.initialize(this.context, string, new AppLovinInitializer.OnInitializeSuccessListener(this, serverParameters, appLovinAdSizeFromAdMobAdSize) { // from class: com.google.ads.mediation.applovin.AppLovinBannerAd.1
                final AppLovinBannerAd this$0;
                final AppLovinAdSize val$appLovinAdSize;
                final Bundle val$serverParameters;

                {
                    this.this$0 = this;
                    this.val$serverParameters = serverParameters;
                    this.val$appLovinAdSize = appLovinAdSizeFromAdMobAdSize;
                }

                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(String str) {
                    AppLovinBannerAd appLovinBannerAd = this.this$0;
                    appLovinBannerAd.sdk = appLovinBannerAd.appLovinInitializer.retrieveSdk(this.val$serverParameters, this.this$0.context);
                    this.this$0.zoneId = AppLovinUtils.retrieveZoneId(this.val$serverParameters);
                    Log.d(AppLovinBannerAd.TAG, "Requesting banner of size " + this.val$appLovinAdSize + " for zone: " + this.this$0.zoneId);
                    AppLovinBannerAd appLovinBannerAd2 = this.this$0;
                    appLovinBannerAd2.appLovinAdViewWrapper = appLovinBannerAd2.appLovinAdFactory.createAdView(this.this$0.sdk, this.val$appLovinAdSize, this.this$0.context);
                    this.this$0.appLovinAdViewWrapper.setAdDisplayListener(this.this$0);
                    this.this$0.appLovinAdViewWrapper.setAdClickListener(this.this$0);
                    this.this$0.appLovinAdViewWrapper.setAdViewEventListener(this.this$0);
                    if (TextUtils.isEmpty(this.this$0.zoneId)) {
                        this.this$0.sdk.getAdService().loadNextAd(this.val$appLovinAdSize, this.this$0);
                    } else {
                        this.this$0.sdk.getAdService().loadNextAdForZoneId(this.this$0.zoneId, this.this$0);
                    }
                }
            });
            return;
        }
        AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(TAG, adError2.getMessage());
        this.mediationAdLoadCallback.onFailure(adError2);
    }
}
