package com.king.web;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;

@Keep
/* loaded from: ShowEmbeddedWebViewUIThread.class */
class ShowEmbeddedWebViewUIThread implements Runnable {
    @Override // java.lang.Runnable
    @SuppressLint({"SetJavaScriptEnabled"})
    public void run() {
        WebViewHelper.setEmbeddedWebViewVisibility(0);
        WebViewHelper.reapplyPositionAndSize();
    }
}
