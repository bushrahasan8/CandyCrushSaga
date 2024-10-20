package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: HandleGatewayEventResponse.class */
public interface HandleGatewayEventResponse {
    Object invoke(UniversalResponseOuterClass$UniversalResponse universalResponseOuterClass$UniversalResponse, Continuation<? super Unit> continuation);
}
