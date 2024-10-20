package com.onetrust.otpublishers.headless.Internal.Helper;

import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import org.json.JSONException;

/* loaded from: h.class */
public abstract /* synthetic */ class h {
    public static void a(JSONException jSONException, StringBuilder sb, String str, int i) {
        sb.append(jSONException.getMessage());
        OTLogger.a(str, i, sb.toString());
    }
}
