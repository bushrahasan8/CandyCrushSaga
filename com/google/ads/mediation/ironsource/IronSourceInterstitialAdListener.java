package com.google.ads.mediation.ironsource;

import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: IronSourceInterstitialAdListener.class */
public class IronSourceInterstitialAdListener implements ISDemandOnlyInterstitialListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        MediationInterstitialAdCallback interstitialAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource interstitial ad clicked for instance ID: %s", str));
        IronSourceInterstitialAd fromAvailableInstances = IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) == null) {
            return;
        }
        interstitialAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        MediationInterstitialAdCallback interstitialAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource interstitial ad closed for instance ID: %s", str));
        IronSourceInterstitialAd fromAvailableInstances = IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) != null) {
            interstitialAdCallback.onAdClosed();
        }
        IronSourceInterstitialAd.removeFromAvailableInstances(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(IronSourceConstants.TAG, adError.toString());
        IronSourceInterstitialAd fromAvailableInstances = IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && fromAvailableInstances.getMediationAdLoadCallback() != null) {
            fromAvailableInstances.getMediationAdLoadCallback().onFailure(adError);
        }
        IronSourceInterstitialAd.removeFromAvailableInstances(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        MediationInterstitialAdCallback interstitialAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource interstitial ad opened for instance ID: %s", str));
        IronSourceInterstitialAd fromAvailableInstances = IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) == null) {
            return;
        }
        interstitialAdCallback.onAdOpened();
        interstitialAdCallback.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        Log.d(IronSourceConstants.TAG, String.format("IronSource interstitial ad is ready for instance ID: %s", str));
        IronSourceInterstitialAd fromAvailableInstances = IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || fromAvailableInstances.getMediationAdLoadCallback() == null) {
            return;
        }
        fromAvailableInstances.setInterstitialAdCallback((MediationInterstitialAdCallback) fromAvailableInstances.getMediationAdLoadCallback().onSuccess(fromAvailableInstances));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationInterstitialAdCallback interstitialAdCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(IronSourceConstants.TAG, adError.toString());
        IronSourceInterstitialAd fromAvailableInstances = IronSourceInterstitialAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (interstitialAdCallback = fromAvailableInstances.getInterstitialAdCallback()) != null) {
            interstitialAdCallback.onAdFailedToShow(adError);
        }
        IronSourceInterstitialAd.removeFromAvailableInstances(str);
    }
}
