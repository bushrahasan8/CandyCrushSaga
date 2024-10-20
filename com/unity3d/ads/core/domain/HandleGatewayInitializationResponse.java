package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: HandleGatewayInitializationResponse.class */
public interface HandleGatewayInitializationResponse {
    Object invoke(InitializationResponseOuterClass$InitializationResponse initializationResponseOuterClass$InitializationResponse, Continuation<? super Unit> continuation);
}
