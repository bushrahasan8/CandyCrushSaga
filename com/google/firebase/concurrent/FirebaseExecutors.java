package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* loaded from: FirebaseExecutors.class */
public abstract class FirebaseExecutors {
    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
