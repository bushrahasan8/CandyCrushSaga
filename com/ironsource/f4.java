package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: f4.class */
public final class f4 extends c0 {
    @Override // com.ironsource.c0
    public void a() {
    }

    @Override // com.ironsource.c0
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void a(AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void a(AdInfo adInfo, boolean z) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void a(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.c0
    public void a(IronSourceError error, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void a(Placement placement, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void a(boolean z, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void b() {
    }

    @Override // com.ironsource.c0
    public void b(Placement placement, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void c(AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        a(adInfo, false);
    }

    @Override // com.ironsource.c0
    public void d(AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.c0
    public void g(AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
