package com.unity3d.services.core.configuration;

/* loaded from: PrivacyConfigStatus.class */
public enum PrivacyConfigStatus {
    UNKNOWN,
    ALLOWED,
    DENIED;

    public String toLowerCase() {
        return name().toLowerCase();
    }
}
