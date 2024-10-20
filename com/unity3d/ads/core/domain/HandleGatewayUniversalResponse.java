package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: HandleGatewayUniversalResponse.class */
public interface HandleGatewayUniversalResponse {
    Object invoke(UniversalResponseOuterClass$UniversalResponse universalResponseOuterClass$UniversalResponse, Continuation<? super Unit> continuation);
}
