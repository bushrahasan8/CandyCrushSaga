package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: StartedLazily$command$1.class */
final class StartedLazily$command$1 extends SuspendLambda implements Function2 {
    final StateFlow $subscriptionCount;
    private Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    /* loaded from: StartedLazily$command$1$1.class */
    public static final class AnonymousClass1 implements FlowCollector {
        final FlowCollector $$this$flow;
        final Ref$BooleanRef $started;

        AnonymousClass1(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector) {
            this.$started = ref$BooleanRef;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(int r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                if (r0 == 0) goto L29
                r0 = r7
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                r9 = r0
                r0 = r9
                int r0 = r0.label
                r8 = r0
                r0 = r8
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r9
                r1 = r8
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r9
                r7 = r0
                goto L33
            L29:
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L33:
                r0 = r7
                java.lang.Object r0 = r0.result
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r9 = r0
                r0 = r7
                int r0 = r0.label
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L5e
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L54
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L9d
            L54:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L5e:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                if (r0 <= 0) goto La1
                r0 = r5
                kotlin.jvm.internal.Ref$BooleanRef r0 = r0.$started
                r10 = r0
                r0 = r10
                boolean r0 = r0.element
                if (r0 != 0) goto La1
                r0 = r10
                r1 = 1
                r0.element = r1
                r0 = r5
                kotlinx.coroutines.flow.FlowCollector r0 = r0.$$this$flow
                r10 = r0
                kotlinx.coroutines.flow.SharingCommand r0 = kotlinx.coroutines.flow.SharingCommand.START
                r11 = r0
                r0 = r7
                r1 = 1
                r0.label = r1
                r0 = r10
                r1 = r11
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r9
                if (r0 != r1) goto L9d
                r0 = r9
                return r0
            L9d:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            La1:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.AnonymousClass1.emit(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(StateFlow stateFlow, Continuation continuation) {
        super(2, continuation);
        this.$subscriptionCount = stateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, continuation);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
        return ((StartedLazily$command$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            StateFlow stateFlow = this.$subscriptionCount;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, flowCollector);
            this.label = 1;
            if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
