package com.king.libsocial;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.Keep;
import com.ironsource.p2;
import com.king.core.activityhelper.ActivityHelper;

@Keep
/* loaded from: SocialLib.class */
public class SocialLib {
    public static String getMobileCountryCode() {
        String networkOperator;
        return (ActivityHelper.getInstance().getActivity() == null || (networkOperator = ((TelephonyManager) ActivityHelper.getInstance().getActivity().getSystemService("phone")).getNetworkOperator()) == null || networkOperator.length() <= 3) ? "" : networkOperator.substring(0, 3);
    }

    public static String getMobileNetworkCode() {
        String networkOperator;
        return (ActivityHelper.getInstance().getActivity() == null || (networkOperator = ((TelephonyManager) ActivityHelper.getInstance().getActivity().getSystemService("phone")).getNetworkOperator()) == null || networkOperator.length() <= 3) ? "" : networkOperator.substring(3);
    }

    public static String getNetworkType() {
        NetworkInfo activeNetworkInfo;
        if (ActivityHelper.getInstance().getActivity() == null || (activeNetworkInfo = ((ConnectivityManager) ActivityHelper.getInstance().getActivity().getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        return type == 0 ? "wwan" : type == 1 ? p2.b : "";
    }

    public static boolean hasInternetConnection() {
        boolean z;
        boolean z2 = false;
        if (ActivityHelper.getInstance().getActivity() == null) {
            return false;
        }
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) ActivityHelper.getInstance().getActivity().getSystemService("connectivity")).getAllNetworkInfo();
        int length = allNetworkInfo.length;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            z = z4;
            if (i >= length) {
                break;
            }
            NetworkInfo networkInfo = allNetworkInfo[i];
            boolean z5 = z3;
            if (networkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                z5 = z3;
                if (networkInfo.isConnected()) {
                    z5 = true;
                }
            }
            boolean z6 = z;
            if (networkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                z6 = z;
                if (networkInfo.isConnected()) {
                    z6 = true;
                }
            }
            i++;
            z3 = z5;
            z4 = z6;
        }
        if (z3 || z) {
            z2 = true;
        }
        return z2;
    }

    public static boolean hasNetworkConnection() {
        return hasInternetConnection();
    }
}
