package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;

/* loaded from: AndroidSDKPropertiesManager.class */
public final class AndroidSDKPropertiesManager implements SDKPropertiesManager {
    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitialized(boolean z) {
        SdkProperties.setInitialized(z);
    }
}
