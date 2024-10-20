package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: InterstitialAdListener.class */
public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(Ad ad);

    void onInterstitialDisplayed(Ad ad);
}
