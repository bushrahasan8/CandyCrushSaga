package com.king.amp.sa;

import android.app.Activity;

/* loaded from: AdvertisingIdSource.class */
public interface AdvertisingIdSource {
    String getAdvertisingIdentifier();

    boolean isAdvertisingTrackingEnabled();

    boolean isLoaded();

    void load(Activity activity);
}
