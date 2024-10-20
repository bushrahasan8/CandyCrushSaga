package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.b6;
import com.ironsource.ca;
import com.ironsource.f7;
import com.ironsource.ic;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.t2;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: SDKUtils.class */
public class SDKUtils {
    private static final String a = "SDKUtils";
    private static String b;
    private static String c;
    private static String d;
    private static int e = 0;
    private static String f;
    private static Map g;
    private static String h = "";
    private static final AtomicInteger i = new AtomicInteger(1);

    /* loaded from: SDKUtils$a.class */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public static int convertDpToPx(int i2) {
        return (int) TypedValue.applyDimension(0, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i2) {
        return (int) TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        String str2;
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            Logger.d(a, "Failed decoding string " + e2.getMessage());
            str2 = "";
        }
        return str2;
    }

    public static int dpToPx(long j) {
        return (int) ((((float) j) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        String str2;
        try {
            str2 = URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e2) {
            str2 = "";
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encrypt(java.lang.String r4) {
        /*
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.io.UnsupportedEncodingException -> L29 java.security.NoSuchAlgorithmException -> L2f
            r5 = r0
            r0 = r5
            r0.reset()     // Catch: java.io.UnsupportedEncodingException -> L19 java.security.NoSuchAlgorithmException -> L21
            r0 = r5
            r1 = r4
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L19 java.security.NoSuchAlgorithmException -> L21
            r0.update(r1)     // Catch: java.io.UnsupportedEncodingException -> L19 java.security.NoSuchAlgorithmException -> L21
            r0 = r5
            r4 = r0
            goto L37
        L19:
            r6 = move-exception
            r0 = r5
            r4 = r0
            r0 = r6
            r5 = r0
            goto L33
        L21:
            r6 = move-exception
            r0 = r5
            r4 = r0
            r0 = r6
            r5 = r0
            goto L33
        L29:
            r5 = move-exception
        L2a:
            r0 = 0
            r4 = r0
            goto L33
        L2f:
            r5 = move-exception
            goto L2a
        L33:
            r0 = r5
            r0.printStackTrace()
        L37:
            r0 = r4
            if (r0 == 0) goto L40
            r0 = r4
            byte[] r0 = r0.digest()
            return r0
        L40:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(ic icVar) {
        return fetchDemandSourceId(icVar.a());
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e2) {
                    Logger.i(a, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        return z ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return b;
    }

    public static String getControllerConfig() {
        return f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(d) ? d : "";
    }

    public static int getDebugMode() {
        return e;
    }

    public static String getFileName(String str) {
        String str2;
        String[] split = str.split(File.separator);
        try {
            str2 = URLEncoder.encode(split[split.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            str2 = null;
        }
        return str2;
    }

    public static Map<String, String> getInitSDKParams() {
        return g;
    }

    public static String getLimitAdTracking() {
        return c;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = t2.h + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(t2.d.b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = getControllerConfigAsJSONObject().getJSONObject(t2.a.b);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getOrientation(Context context) {
        b6 c2 = ca.h().c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(c2.E(context)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static f7.e getProductType(String str) {
        f7.e eVar;
        f7.e eVar2 = f7.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            eVar = eVar2;
        } else {
            f7.e eVar3 = f7.e.Interstitial;
            if (str.equalsIgnoreCase(eVar3.toString())) {
                eVar = eVar3;
            } else {
                f7.e eVar4 = f7.e.OfferWall;
                eVar = str.equalsIgnoreCase(eVar4.toString()) ? eVar4 : null;
            }
        }
        return eVar;
    }

    public static String getSDKVersion() {
        return "7.9.0";
    }

    public static String getTesterParameters() {
        return h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        String str3;
        try {
            str3 = new JSONObject(str).getString(str2);
        } catch (Exception e2) {
            str3 = null;
        }
        return str3;
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ("mounted_ro".equals(r0) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isExternalStorageAvailable() {
        /*
            r0 = 0
            r3 = r0
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L20
            r5 = r0
            java.lang.String r0 = "mounted"
            r1 = r5
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L20
            if (r0 != 0) goto L1c
            java.lang.String r0 = "mounted_ro"
            r1 = r5
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L20
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r3 = r0
        L1e:
            r0 = r3
            return r0
        L20:
            r5 = move-exception
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.isExternalStorageAvailable():boolean");
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        b6 c2 = ca.h().c();
        String p = c2.p(context);
        String a2 = c2.a(context);
        if (!TextUtils.isEmpty(p)) {
            b = p;
        }
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        c = a2;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        JSONArray jSONArray2 = jSONArray;
        if (jSONObject2 != null) {
            jSONArray2 = jSONObject2.names();
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string = jSONArray2.getString(i2);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((((float) j) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f = str;
    }

    public static void setControllerUrl(String str) {
        d = str;
    }

    public static void setDebugMode(int i2) {
        e = i2;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        g = map;
    }

    public static void setTesterParameters(String str) {
        h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? "none" : t2.h.C : t2.h.D;
    }

    public static String translateOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? "none" : t2.h.C : t2.h.D;
    }

    public static String translateRequestedOrientation(int i2) {
        String str;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 11) {
                    if (i2 != 12) {
                        switch (i2) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                str = "none";
                                break;
                        }
                        return str;
                    }
                }
            }
            str = t2.h.D;
            return str;
        }
        str = t2.h.C;
        return str;
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f);
            jSONObject2.put(str, jSONObject);
            f = jSONObject2.toString();
        } catch (JSONException e2) {
            Logger.i(a, "Unable to update controllerConfigs: " + e2.toString());
        }
    }
}
