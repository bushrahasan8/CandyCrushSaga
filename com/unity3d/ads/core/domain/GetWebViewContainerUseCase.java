package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.WebViewContainer;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: GetWebViewContainerUseCase.class */
public interface GetWebViewContainerUseCase {
    Object invoke(CoroutineScope coroutineScope, Continuation<? super WebViewContainer> continuation);
}
