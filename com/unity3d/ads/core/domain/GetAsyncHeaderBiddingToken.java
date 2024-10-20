package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsTokenListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: GetAsyncHeaderBiddingToken.class */
public interface GetAsyncHeaderBiddingToken {
    Object invoke(IUnityAdsTokenListener iUnityAdsTokenListener, Continuation<? super Unit> continuation);
}
