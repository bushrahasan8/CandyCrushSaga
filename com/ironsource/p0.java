package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: p0.class */
public class p0 {
    public static int a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    static PackageInfo a(Context context) {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static String a(Context context, String str) {
        String str2;
        PackageManager packageManager;
        try {
            packageManager = context.getPackageManager();
        } catch (Exception e) {
        }
        if (packageManager != null && !TextUtils.isEmpty(str)) {
            str2 = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            return str2;
        }
        str2 = null;
        return str2;
    }

    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                    i++;
                }
            } else {
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getString(i2);
                    int indexOf = asList.indexOf(string);
                    if (indexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean a() {
        return true;
    }

    public static String b(Context context) {
        try {
            return a(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e) {
            str2 = "";
        }
        return str2;
    }

    public static String c(Context context) {
        File cacheDir = context.getCacheDir();
        return cacheDir != null ? cacheDir.getPath() : null;
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static long d(Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static boolean d(Context context, String str) {
        int i = 0;
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                z = false;
                if (packageInfo.requestedPermissions != null) {
                    boolean z2 = false;
                    while (true) {
                        try {
                            z = z2;
                            String[] strArr = packageInfo.requestedPermissions;
                            if (i >= strArr.length || z) {
                                break;
                            }
                            boolean equals = str.equals(strArr[i]);
                            i++;
                            z2 = equals;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            return z;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
        }
        return z;
    }

    public static String e(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            str = null;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        }
        return str2;
    }

    public static long f(Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static String g(Context context) {
        return context.getPackageName();
    }
}
