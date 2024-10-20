package com.onetrust.otpublishers.headless.Internal.Helper;

import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import org.json.JSONException;

/* loaded from: g.class */
public abstract /* synthetic */ class g {
    public static void a(JSONException jSONException, StringBuilder sb, String str, int i) {
        sb.append(jSONException.toString());
        OTLogger.a(str, i, sb.toString());
    }
}
