package com.unity3d.ads.core.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(c = "com.unity3d.ads.core.domain.GetAndroidAdPlayerContext", f = "GetAndroidAdPlayerContext.kt", l = {15}, m = "invoke")
/* loaded from: GetAndroidAdPlayerContext$invoke$1.class */
public final class GetAndroidAdPlayerContext$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final GetAndroidAdPlayerContext this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAndroidAdPlayerContext$invoke$1(GetAndroidAdPlayerContext getAndroidAdPlayerContext, Continuation<? super GetAndroidAdPlayerContext$invoke$1> continuation) {
        super(continuation);
        this.this$0 = getAndroidAdPlayerContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
