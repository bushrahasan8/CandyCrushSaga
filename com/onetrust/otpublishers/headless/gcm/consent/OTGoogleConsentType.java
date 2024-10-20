package com.onetrust.otpublishers.headless.gcm.consent;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
/* loaded from: OTGoogleConsentType.class */
public final class OTGoogleConsentType {
    private OTGCMConsentStatus adPersonalization;
    private OTGCMConsentStatus adStorage;
    private OTGCMConsentStatus adUserData;
    private OTGCMConsentStatus analyticsStorage;
    private OTGCMConsentStatus functionalityStorage;
    private OTGCMConsentStatus personalizationStorage;
    private OTGCMConsentStatus securityStorage;

    public OTGoogleConsentType() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public OTGoogleConsentType(OTGCMConsentStatus analyticsStorage, OTGCMConsentStatus adStorage, OTGCMConsentStatus adUserData, OTGCMConsentStatus adPersonalization, OTGCMConsentStatus functionalityStorage, OTGCMConsentStatus personalizationStorage, OTGCMConsentStatus securityStorage) {
        Intrinsics.checkNotNullParameter(analyticsStorage, "analyticsStorage");
        Intrinsics.checkNotNullParameter(adStorage, "adStorage");
        Intrinsics.checkNotNullParameter(adUserData, "adUserData");
        Intrinsics.checkNotNullParameter(adPersonalization, "adPersonalization");
        Intrinsics.checkNotNullParameter(functionalityStorage, "functionalityStorage");
        Intrinsics.checkNotNullParameter(personalizationStorage, "personalizationStorage");
        Intrinsics.checkNotNullParameter(securityStorage, "securityStorage");
        this.analyticsStorage = analyticsStorage;
        this.adStorage = adStorage;
        this.adUserData = adUserData;
        this.adPersonalization = adPersonalization;
        this.functionalityStorage = functionalityStorage;
        this.personalizationStorage = personalizationStorage;
        this.securityStorage = securityStorage;
    }

