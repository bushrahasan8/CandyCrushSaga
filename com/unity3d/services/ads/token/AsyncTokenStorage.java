package com.unity3d.services.ads.token;

import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;

/* loaded from: AsyncTokenStorage.class */
public interface AsyncTokenStorage {
    void getToken(IBiddingManager iBiddingManager);

    void onTokenAvailable();

    void setConfiguration(Configuration configuration);
}
