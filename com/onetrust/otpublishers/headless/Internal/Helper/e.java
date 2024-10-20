package com.onetrust.otpublishers.headless.Internal.Helper;

import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;

/* loaded from: e.class */
public abstract /* synthetic */ class e {
    public static void a(Exception exc, StringBuilder sb, String str, int i) {
        sb.append(exc.getMessage());
        OTLogger.a(str, i, sb.toString());
    }
}
