package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;

/* loaded from: IWebViewBridgeSharedObjectStore.class */
public interface IWebViewBridgeSharedObjectStore<T extends IWebViewSharedObject> {
    T get(String str);

    void remove(String str);

    void set(T t);
}
