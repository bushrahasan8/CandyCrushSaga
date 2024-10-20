package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: HandleGatewayAndroidEventResponse.class */
public final class HandleGatewayAndroidEventResponse implements HandleGatewayEventResponse {
    @Override // com.unity3d.ads.core.domain.events.HandleGatewayEventResponse
    public Object invoke(UniversalResponseOuterClass$UniversalResponse universalResponseOuterClass$UniversalResponse, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
