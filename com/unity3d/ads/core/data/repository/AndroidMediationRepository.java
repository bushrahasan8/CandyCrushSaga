package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AndroidMediationRepository.class */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(MediationDataSource mediationDataSource) {
        Intrinsics.checkNotNullParameter(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public Function0 getMediationProvider() {
        return new Function0(this) { // from class: com.unity3d.ads.core.data.repository.AndroidMediationRepository$mediationProvider$1
            final AndroidMediationRepository this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0059, code lost:
            
                if (r7 == null) goto L19;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider invoke() {
                /*
                    r6 = this;
                    r0 = r6
                    com.unity3d.ads.core.data.repository.AndroidMediationRepository r0 = r0.this$0
                    java.lang.String r0 = r0.getName()
                    r7 = r0
                    r0 = r7
                    if (r0 == 0) goto L5c
                    r0 = r7
                    java.lang.String r1 = "AppLovinSdk_"
                    r2 = 0
                    r3 = 2
                    r4 = 0
                    boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
                    if (r0 == 0) goto L1f
                    gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r0 = gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider.MEDIATION_PROVIDER_MAX
                    r7 = r0
                    goto L56
                L1f:
                    r0 = r7
                    java.lang.String r1 = "AdMob"
                    r2 = 1
                    boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r2)
                    if (r0 == 0) goto L30
                    gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r0 = gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider.MEDIATION_PROVIDER_ADMOB
                    r7 = r0
                    goto L56
                L30:
                    r0 = r7
                    java.lang.String r1 = "MAX"
                    r2 = 1
                    boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r2)
                    if (r0 == 0) goto L41
                    gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r0 = gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider.MEDIATION_PROVIDER_MAX
                    r7 = r0
                    goto L56
                L41:
                    r0 = r7
                    java.lang.String r1 = "ironSource"
                    r2 = 1
                    boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r2)
                    if (r0 == 0) goto L52
                    gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r0 = gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider.MEDIATION_PROVIDER_LEVELPLAY
                    r7 = r0
                    goto L56
                L52:
                    gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r0 = gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider.MEDIATION_PROVIDER_CUSTOM
                    r7 = r0
                L56:
                    r0 = r7
                    r8 = r0
                    r0 = r7
                    if (r0 != 0) goto L60
                L5c:
                    gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r0 = gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED
                    r8 = r0
                L60:
                    r0 = r8
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidMediationRepository$mediationProvider$1.invoke():gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider");
            }
        };
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
