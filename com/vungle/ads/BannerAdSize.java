package com.vungle.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: BannerAdSize.class */
public enum BannerAdSize {
    VUNGLE_MREC("mrec", 300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED),
    BANNER("banner", 320, 50),
    BANNER_SHORT("banner_short", 300, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

    private final int height;
    private final String sizeName;
    private final int width;

    BannerAdSize(String str, int i, int i2) {
        this.sizeName = str;
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final int getWidth() {
        return this.width;
    }
}
