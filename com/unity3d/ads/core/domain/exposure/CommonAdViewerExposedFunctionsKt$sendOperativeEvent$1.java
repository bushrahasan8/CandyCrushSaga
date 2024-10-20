package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1.class */
public final class CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1 implements ExposedFunction {
    final AdObject $adObject;
    final GetOperativeEventApi $getOperativeEventApi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        this.$getOperativeEventApi = getOperativeEventApi;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
            if (r0 == 0) goto L29
            r0 = r8
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L33
        L29:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L33:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L5e
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L54
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto Laa
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r0 = gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER
            r11 = r0
            r0 = r7
            r1 = 0
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2
            byte[] r0 = android.util.Base64.decode(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r1 = "decode(it[0] as String, Base64.NO_WRAP)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r7
            com.google.protobuf.ByteString r0 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r0)
            r7 = r0
            r0 = r6
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r0 = r0.$getOperativeEventApi
            r12 = r0
            r0 = r6
            com.unity3d.ads.core.data.model.AdObject r0 = r0.$adObject
            r13 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r12
            r1 = r11
            r2 = r13
            r3 = r7
            r4 = r8
            java.lang.Object r0 = r0.invoke(r1, r2, r3, r4)
            r1 = r10
            if (r0 != r1) goto Laa
            r0 = r10
            return r0
        Laa:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
