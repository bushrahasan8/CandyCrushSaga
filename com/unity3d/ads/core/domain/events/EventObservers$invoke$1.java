package com.unity3d.ads.core.domain.events;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {16, 17, 18}, m = "invoke")
/* loaded from: EventObservers$invoke$1.class */
public final class EventObservers$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final EventObservers this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventObservers$invoke$1(EventObservers eventObservers, Continuation<? super EventObservers$invoke$1> continuation) {
        super(continuation);
        this.this$0 = eventObservers;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
