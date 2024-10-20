package com.iab.omid.library.unity3d.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: a.class */
public class a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
