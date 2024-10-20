package com.braze.enums;

import com.ironsource.i5;

/* loaded from: DeviceKey.class */
public enum DeviceKey {
    ANDROID_VERSION("os_version"),
    CARRIER(i5.s0),
    BRAND("brand"),
    MODEL(i5.u),
    RESOLUTION("resolution"),
    LOCALE("locale"),
    TIMEZONE("time_zone"),
    NOTIFICATIONS_ENABLED("remote_notification_enabled"),
    IS_BACKGROUND_RESTRICTED("android_is_background_restricted"),
    GOOGLE_ADVERTISING_ID("google_ad_id"),
    AD_TRACKING_ENABLED("ad_tracking_enabled");

    private final String key;

    DeviceKey(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
