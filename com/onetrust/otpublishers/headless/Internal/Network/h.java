package com.onetrust.otpublishers.headless.Internal.Network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;

/* loaded from: h.class */
public abstract class h {
    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        OTLogger.a("NWUtils", 4, "isConnected = " + z);
        return z;
    }
}
