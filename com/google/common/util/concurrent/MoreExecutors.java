package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* loaded from: MoreExecutors.class */
public abstract class MoreExecutors {
    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }
}
