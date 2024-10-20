package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: AdapterAdViewListener.class */
public interface AdapterAdViewListener extends AdapterAdListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdClicked();

    void onAdLeftApplication();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    /* synthetic */ void onAdLoadSuccess();

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener, com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    /* synthetic */ void onAdOpened();

    void onAdScreenDismissed();

    void onAdScreenPresented();
}
