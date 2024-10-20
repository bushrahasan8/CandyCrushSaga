package com.king.web;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;

@Keep
/* loaded from: HideEmbeddedWebViewUIThread.class */
class HideEmbeddedWebViewUIThread implements Runnable {
    @Override // java.lang.Runnable
    @SuppressLint({"SetJavaScriptEnabled"})
    public void run() {
        WebViewHelper.setEmbeddedWebViewVisibility(4);
    }
}
