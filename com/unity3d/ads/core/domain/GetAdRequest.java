package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdRequestOuterClass$BannerSize;
import gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest;
import kotlin.coroutines.Continuation;

/* loaded from: GetAdRequest.class */
public interface GetAdRequest {

    /* loaded from: GetAdRequest$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass$BannerSize adRequestOuterClass$BannerSize, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                adRequestOuterClass$BannerSize = null;
            }
            return getAdRequest.invoke(str, byteString, adRequestOuterClass$BannerSize, continuation);
        }
    }

    Object invoke(String str, ByteString byteString, AdRequestOuterClass$BannerSize adRequestOuterClass$BannerSize, Continuation<? super UniversalRequestOuterClass$UniversalRequest> continuation);
}
