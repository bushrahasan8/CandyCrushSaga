package com.unity3d.ads.adplayer;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: WebViewContainer.class */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, Continuation<? super Unit> continuation);

    Object destroy(Continuation<? super Unit> continuation);

    Object evaluateJavascript(String str, Continuation<? super Unit> continuation);

    Object loadUrl(String str, Continuation<? super Unit> continuation);
}
