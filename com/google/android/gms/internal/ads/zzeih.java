package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* loaded from: zzeih.class */
public enum zzeih {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);

    private final String zze;

    zzeih(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
