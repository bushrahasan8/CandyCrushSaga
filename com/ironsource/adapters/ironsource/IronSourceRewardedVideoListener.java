package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.t2;
import com.ironsource.ya;
import org.json.JSONObject;

/* loaded from: IronSourceRewardedVideoListener.class */
public class IronSourceRewardedVideoListener implements ya {
    public final String AD_VISIBLE_EVENT_NAME = t2.h.z;
    private final String mDemandSourceName;
    boolean mIsRvDemandOnly;
    RewardedVideoSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z;
    }

    @Override // com.ironsource.ya
    public void onInterstitialAdRewarded(String str, int i) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener demandSourceId=" + str + " amount=" + i);
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.ya
    public void onInterstitialClick() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.ya
    public void onInterstitialClose() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.ya
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
        if (t2.h.z.equals(str)) {
            this.mListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.ironsource.ya
    public void onInterstitialInitFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.ya
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.ya
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.ya
    public void onInterstitialLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.ya
    public void onInterstitialOpen() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.ya
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.ironsource.ya
    public void onInterstitialShowSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }
}
