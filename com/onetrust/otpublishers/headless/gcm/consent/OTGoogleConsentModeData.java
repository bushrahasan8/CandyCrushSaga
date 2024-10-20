package com.onetrust.otpublishers.headless.gcm.consent;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
/* loaded from: OTGoogleConsentModeData.class */
public final class OTGoogleConsentModeData {
    private OTGoogleConsentType consentType;
    private OTSDKStatus sdkStatus;

    public OTGoogleConsentModeData() {
        this(null, null, 3, null);
    }

    public OTGoogleConsentModeData(OTSDKStatus sdkStatus, OTGoogleConsentType consentType) {
        Intrinsics.checkNotNullParameter(sdkStatus, "sdkStatus");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        this.sdkStatus = sdkStatus;
        this.consentType = consentType;
    }

    public /* synthetic */ OTGoogleConsentModeData(OTSDKStatus oTSDKStatus, OTGoogleConsentType oTGoogleConsentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OTSDKStatus.NOT_INITIALIZED : oTSDKStatus, (i & 2) != 0 ? new OTGoogleConsentType(null, null, null, null, null, null, null, 127, null) : oTGoogleConsentType);
    }

    public static /* synthetic */ OTGoogleConsentModeData copy$default(OTGoogleConsentModeData oTGoogleConsentModeData, OTSDKStatus oTSDKStatus, OTGoogleConsentType oTGoogleConsentType, int i, Object obj) {
        if ((i & 1) != 0) {
            oTSDKStatus = oTGoogleConsentModeData.sdkStatus;
        }
        if ((i & 2) != 0) {
            oTGoogleConsentType = oTGoogleConsentModeData.consentType;
        }
        return oTGoogleConsentModeData.copy(oTSDKStatus, oTGoogleConsentType);
    }

    public final OTSDKStatus component1() {
        return this.sdkStatus;
    }

    public final OTGoogleConsentType component2() {
        return this.consentType;
    }

    public final OTGoogleConsentModeData copy(OTSDKStatus sdkStatus, OTGoogleConsentType consentType) {
        Intrinsics.checkNotNullParameter(sdkStatus, "sdkStatus");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        return new OTGoogleConsentModeData(sdkStatus, consentType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTGoogleConsentModeData)) {
            return false;
        }
        OTGoogleConsentModeData oTGoogleConsentModeData = (OTGoogleConsentModeData) obj;
        return this.sdkStatus == oTGoogleConsentModeData.sdkStatus && Intrinsics.areEqual(this.consentType, oTGoogleConsentModeData.consentType);
    }

    public final OTGoogleConsentType getConsentType() {
        return this.consentType;
    }

    public final OTSDKStatus getSdkStatus() {
        return this.sdkStatus;
    }

    public int hashCode() {
        return this.consentType.hashCode() + (this.sdkStatus.hashCode() * 31);
    }

    public final void setConsentType(OTGoogleConsentType oTGoogleConsentType) {
        Intrinsics.checkNotNullParameter(oTGoogleConsentType, "<set-?>");
        this.consentType = oTGoogleConsentType;
    }

    public final void setSdkStatus(OTSDKStatus oTSDKStatus) {
        Intrinsics.checkNotNullParameter(oTSDKStatus, "<set-?>");
        this.sdkStatus = oTSDKStatus;
    }

    public String toString() {
        return "OTGoogleConsentModeData(sdkStatus=" + this.sdkStatus + ", consentType=" + this.consentType + ')';
    }
}
