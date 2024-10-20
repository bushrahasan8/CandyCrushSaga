package com.king.web;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;

@Keep
/* loaded from: RepositionEmbeddedWebViewUIThread.class */
class RepositionEmbeddedWebViewUIThread implements Runnable {
    private float mHRel;
    private float mWRel;
    private float mXRel;
    private float mYRel;

    public RepositionEmbeddedWebViewUIThread(float f, float f2, float f3, float f4) {
        this.mXRel = f;
        this.mYRel = f2;
        this.mWRel = f3;
        this.mHRel = f4;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SetJavaScriptEnabled"})
    public void run() {
        WebViewHelper.repositionEmbeddedWebView(this.mXRel, this.mYRel, this.mWRel, this.mHRel);
    }
}
