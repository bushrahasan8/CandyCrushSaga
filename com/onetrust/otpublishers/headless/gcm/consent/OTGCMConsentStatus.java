package com.onetrust.otpublishers.headless.gcm.consent;

import androidx.annotation.Keep;

@Keep
/* loaded from: OTGCMConsentStatus.class */
public enum OTGCMConsentStatus {
    GRANTED("granted"),
    DENIED("denied"),
    UNDEFINED("undefined"),
    UNASSIGNED("unassigned");

    private final String status;

    OTGCMConsentStatus(String str) {
        this.status = str;
    }

    public final String getStatus() {
        return this.status;
    }
}
