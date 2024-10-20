package com.applovin.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: rc.class */
public abstract class rc {
    private static int a = 0;
    private static boolean b = true;

    private static String a(String str, Throwable th) {
        String a2 = a(th);
        String str2 = str;
        if (!TextUtils.isEmpty(a2)) {
            str2 = str + "\n  " + a2.replace("\n", "\n  ") + '\n';
        }
        return str2;
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        return b(th) ? "UnknownHostException (no network)" : !b ? th.getMessage() : Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void a(String str, String str2) {
        if (a == 0) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void b(String str, String str2) {
        if (a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    private static boolean b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void c(String str, String str2) {
        if (a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void d(String str, String str2) {
        if (a <= 2) {
            Log.w(str, str2);
        }
    }
}
