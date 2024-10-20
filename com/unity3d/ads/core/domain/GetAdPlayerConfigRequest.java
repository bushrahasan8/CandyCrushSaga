package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest;
import kotlin.coroutines.Continuation;

/* loaded from: GetAdPlayerConfigRequest.class */
public interface GetAdPlayerConfigRequest {
    Object invoke(String str, ByteString byteString, ByteString byteString2, Continuation<? super UniversalRequestOuterClass$UniversalRequest> continuation);
}
