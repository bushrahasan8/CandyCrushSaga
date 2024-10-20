package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CommonAdViewerExposedFunctionsKt$omStartSession$1.class */
public final class CommonAdViewerExposedFunctionsKt$omStartSession$1 implements ExposedFunction {
    final AdObject $adObject;
    final AndroidOmStartSession $omStartSession;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$omStartSession$1(AndroidOmStartSession androidOmStartSession, AdObject adObject) {
        this.$omStartSession = androidOmStartSession;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
            if (r0 == 0) goto L29
            r0 = r7
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) r0
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
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
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
            goto L94
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
            r1 = 0
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            java.lang.String r1 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r0 = r6
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r6 = r0
            r0 = r5
            com.unity3d.ads.core.domain.om.AndroidOmStartSession r0 = r0.$omStartSession
            r11 = r0
            r0 = r5
            com.unity3d.ads.core.data.model.AdObject r0 = r0.$adObject
            r10 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r10
            r2 = r6
            r3 = r7
            java.lang.Object r0 = r0.invoke(r1, r2, r3)
            r1 = r9
            if (r0 != r1) goto L94
            r0 = r9
            return r0
        L94:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
