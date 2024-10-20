package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: GetAndroidLimitedSessionToken.class */
public final class GetAndroidLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    public GetAndroidLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken> r6) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
