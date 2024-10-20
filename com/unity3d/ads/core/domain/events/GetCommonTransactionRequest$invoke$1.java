package com.unity3d.ads.core.domain.events;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.GetCommonTransactionRequest", f = "GetCommonTransactionRequest.kt", l = {14}, m = "invoke")
/* loaded from: GetCommonTransactionRequest$invoke$1.class */
public final class GetCommonTransactionRequest$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final GetCommonTransactionRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCommonTransactionRequest$invoke$1(GetCommonTransactionRequest getCommonTransactionRequest, Continuation<? super GetCommonTransactionRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = getCommonTransactionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
