package com.unity3d.services.core.configuration;

/* loaded from: IInitializationListener.class */
public interface IInitializationListener {
    void onSdkInitializationFailed(String str, ErrorState errorState, int i);

    void onSdkInitialized();
}
