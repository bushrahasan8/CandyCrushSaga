package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.Ad;

/* loaded from: FullScreenAd.class */
public interface FullScreenAd extends Ad {

    @Keep
    /* loaded from: FullScreenAd$ShowAdConfig.class */
    public interface ShowAdConfig {
    }

    @Keep
    /* loaded from: FullScreenAd$ShowConfigBuilder.class */
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
