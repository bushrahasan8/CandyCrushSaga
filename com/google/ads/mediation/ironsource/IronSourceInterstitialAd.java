package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.t2;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: IronSourceInterstitialAd.class */
public class IronSourceInterstitialAd implements MediationInterstitialAd {
    static final ConcurrentHashMap availableInterstitialInstances = new ConcurrentHashMap();
    private static final IronSourceInterstitialAdListener ironSourceInterstitialListener = new IronSourceInterstitialAdListener();
    private final String bidToken;
    private final Context context;
    private final String instanceID;
    private MediationInterstitialAdCallback interstitialAdCallback;
    private final MediationAdLoadCallback mediationAdLoadCallback;

    public IronSourceInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.instanceID = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", t2.h);
        this.context = mediationInterstitialAdConfiguration.getContext();
        this.bidToken = mediationInterstitialAdConfiguration.getBidResponse();
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IronSourceInterstitialAd getFromAvailableInstances(String str) {
        ConcurrentHashMap concurrentHashMap = availableInterstitialInstances;
        return concurrentHashMap.containsKey(str) ? (IronSourceInterstitialAd) ((WeakReference) concurrentHashMap.get(str)).get() : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IronSourceInterstitialAdListener getIronSourceInterstitialListener() {
        return ironSourceInterstitialListener;
    }

    private boolean isParamsValid() {
        AdError validateIronSourceAdLoadParams = IronSourceAdapterUtils.validateIronSourceAdLoadParams(this.context, this.instanceID);
        if (validateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(validateIronSourceAdLoadParams);
            return false;
        }
        if (IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.instanceID, availableInterstitialInstances)) {
            return true;
        }
        onAdFailedToLoad(new AdError(103, String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.instanceID), IronSourceMediationAdapter.ERROR_DOMAIN));
        return false;
    }

    private boolean loadValidConfig() {
        if (!isParamsValid()) {
            return false;
        }
        availableInterstitialInstances.put(this.instanceID, new WeakReference(this));
        Log.d(IronSourceConstants.TAG, String.format("Loading IronSource interstitial ad with instance ID: %s", this.instanceID));
        return true;
    }

    private void onAdFailedToLoad(AdError adError) {
        Log.e(IronSourceConstants.TAG, adError.toString());
        MediationAdLoadCallback mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void removeFromAvailableInstances(String str) {
        availableInterstitialInstances.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediationInterstitialAdCallback getInterstitialAdCallback() {
        return this.interstitialAdCallback;
    }

    public MediationAdLoadCallback getMediationAdLoadCallback() {
        return this.mediationAdLoadCallback;
    }

    public void loadRtbAd() {
        if (loadValidConfig()) {
            IronSource.loadISDemandOnlyInterstitialWithAdm((Activity) this.context, this.instanceID, this.bidToken);
        }
    }

    public void loadWaterfallAd() {
        if (loadValidConfig()) {
            IronSource.loadISDemandOnlyInterstitial((Activity) this.context, this.instanceID);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInterstitialAdCallback(MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.interstitialAdCallback = mediationInterstitialAdCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        IronSource.showISDemandOnlyInterstitial(this.instanceID);
    }
}
