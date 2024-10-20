package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: PrivacyUrlError.class */
public final class PrivacyUrlError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyUrlError(String privacyUrl) {
        super(136, Sdk$SDKError.Reason.PRIVACY_URL_ERROR, "Failed to open privacy url: " + privacyUrl, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(privacyUrl, "privacyUrl");
    }
}
