package com.vungle.ads.internal.network;

import java.io.IOException;

/* loaded from: Call.class */
public interface Call {
    void cancel();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();
}
