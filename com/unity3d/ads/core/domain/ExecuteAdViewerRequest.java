package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import kotlin.coroutines.Continuation;

/* loaded from: ExecuteAdViewerRequest.class */
public interface ExecuteAdViewerRequest {
    Object invoke(RequestType requestType, Object[] objArr, Continuation<? super HttpResponse> continuation);
}
