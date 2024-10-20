package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: BaseTask.class */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    /* loaded from: BaseTask$DefaultImpls.class */
    public static final class DefaultImpls {
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
        /* renamed from: invoke-gIAlu-s, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m6596invokegIAlus(com.unity3d.services.core.domain.task.BaseTask<? super P, R> r4, P r5, kotlin.coroutines.Continuation<? super kotlin.Result> r6) {
            /*
                r0 = r6
                boolean r0 = r0 instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1
                if (r0 == 0) goto L29
                r0 = r6
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) r0
                r8 = r0
                r0 = r8
                int r0 = r0.label
                r7 = r0
                r0 = r7
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r8
                r1 = r7
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r8
                r6 = r0
                goto L32
            L29:
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                r6 = r0
            L32:
                r0 = r6
                java.lang.Object r0 = r0.result
                r9 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r6
                int r0 = r0.label
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L66
                r0 = r7
                r1 = 1
                if (r0 != r1) goto L5c
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r9
                kotlin.Result r0 = (kotlin.Result) r0
                java.lang.Object r0 = r0.m7137unboximpl()
                r4 = r0
                goto L84
            L5c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L66:
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                r1 = 1
                r0.label = r1
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.Object r0 = r0.mo6594doWorkgIAlus(r1, r2)
                r5 = r0
                r0 = r5
                r4 = r0
                r0 = r5
                r1 = r8
                if (r0 != r1) goto L84
                r0 = r8
                return r0
            L84:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m6596invokegIAlus(com.unity3d.services.core.domain.task.BaseTask, com.unity3d.services.core.domain.task.BaseParams, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo6594doWorkgIAlus(P p, Continuation<? super Result> continuation);

    /* renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo6595invokegIAlus(P p, Continuation<? super Result> continuation);
}
