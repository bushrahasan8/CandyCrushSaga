package com.google.android.gms.tasks;

/* loaded from: SuccessContinuation.class */
public interface SuccessContinuation<TResult, TContinuationResult> {
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
