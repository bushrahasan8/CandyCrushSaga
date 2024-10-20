package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: AdapterAdInteractionListener.class */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdClicked();

    void onAdClosed();

    void onAdEnded();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadSuccess();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener, com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    /* synthetic */ void onAdOpened();

    void onAdShowFailed(int i, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
