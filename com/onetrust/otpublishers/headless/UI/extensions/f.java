package com.onetrust.otpublishers.headless.UI.extensions;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: f.class */
public abstract class f {
    public static final String a(String key, String defaultValue, JSONObject jSONObject) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (jSONObject != null) {
            try {
                str = jSONObject.getString(key);
            } catch (Exception e) {
                str = defaultValue;
            }
        } else {
            str = null;
        }
        if (str != null) {
            defaultValue = str;
        }
        return defaultValue;
    }

    public static final String a(JSONObject jSONObject, String key) {
        String str;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = jSONObject.getString(key);
        } catch (Exception e) {
            str = null;
        }
        return str;
    }

    public static final boolean a(String key, JSONObject jSONObject, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z2 = z;
        if (jSONObject != null) {
            try {
                z2 = jSONObject.getBoolean(key);
            } catch (Exception e) {
                z2 = z;
            }
        }
        return z2;
    }
}
