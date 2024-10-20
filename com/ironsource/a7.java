package com.ironsource;

import android.webkit.JavascriptInterface;

/* loaded from: a7.class */
public class a7 {
    private d7 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a7(d7 d7Var) {
        this.a = d7Var;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.a.handleMessageFromAd(str);
    }
}
