package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

@KeepForSdk
/* loaded from: ProxyApi.class */
public interface ProxyApi {

    @KeepForSdk
    /* loaded from: ProxyApi$ProxyResult.class */
    public interface ProxyResult extends Result {
        @KeepForSdk
        ProxyResponse getResponse();
    }

    @KeepForSdk
    /* loaded from: ProxyApi$SpatulaHeaderResult.class */
    public interface SpatulaHeaderResult extends Result {
        @KeepForSdk
        String getSpatulaHeader();
    }

    @KeepForSdk
    PendingResult<SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient googleApiClient);

    @KeepForSdk
    PendingResult<ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest);
}
