package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import gatewayprotocol.v1.AdResponseOuterClass$AdResponse;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType;
import kotlin.coroutines.Continuation;

/* loaded from: HandleGatewayAdResponse.class */
public interface HandleGatewayAdResponse {
    Object invoke(UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass$AdResponse adResponseOuterClass$AdResponse, Context context, String str, DiagnosticEventRequestOuterClass$DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType, boolean z, Continuation<? super LoadResult> continuation);
}
