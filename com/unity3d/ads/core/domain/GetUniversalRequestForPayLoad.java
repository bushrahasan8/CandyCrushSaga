package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest;
import kotlin.coroutines.Continuation;

/* loaded from: GetUniversalRequestForPayLoad.class */
public interface GetUniversalRequestForPayLoad {
    Object invoke(UniversalRequestOuterClass$UniversalRequest.Payload payload, Continuation<? super UniversalRequestOuterClass$UniversalRequest> continuation);
}
