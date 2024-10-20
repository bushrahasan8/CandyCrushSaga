package com.unity3d.services.core.configuration;

/* loaded from: IConfigurationLoaderListener.class */
public interface IConfigurationLoaderListener {
    void onError(String str);

    void onSuccess(Configuration configuration);
}
