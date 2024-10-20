package com.unity3d.services.core.extensions;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 30}, m = "withRetry")
/* loaded from: TaskExtensionsKt$withRetry$1.class */
public final class TaskExtensionsKt$withRetry$1<T> extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskExtensionsKt$withRetry$1(Continuation<? super TaskExtensionsKt$withRetry$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
    }
}
