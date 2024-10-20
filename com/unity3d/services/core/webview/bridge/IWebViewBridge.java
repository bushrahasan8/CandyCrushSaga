package com.unity3d.services.core.webview.bridge;

/* loaded from: IWebViewBridge.class */
public interface IWebViewBridge {
    void handleCallback(String str, String str2, Object[] objArr) throws Exception;

    void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception;
}
