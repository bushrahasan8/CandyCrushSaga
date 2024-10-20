package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: HttpResponseKt.class */
public final class HttpResponseKt {
    public static final boolean isSuccessful(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        boolean z = false;
        if (200 <= statusCode) {
            z = false;
            if (statusCode < 300) {
                z = true;
            }
        }
        return z;
    }

    public static final HttpResponse toHttpResponse(UnityAdsNetworkException unityAdsNetworkException) {
        Intrinsics.checkNotNullParameter(unityAdsNetworkException, "<this>");
        Integer code = unityAdsNetworkException.getCode();
        int intValue = code != null ? code.intValue() : 520;
        Map emptyMap = MapsKt.emptyMap();
        String url = unityAdsNetworkException.getUrl();
        if (url == null) {
            url = "";
        }
        String protocol = unityAdsNetworkException.getProtocol();
        if (protocol == null) {
            protocol = "";
        }
        String client = unityAdsNetworkException.getClient();
        String str = client;
        if (client == null) {
            str = "unknown";
        }
        return new HttpResponse("", intValue, emptyMap, url, protocol, str, 0L, 64, null);
    }
}
