package com.vungle.ads.internal.network;

/* loaded from: Callback.class */
public interface Callback {
    void onFailure(Call call, Throwable th);

    void onResponse(Call call, Response response);
}
