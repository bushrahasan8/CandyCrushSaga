package com.unity3d.services.core.configuration;

/* loaded from: IConfigurationLoader.class */
public interface IConfigurationLoader {
    Configuration getLocalConfiguration();

    void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception;
}
