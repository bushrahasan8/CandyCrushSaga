package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.coroutines.Continuation;

/* loaded from: HttpClient.class */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
