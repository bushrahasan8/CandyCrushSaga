package com.ironsource.mediationsdk.adunit.adapter.listener;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: RewardedVideoAdListener.class */
public interface RewardedVideoAdListener extends AdapterAdRewardListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdClicked();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdClosed();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdEnded();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadSuccess();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener, com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    /* synthetic */ void onAdOpened();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    /* synthetic */ void onAdRewarded();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdShowFailed(int i, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdShowSuccess();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdStarted();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    /* synthetic */ void onAdVisible();
}
