package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: p8.class */
public class p8 extends c0 {
    @Override // com.ironsource.c0
    public void a(AdInfo adInfo) {
        v6.a().c(adInfo);
    }

    @Override // com.ironsource.c0
    public void a(AdInfo adInfo, boolean z) {
        v6.a().e(adInfo);
    }

    @Override // com.ironsource.c0
    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        v6.a().a(ironSourceError, adInfo);
    }

    @Override // com.ironsource.c0
    public void a(Placement placement, AdInfo adInfo) {
        v6.a().b(adInfo);
    }

    @Override // com.ironsource.c0
    public void d(AdInfo adInfo) {
        v6.a().d(adInfo);
    }

    @Override // com.ironsource.c0
    public void g(AdInfo adInfo) {
        v6.a().f(adInfo);
    }
}
