package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* loaded from: p2.class */
public class p2 {
    public static final String a = "3g";
    public static final String b = "wifi";
    public static final String c = "none";
    public static final String d = "bluetooth";
    public static final String e = "ethernet";
    public static final String f = "vpn";
    public static final String g = "cellular";
    public static final String h = "wifiAware";
    public static final String i = "lowpan";

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        String str;
        StringBuilder sb = new StringBuilder();
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    String typeName = activeNetworkInfo.getTypeName();
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        str = a;
                    } else if (type == 1) {
                        str = b;
                    } else {
                        sb.append(typeName);
                    }
                    sb.append(str);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static int b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mcc;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static int c(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mnc;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int e(Context context) {
        int phoneType;
        if (context != null) {
            try {
                phoneType = ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return phoneType;
        }
        phoneType = -1;
        return phoneType;
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getSimOperator() : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static boolean g(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z = false;
            if (activeNetworkInfo != null) {
                z = false;
                if (activeNetworkInfo.isConnected()) {
                    z = true;
                }
            }
            return z;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean h(Context context) {
        boolean z = false;
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            z = false;
            if (networkInfo != null) {
                z = false;
                if (networkInfo.isConnected()) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean i(Context context) {
        boolean z = false;
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            z = false;
            if (networkInfo != null) {
                z = false;
                if (networkInfo.isConnected()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
