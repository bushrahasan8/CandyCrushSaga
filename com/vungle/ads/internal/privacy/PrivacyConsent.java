package com.vungle.ads.internal.privacy;

/* loaded from: PrivacyConsent.class */
public enum PrivacyConsent {
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");

    private final String value;

    PrivacyConsent(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
