package com.unity3d.services.core.webview.bridge;

/* loaded from: INativeCallbackSubject.class */
public interface INativeCallbackSubject {
    NativeCallback getCallback(String str);

    void remove(NativeCallback nativeCallback);
}
