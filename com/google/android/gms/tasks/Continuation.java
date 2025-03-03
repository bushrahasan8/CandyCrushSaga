package com.google.android.gms.tasks;

/* loaded from: Continuation.class */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(Task<TResult> task) throws Exception;
}
