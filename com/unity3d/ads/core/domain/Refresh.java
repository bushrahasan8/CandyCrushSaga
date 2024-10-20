package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse;
import kotlin.coroutines.Continuation;

/* loaded from: Refresh.class */
public interface Refresh {
    Object invoke(ByteString byteString, ByteString byteString2, Continuation<? super AdDataRefreshResponseOuterClass$AdDataRefreshResponse> continuation);
}
