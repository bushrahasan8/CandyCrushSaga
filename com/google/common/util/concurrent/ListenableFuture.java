package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: ListenableFuture.class */
public interface ListenableFuture extends Future {
    void addListener(Runnable runnable, Executor executor);
}
