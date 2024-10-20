package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest;
import kotlin.coroutines.Continuation;

/* loaded from: GetAdDataRefreshRequest.class */
public interface GetAdDataRefreshRequest {
    Object invoke(ByteString byteString, ByteString byteString2, Continuation<? super UniversalRequestOuterClass$UniversalRequest> continuation);
}
