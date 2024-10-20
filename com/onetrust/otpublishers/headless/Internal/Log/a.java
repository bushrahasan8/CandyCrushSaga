package com.onetrust.otpublishers.headless.Internal.Log;

import android.os.Build;

/* loaded from: a.class */
public abstract class a {
    public static void a() {
        OTLogger.a("***********************************", "DEVICE LOGS -***********************************");
        OTLogger.a("MODEL", Build.MODEL);
        OTLogger.a("Manufacture", Build.MANUFACTURER);
        OTLogger.a("SDK", Build.VERSION.SDK);
        OTLogger.a("BRAND", Build.BRAND);
        OTLogger.a("Version Code", Build.VERSION.RELEASE);
        OTLogger.a("***********************************", "SDK LOGS -***********************************");
    }
}
