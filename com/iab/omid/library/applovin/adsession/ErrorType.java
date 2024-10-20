package com.iab.omid.library.applovin.adsession;

import com.unity3d.services.core.device.MimeTypes;

/* loaded from: ErrorType.class */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}
