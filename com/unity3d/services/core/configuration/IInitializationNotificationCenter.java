package com.unity3d.services.core.configuration;

/* loaded from: IInitializationNotificationCenter.class */
public interface IInitializationNotificationCenter {
    void addListener(IInitializationListener iInitializationListener);

    void removeListener(IInitializationListener iInitializationListener);

    void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i);

    void triggerOnSdkInitialized();
}
