package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.AllowedPiiOuterClass$AllowedPii;
import gatewayprotocol.v1.PiiOuterClass$Pii;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: PrivacyDeviceInfoDataSource.class */
public interface PrivacyDeviceInfoDataSource {

    /* loaded from: PrivacyDeviceInfoDataSource$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ PiiOuterClass$Pii fetch$default(PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, AllowedPiiOuterClass$AllowedPii allowedPiiOuterClass$AllowedPii, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                allowedPiiOuterClass$AllowedPii = AllowedPiiOuterClass$AllowedPii.getDefaultInstance();
                Intrinsics.checkNotNullExpressionValue(allowedPiiOuterClass$AllowedPii, "getDefaultInstance()");
            }
            return privacyDeviceInfoDataSource.fetch(allowedPiiOuterClass$AllowedPii);
        }
    }

    PiiOuterClass$Pii fetch(AllowedPiiOuterClass$AllowedPii allowedPiiOuterClass$AllowedPii);
}
