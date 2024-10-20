package com.unity3d.ads.core.data.datasource;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: WebviewConfigurationDataSource$set$2.class */
final class WebviewConfigurationDataSource$set$2 extends SuspendLambda implements Function2 {
    final WebViewConfigurationStore $data;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewConfigurationDataSource$set$2(WebViewConfigurationStore webViewConfigurationStore, Continuation<? super WebviewConfigurationDataSource$set$2> continuation) {
        super(2, continuation);
        this.$data = webViewConfigurationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebviewConfigurationDataSource$set$2(this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WebViewConfigurationStore webViewConfigurationStore, Continuation<? super WebViewConfigurationStore> continuation) {
        return ((WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$data;
    }
}
