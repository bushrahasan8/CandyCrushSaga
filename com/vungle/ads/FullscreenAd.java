package com.vungle.ads;

import android.content.Context;

/* loaded from: FullscreenAd.class */
public interface FullscreenAd extends Ad {
    @Override // com.vungle.ads.Ad
    /* synthetic */ Boolean canPlayAd();

    @Override // com.vungle.ads.Ad
    /* synthetic */ void load(String str);

    void play(Context context);
}
