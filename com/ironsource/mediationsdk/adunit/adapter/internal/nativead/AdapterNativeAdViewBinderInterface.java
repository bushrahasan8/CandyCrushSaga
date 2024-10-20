package com.ironsource.mediationsdk.adunit.adapter.internal.nativead;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;

/* loaded from: AdapterNativeAdViewBinderInterface.class */
public interface AdapterNativeAdViewBinderInterface extends NativeAdViewBinderInterface {
    ViewGroup getNetworkNativeAdView();

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    /* synthetic */ void setAdvertiserView(View view);

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    /* synthetic */ void setBodyView(View view);

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    /* synthetic */ void setCallToActionView(View view);

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    /* synthetic */ void setIconView(View view);

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    /* synthetic */ void setMediaView(LevelPlayMediaView levelPlayMediaView);

    void setNativeAdView(View view);

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    /* synthetic */ void setTitleView(View view);
}