    public /* synthetic */ OTGoogleConsentType(OTGCMConsentStatus oTGCMConsentStatus, OTGCMConsentStatus oTGCMConsentStatus2, OTGCMConsentStatus oTGCMConsentStatus3, OTGCMConsentStatus oTGCMConsentStatus4, OTGCMConsentStatus oTGCMConsentStatus5, OTGCMConsentStatus oTGCMConsentStatus6, OTGCMConsentStatus oTGCMConsentStatus7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OTGCMConsentStatus.UNDEFINED : oTGCMConsentStatus, (i & 2) != 0 ? OTGCMConsentStatus.UNDEFINED : oTGCMConsentStatus2, (i & 4) != 0 ? OTGCMConsentStatus.UNDEFINED : oTGCMConsentStatus3, (i & 8) != 0 ? OTGCMConsentStatus.UNDEFINED : oTGCMConsentStatus4, (i & 16) != 0 ? OTGCMConsentStatus.UNDEFINED : oTGCMConsentStatus5, (i & 32) != 0 ? OTGCMConsentStatus.UNDEFINED : oTGCMConsentStatus6, (i & 64) != 0 ? OTGCMConsentStatus.UNDEFINED : oTGCMConsentStatus7);
    }

    public static /* synthetic */ OTGoogleConsentType copy$default(OTGoogleConsentType oTGoogleConsentType, OTGCMConsentStatus oTGCMConsentStatus, OTGCMConsentStatus oTGCMConsentStatus2, OTGCMConsentStatus oTGCMConsentStatus3, OTGCMConsentStatus oTGCMConsentStatus4, OTGCMConsentStatus oTGCMConsentStatus5, OTGCMConsentStatus oTGCMConsentStatus6, OTGCMConsentStatus oTGCMConsentStatus7, int i, Object obj) {
        if ((i & 1) != 0) {
            oTGCMConsentStatus = oTGoogleConsentType.analyticsStorage;
        }
        if ((i & 2) != 0) {
            oTGCMConsentStatus2 = oTGoogleConsentType.adStorage;
        }
        if ((i & 4) != 0) {
            oTGCMConsentStatus3 = oTGoogleConsentType.adUserData;
        }
        if ((i & 8) != 0) {
            oTGCMConsentStatus4 = oTGoogleConsentType.adPersonalization;
        }
        if ((i & 16) != 0) {
            oTGCMConsentStatus5 = oTGoogleConsentType.functionalityStorage;
        }
        if ((i & 32) != 0) {
            oTGCMConsentStatus6 = oTGoogleConsentType.personalizationStorage;
        }
        if ((i & 64) != 0) {
            oTGCMConsentStatus7 = oTGoogleConsentType.securityStorage;
        }
        return oTGoogleConsentType.copy(oTGCMConsentStatus, oTGCMConsentStatus2, oTGCMConsentStatus3, oTGCMConsentStatus4, oTGCMConsentStatus5, oTGCMConsentStatus6, oTGCMConsentStatus7);
    }

    public final OTGCMConsentStatus component1() {
        return this.analyticsStorage;
    }

    public final OTGCMConsentStatus component2() {
        return this.adStorage;
    }

    public final OTGCMConsentStatus component3() {
        return this.adUserData;
    }

    public final OTGCMConsentStatus component4() {
        return this.adPersonalization;
    }

    public final OTGCMConsentStatus component5() {
        return this.functionalityStorage;
    }

    public final OTGCMConsentStatus component6() {
        return this.personalizationStorage;
    }

    public final OTGCMConsentStatus component7() {
        return this.securityStorage;
    }

    public final OTGoogleConsentType copy(OTGCMConsentStatus analyticsStorage, OTGCMConsentStatus adStorage, OTGCMConsentStatus adUserData, OTGCMConsentStatus adPersonalization, OTGCMConsentStatus functionalityStorage, OTGCMConsentStatus personalizationStorage, OTGCMConsentStatus securityStorage) {
        Intrinsics.checkNotNullParameter(analyticsStorage, "analyticsStorage");
        Intrinsics.checkNotNullParameter(adStorage, "adStorage");
        Intrinsics.checkNotNullParameter(adUserData, "adUserData");
        Intrinsics.checkNotNullParameter(adPersonalization, "adPersonalization");
        Intrinsics.checkNotNullParameter(functionalityStorage, "functionalityStorage");
        Intrinsics.checkNotNullParameter(personalizationStorage, "personalizationStorage");
        Intrinsics.checkNotNullParameter(securityStorage, "securityStorage");
        return new OTGoogleConsentType(analyticsStorage, adStorage, adUserData, adPersonalization, functionalityStorage, personalizationStorage, securityStorage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTGoogleConsentType)) {
            return false;
        }
        OTGoogleConsentType oTGoogleConsentType = (OTGoogleConsentType) obj;
        return this.analyticsStorage == oTGoogleConsentType.analyticsStorage && this.adStorage == oTGoogleConsentType.adStorage && this.adUserData == oTGoogleConsentType.adUserData && this.adPersonalization == oTGoogleConsentType.adPersonalization && this.functionalityStorage == oTGoogleConsentType.functionalityStorage && this.personalizationStorage == oTGoogleConsentType.personalizationStorage && this.securityStorage == oTGoogleConsentType.securityStorage;
    }

    public final OTGCMConsentStatus getAdPersonalization() {
        return this.adPersonalization;
    }

    public final OTGCMConsentStatus getAdStorage() {
        return this.adStorage;
    }

    public final OTGCMConsentStatus getAdUserData() {
        return this.adUserData;
    }

    public final OTGCMConsentStatus getAnalyticsStorage() {
        return this.analyticsStorage;
    }

    public final OTGCMConsentStatus getFunctionalityStorage() {
        return this.functionalityStorage;
    }

    public final OTGCMConsentStatus getPersonalizationStorage() {
        return this.personalizationStorage;
    }

    public final OTGCMConsentStatus getSecurityStorage() {
        return this.securityStorage;
    }

    public int hashCode() {
        int hashCode = this.analyticsStorage.hashCode();
        int hashCode2 = this.adStorage.hashCode();
        int hashCode3 = this.adUserData.hashCode();
        int hashCode4 = this.adPersonalization.hashCode();
        int hashCode5 = this.functionalityStorage.hashCode();
        return this.securityStorage.hashCode() + ((this.personalizationStorage.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAdPersonalization(OTGCMConsentStatus oTGCMConsentStatus) {
        Intrinsics.checkNotNullParameter(oTGCMConsentStatus, "<set-?>");
        this.adPersonalization = oTGCMConsentStatus;
    }

    public final void setAdStorage(OTGCMConsentStatus oTGCMConsentStatus) {
        Intrinsics.checkNotNullParameter(oTGCMConsentStatus, "<set-?>");
        this.adStorage = oTGCMConsentStatus;
    }

    public final void setAdUserData(OTGCMConsentStatus oTGCMConsentStatus) {
        Intrinsics.checkNotNullParameter(oTGCMConsentStatus, "<set-?>");
        this.adUserData = oTGCMConsentStatus;
    }

    public final void setAnalyticsStorage(OTGCMConsentStatus oTGCMConsentStatus) {
        Intrinsics.checkNotNullParameter(oTGCMConsentStatus, "<set-?>");
        this.analyticsStorage = oTGCMConsentStatus;
    }

    public final void setFunctionalityStorage(OTGCMConsentStatus oTGCMConsentStatus) {
        Intrinsics.checkNotNullParameter(oTGCMConsentStatus, "<set-?>");
        this.functionalityStorage = oTGCMConsentStatus;
    }

    public final void setPersonalizationStorage(OTGCMConsentStatus oTGCMConsentStatus) {
        Intrinsics.checkNotNullParameter(oTGCMConsentStatus, "<set-?>");
        this.personalizationStorage = oTGCMConsentStatus;
    }

    public final void setSecurityStorage(OTGCMConsentStatus oTGCMConsentStatus) {
        Intrinsics.checkNotNullParameter(oTGCMConsentStatus, "<set-?>");
        this.securityStorage = oTGCMConsentStatus;
    }

    public String toString() {
        return "OTGoogleConsentType(analyticsStorage=" + this.analyticsStorage + ", adStorage=" + this.adStorage + ", adUserData=" + this.adUserData + ", adPersonalization=" + this.adPersonalization + ", functionalityStorage=" + this.functionalityStorage + ", personalizationStorage=" + this.personalizationStorage + ", securityStorage=" + this.securityStorage + ')';
    }
}
