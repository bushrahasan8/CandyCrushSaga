package com.ironsource.mediationsdk.adunit.adapter.listener;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: NativeAdListener.class */
public interface NativeAdListener extends AdapterAdListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdClicked();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadSuccess();

    void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder);

    /* synthetic */ void onAdOpened();
}
