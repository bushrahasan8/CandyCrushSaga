package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: a.class */
public class a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
