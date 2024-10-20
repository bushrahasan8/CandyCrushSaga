package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: WebViewBridge.class */
public interface WebViewBridge {
    SharedFlow getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, Continuation<? super Object[]> continuation);

    Object sendEvent(WebViewEvent webViewEvent, Continuation<? super Unit> continuation);
}
