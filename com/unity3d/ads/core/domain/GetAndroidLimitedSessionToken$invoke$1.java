package com.unity3d.ads.core.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(c = "com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken", f = "GetAndroidLimitedSessionToken.kt", l = {20, 21, 22, 23}, m = "invoke")
/* loaded from: GetAndroidLimitedSessionToken$invoke$1.class */
public final class GetAndroidLimitedSessionToken$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final GetAndroidLimitedSessionToken this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAndroidLimitedSessionToken$invoke$1(GetAndroidLimitedSessionToken getAndroidLimitedSessionToken, Continuation<? super GetAndroidLimitedSessionToken$invoke$1> continuation) {
        super(continuation);
        this.this$0 = getAndroidLimitedSessionToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
