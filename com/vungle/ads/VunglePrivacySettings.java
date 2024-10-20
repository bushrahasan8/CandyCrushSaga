package com.vungle.ads;

import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;

/* loaded from: VunglePrivacySettings.class */
public final class VunglePrivacySettings {
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    private VunglePrivacySettings() {
    }

    public static final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return PrivacyManager.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return PrivacyManager.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z) {
        PrivacyManager.INSTANCE.updateCcpaConsent(z ? PrivacyConsent.OPT_IN : PrivacyConsent.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean z) {
        PrivacyManager.INSTANCE.updateCoppaConsent(z);
    }

    public static final void setGDPRStatus(boolean z, String str) {
        PrivacyManager.INSTANCE.updateGdprConsent(z ? PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), "publisher", str);
    }

    public static final void setPublishAndroidId(boolean z) {
        PrivacyManager.INSTANCE.setPublishAndroidId(z);
    }
}
