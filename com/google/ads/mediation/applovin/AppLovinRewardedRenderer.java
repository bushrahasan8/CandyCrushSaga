package com.google.ads.mediation.applovin;

import android.util.Log;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Map;

/* loaded from: AppLovinRewardedRenderer.class */
public abstract class AppLovinRewardedRenderer implements MediationRewardedAd, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
    protected static final String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";
    protected static final String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.";
    protected static final String TAG = "AppLovinRewardedRenderer";
    protected final MediationRewardedAdConfiguration adConfiguration;
    protected final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    protected final AppLovinAdFactory appLovinAdFactory;
    protected final AppLovinInitializer appLovinInitializer;
    protected AppLovinSdk appLovinSdk;
    protected final AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper;
    private boolean fullyWatched;
    protected AppLovinIncentivizedInterstitial incentivizedInterstitial;
    private AppLovinRewardItem rewardItem;
    protected MediationRewardedAdCallback rewardedAdCallback;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinRewardedRenderer(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory, AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
        this.appLovinSdkUtilsWrapper = appLovinSdkUtilsWrapper;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video displayed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.rewardedAdCallback.reportAdImpression();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        if (this.fullyWatched) {
            mediationRewardedAdCallback.onUserEarnedReward(this.rewardItem);
        }
        this.rewardedAdCallback.onAdClosed();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        Log.i(TAG, "Rewarded video did load ad: " + appLovinAd.getAdIdNumber());
        this.appLovinSdkUtilsWrapper.runOnUiThread(new Runnable(this) { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.1
            final AppLovinRewardedRenderer this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                AppLovinRewardedRenderer appLovinRewardedRenderer = this.this$0;
                appLovinRewardedRenderer.rewardedAdCallback = appLovinRewardedRenderer.adLoadCallback.onSuccess(appLovinRewardedRenderer);
            }
        });
    }

    public void failedToReceiveAd(int i) {
        AdError adError = AppLovinUtils.getAdError(i);
        Log.w(TAG, adError.toString());
        this.appLovinSdkUtilsWrapper.runOnUiThread(new Runnable(this, adError) { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.2
            final AppLovinRewardedRenderer this$0;
            final AdError val$error;

            {
                this.this$0 = this;
                this.val$error = adError;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.adLoadCallback.onFailure(this.val$error);
            }
        });
    }

    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request was rejected with response: " + map);
    }

    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        String str = map.get(InAppPurchaseMetaData.KEY_CURRENCY);
        int parseDouble = (int) Double.parseDouble(map.get("amount"));
        Log.d(TAG, "Rewarded " + parseDouble + " " + str);
        this.rewardItem = new AppLovinRewardItem(parseDouble, str);
    }

    public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
        Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i);
    }

    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video playback began.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
        Log.d(TAG, "Rewarded video playback ended at playback percent: " + d + "%.");
        this.fullyWatched = z;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null || !z) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
    }
}
