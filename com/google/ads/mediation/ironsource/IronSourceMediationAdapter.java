package com.google.ads.mediation.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: IronSourceMediationAdapter.class */
public class IronSourceMediationAdapter extends RtbAdapter {
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 105;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final int ERROR_SDK_NOT_INITIALIZED = 106;
    public static final String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static final AtomicBoolean isFirstLoad = new AtomicBoolean(true);
    public static final AtomicBoolean firstLoadDone = new AtomicBoolean(false);

    public static void disableLatencyFix() {
        Log.d(IronSourceConstants.TAG, "disable latency fix, do not force fail first loads.");
        isFirstLoad.set(false);
        firstLoadDone.set(true);
    }

    public static void enableLatencyFix() {
        Log.d(IronSourceConstants.TAG, "enable latency fix, fail status on first load.");
        isFirstLoad.set(true);
        firstLoadDone.set(false);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sDKVersion = IronSourceUtils.getSDKVersion();
        String[] split = sDKVersion.split("\\.");
        if (split.length < 3) {
            Log.w(IronSourceConstants.TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion));
            return new VersionInfo(0, 0, 0);
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[2]);
        int i = parseInt3;
        if (split.length >= 4) {
            i = (parseInt3 * 100) + Integer.parseInt(split[3]);
        }
        return new VersionInfo(parseInt, parseInt2, i);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String adapterVersion = IronSourceAdapterUtils.getAdapterVersion();
        String[] split = adapterVersion.split("\\.");
        if (split.length < 4) {
            Log.w(IronSourceConstants.TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
            return new VersionInfo(0, 0, 0);
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]);
        int i = parseInt3;
        if (split.length >= 5) {
            i = (parseInt3 * 100) + Integer.parseInt(split[4]);
        }
        return new VersionInfo(parseInt, parseInt2, i);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (isInitialized.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ERROR_DOMAIN).getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ERROR_DOMAIN).getMessage());
            return;
        }
        if (size > 1) {
            Log.w(IronSourceConstants.TAG, String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str));
        }
        IronSource.setMediationType("AdMob410");
        Log.d(IronSourceConstants.TAG, "Initializing IronSource SDK with app key: " + str);
        IronSource.initISDemandOnly(context, str, IronSource.AD_UNIT.INTERSTITIAL, IronSource.AD_UNIT.REWARDED_VIDEO, IronSource.AD_UNIT.BANNER);
        isInitialized.set(true);
        initializationCompleteCallback.onInitializationSucceeded();
        IronSource.setISDemandOnlyInterstitialListener(IronSourceInterstitialAd.getIronSourceInterstitialListener());
        IronSource.setISDemandOnlyRewardedVideoListener(IronSourceRewardedAd.getIronSourceRewardedListener());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (isInitialized.get()) {
            new IronSourceBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback).loadAd();
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(IronSourceConstants.TAG, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (isInitialized.get()) {
            new IronSourceInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadWaterfallAd();
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(IronSourceConstants.TAG, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            AdError adError = new AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", ERROR_DOMAIN);
            Log.w(IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        AtomicBoolean atomicBoolean = isFirstLoad;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            AdError adError2 = new AdError(1158, "(latency fix) ABM intends fail on first load", ERROR_DOMAIN);
            Log.w(IronSourceConstants.TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        } else if (!firstLoadDone.get()) {
            AdError adError3 = new AdError(1158, "(latency fix) ABM first load still in progress; expect load failure", ERROR_DOMAIN);
            Log.w(IronSourceConstants.TAG, adError3.getMessage());
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        new IronSourceRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadWaterfallAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(IronSourceConstants.TAG, "IronSource adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from IronSource.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (isInitialized.get()) {
            new IronSourceInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadRtbAd();
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource RTB interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(IronSourceConstants.TAG, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (isInitialized.get()) {
            new IronSourceRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadRtbAd();
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource RTB rewarded ad since IronSource SDK is not initialized.", ERROR_DOMAIN);
        Log.w(IronSourceConstants.TAG, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    public void setIsInitialized(boolean z) {
        isInitialized.set(z);
    }
}
