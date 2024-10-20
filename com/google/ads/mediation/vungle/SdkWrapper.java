package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.InitializationListener;

/* loaded from: SdkWrapper.class */
public interface SdkWrapper {
    String getBiddingToken(Context context);

    String getSdkVersion();

    void init(Context context, String str, InitializationListener initializationListener);

    boolean isInitialized();
}
