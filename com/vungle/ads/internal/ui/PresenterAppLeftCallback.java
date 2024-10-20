package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.util.ActivityManager;

/* loaded from: PresenterAppLeftCallback.class */
public final class PresenterAppLeftCallback implements ActivityManager.LeftApplicationCallback {
    private final AdEventListener bus;
    private final String placementRefId;

    public PresenterAppLeftCallback(AdEventListener adEventListener, String str) {
        this.bus = adEventListener;
        this.placementRefId = str;
    }

    @Override // com.vungle.ads.internal.util.ActivityManager.LeftApplicationCallback
    public void onLeftApplication() {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(MRAIDPresenter.OPEN, "adLeftApplication", this.placementRefId);
        }
    }
}
