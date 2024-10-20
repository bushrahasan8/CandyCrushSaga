package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;

/* loaded from: PiiPrivacyMode.class */
public enum PiiPrivacyMode {
    APP,
    NONE,
    MIXED,
    UNDEFINED,
    NULL;

    public static PiiPrivacyMode getPiiPrivacyMode(String str) {
        PiiPrivacyMode piiPrivacyMode;
        if (str == null) {
            return NULL;
        }
        PiiPrivacyMode piiPrivacyMode2 = UNDEFINED;
        try {
            piiPrivacyMode = valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            piiPrivacyMode = piiPrivacyMode2;
        }
        return piiPrivacyMode;
    }
}
