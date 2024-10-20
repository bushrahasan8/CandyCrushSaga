package com.king.web;

import androidx.annotation.Keep;

@Keep
/* loaded from: WebViewListener.class */
public interface WebViewListener {
    void onWebViewBackKeyDown();

    void onWebViewBackKeyUp();

    void onWebViewMessage(int i, String str, String str2, String str3);

    void onWebViewPageLoadError(int i, String str);

    void onWebViewPageLoadSuccess(int i);
}
