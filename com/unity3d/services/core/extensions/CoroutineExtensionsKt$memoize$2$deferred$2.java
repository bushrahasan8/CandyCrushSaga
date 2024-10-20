package com.unity3d.services.core.extensions;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$2", f = "CoroutineExtensions.kt", l = {39}, m = "invokeSuspend")
/* loaded from: CoroutineExtensionsKt$memoize$2$deferred$2.class */
public final class CoroutineExtensionsKt$memoize$2$deferred$2 extends SuspendLambda implements Function2 {
    final Function2 $action;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2$deferred$2(Function2 function2, Continuation<? super CoroutineExtensionsKt$memoize$2$deferred$2> continuation) {
        super(2, continuation);
        this.$action = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoroutineExtensionsKt$memoize$2$deferred$2 coroutineExtensionsKt$memoize$2$deferred$2 = new CoroutineExtensionsKt$memoize$2$deferred$2(this.$action, continuation);
        coroutineExtensionsKt$memoize$2$deferred$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2$deferred$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Function2 function2 = this.$action;
            this.label = 1;
            Object invoke = function2.invoke(coroutineScope, this);
            obj = invoke;
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke((CoroutineScope) this.L$0, this);
    }
}
