package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: zzfpj.class */
public final class zzfpj extends zzfpi {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfpj(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzj(webView);
    }
}
