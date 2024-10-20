package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* loaded from: r.class */
class r {
    private s a;
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        this.a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.a.b();
    }
}
