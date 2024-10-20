package com.google.common.util.concurrent;

/* loaded from: FutureCallback.class */
public interface FutureCallback {
    void onFailure(Throwable th);

    void onSuccess(Object obj);
}
