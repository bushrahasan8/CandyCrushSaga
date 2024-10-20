package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.t2;
import com.ironsource.ya;
import org.json.JSONObject;

/* loaded from: IronSourceInterstitialListener.class */
public class IronSourceInterstitialListener implements ya {
    public final String AD_VISIBLE_EVENT_NAME = t2.h.z;
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.ironsource.ya
    public void onInterstitialAdRewarded(String str, int i) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener demandSourceId=" + str + " amount=" + i);
    }

    @Override // com.ironsource.ya
    public void onInterstitialClick() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.ironsource.ya
    public void onInterstitialClose() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.ironsource.ya
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if (t2.h.z.equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.ironsource.ya
    public void onInterstitialInitFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.ya
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.ya
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.ironsource.ya
    public void onInterstitialLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.ironsource.ya
    public void onInterstitialOpen() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.ironsource.ya
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.ironsource.ya
    public void onInterstitialShowSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
