package com.applovin.impl;

/* loaded from: w.class */
public enum w {
    UNKNOWN(0),
    APPLOVIN_PRIMARY_ZONE(1),
    APPLOVIN_CUSTOM_ZONE(2),
    APPLOVIN_MULTIZONE(3),
    REGULAR_AD_TOKEN(4),
    DECODED_AD_TOKEN_JSON(5);

    private final int a;

    w(int i2) {
        this.a = i2;
    }

    public static w a(int i2) {
        return i2 == 1 ? APPLOVIN_PRIMARY_ZONE : i2 == 2 ? APPLOVIN_CUSTOM_ZONE : i2 == 3 ? APPLOVIN_MULTIZONE : i2 == 4 ? REGULAR_AD_TOKEN : i2 == 5 ? DECODED_AD_TOKEN_JSON : UNKNOWN;
    }

    public int b() {
        return this.a;
    }
}
