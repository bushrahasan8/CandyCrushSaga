package com.unity3d.ads.network;

import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import kotlin.coroutines.Continuation;

/* loaded from: HttpClient.class */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation);
}
