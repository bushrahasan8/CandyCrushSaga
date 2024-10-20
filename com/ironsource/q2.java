package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: q2.class */
public class q2 {
    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String str = "none";
        if (network != null) {
            str = "none";
            if (connectivityManager != null) {
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities == null) {
                        return c(context);
                    }
                    str = networkCapabilities.hasTransport(1) ? p2.b : networkCapabilities.hasTransport(0) ? p2.a : c(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    str = "none";
                }
            }
        }
        return str;
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", d(context));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network == null || context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) ? "" : networkCapabilities.hasTransport(1) ? p2.b : networkCapabilities.hasTransport(0) ? p2.g : networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(3) ? p2.e : networkCapabilities.hasTransport(5) ? p2.h : networkCapabilities.hasTransport(6) ? p2.i : networkCapabilities.hasTransport(2) ? p2.d : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String c(Context context) {
        String a = p2.a(context);
        String str = a;
        if (TextUtils.isEmpty(a)) {
            str = "none";
        }
        return str;
    }

    public static boolean d(Context context) {
        return b(context, a(context)).equals("vpn");
    }
}
