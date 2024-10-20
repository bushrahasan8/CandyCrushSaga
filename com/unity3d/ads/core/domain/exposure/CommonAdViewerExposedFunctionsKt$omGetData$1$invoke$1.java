package com.unity3d.ads.core.domain.exposure;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1", f = "CommonAdViewerExposedFunctions.kt", l = {325}, m = "invoke")
/* loaded from: CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.class */
public final class CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 extends ContinuationImpl {
    int label;
    Object result;
    final CommonAdViewerExposedFunctionsKt$omGetData$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(CommonAdViewerExposedFunctionsKt$omGetData$1 commonAdViewerExposedFunctionsKt$omGetData$1, Continuation<? super CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonAdViewerExposedFunctionsKt$omGetData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (Continuation<Object>) this);
    }
}
