package com.king.amp.sa;

import android.app.Activity;

/* loaded from: DefaultAdvertisingIdSource.class */
public class DefaultAdvertisingIdSource implements AdvertisingIdSource {
    @Override // com.king.amp.sa.AdvertisingIdSource
    public String getAdvertisingIdentifier() {
        return "00000000-0000-0000-0000-000000000000";
    }

    @Override // com.king.amp.sa.AdvertisingIdSource
    public boolean isAdvertisingTrackingEnabled() {
        return false;
    }

    @Override // com.king.amp.sa.AdvertisingIdSource
    public boolean isLoaded() {
        return true;
    }

    @Override // com.king.amp.sa.AdvertisingIdSource
    public void load(Activity activity) {
    }
}
