package com.google.android.gms.ads.mediation;

/* loaded from: MediationAdCallback.class */
public interface MediationAdCallback {
    void onAdClosed();

    void onAdOpened();

    void reportAdClicked();

    void reportAdImpression();
}
