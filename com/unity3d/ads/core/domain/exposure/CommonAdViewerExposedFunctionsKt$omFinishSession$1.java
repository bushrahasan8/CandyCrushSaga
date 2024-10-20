package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.om.OmFinishSession;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CommonAdViewerExposedFunctionsKt$omFinishSession$1.class */
public final class CommonAdViewerExposedFunctionsKt$omFinishSession$1 implements ExposedFunction {
    final AdObject $adObject;
    final OmFinishSession $omFinishSession;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$omFinishSession$1(OmFinishSession omFinishSession, AdObject adObject) {
        this.$omFinishSession = omFinishSession;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
            if (r0 == 0) goto L23
            r0 = r7
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) r0
            r6 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L23
            r0 = r6
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L2d
        L23:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r6 = r0
        L2d:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r7 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L57
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L4d
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7d
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L57:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.unity3d.ads.core.domain.om.OmFinishSession r0 = r0.$omFinishSession
            r9 = r0
            r0 = r5
            com.unity3d.ads.core.data.model.AdObject r0 = r0.$adObject
            r10 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r10
            r2 = r6
            java.lang.Object r0 = r0.invoke(r1, r2)
            r1 = r7
            if (r0 != r1) goto L7d
            r0 = r7
            return r0
        L7d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
