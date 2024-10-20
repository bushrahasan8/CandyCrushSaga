package com.ironsource.mediationsdk.adunit.adapter.listener;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: BannerAdListener.class */
public interface BannerAdListener extends AdapterAdViewListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdClicked();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    /* synthetic */ void onAdLeftApplication();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadSuccess();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener, com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    /* synthetic */ void onAdOpened();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    /* synthetic */ void onAdScreenDismissed();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    /* synthetic */ void onAdScreenPresented();
}
