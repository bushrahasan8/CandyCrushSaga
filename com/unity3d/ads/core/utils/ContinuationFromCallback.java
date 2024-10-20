package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ContinuationFromCallback.class */
public final class ContinuationFromCallback extends WebViewCallback {
    private final Continuation<Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(Continuation<Object> continuation) {
        super("", 0);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r7, Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation<Object> continuation = this.continuation;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m7129constructorimpl(ResultKt.createFailure(new ExposureException("Invocation failed with: " + r7, params))));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.continuation.resumeWith(Result.m7129constructorimpl(params));
    }
}
