package com.facebook.internal;

import kotlin.text.StringsKt;

/* loaded from: InternalSettings.class */
public final class InternalSettings {
    public static final InternalSettings INSTANCE = new InternalSettings();
    private static volatile String customUserAgent;

    private InternalSettings() {
    }

    public static final String getCustomUserAgent() {
        return customUserAgent;
    }

    public static final boolean isUnityApp() {
        String str = customUserAgent;
        boolean z = false;
        if (str != null) {
            z = false;
            if (StringsKt.startsWith$default(str, "Unity.", false, 2, (Object) null)) {
                z = true;
            }
        }
        return z;
    }
}
