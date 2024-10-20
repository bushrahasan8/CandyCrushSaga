package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
/* loaded from: BaseTask$invoke$1.class */
public final class BaseTask$invoke$1<P extends BaseParams, R> extends ContinuationImpl {
    int label;
    Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseTask$invoke$1(Continuation<? super BaseTask$invoke$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6596invokegIAlus = BaseTask.DefaultImpls.m6596invokegIAlus(null, null, this);
        return m6596invokegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6596invokegIAlus : Result.m7128boximpl(m6596invokegIAlus);
    }
}
