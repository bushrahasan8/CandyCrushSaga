package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.AdSDKNotificationListener;
import com.ironsource.b6;
import com.ironsource.ca;
import com.ironsource.f8;
import com.ironsource.h4;
import com.ironsource.i5;
import com.ironsource.m9;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p0;
import com.ironsource.p2;
import com.ironsource.t;
import com.ironsource.t2;
import com.ironsource.td;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: ServerURL.class */
public class ServerURL {
    private static String BASE_URL_PREFIX = "https://i-sdk.mediation.unity3d.com/sdk/v";

    private static String createURLParams(List list) {
        Iterator it = list.iterator();
        String str = "";
        while (true) {
            String str2 = str;
            if (!it.hasNext()) {
                return str2;
            }
            Pair pair = (Pair) it.next();
            String str3 = str2;
            if (str2.length() > 0) {
                str3 = str2 + t2.i.c;
            }
            str = str3 + ((String) pair.first) + t2.i.b + URLEncoder.encode((String) pair.second, "UTF-8");
        }
    }

    private static String getBaseUrl(String str) {
        return BASE_URL_PREFIX + str + "?request=";
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z, List<Pair<String, String>> list, boolean z2) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        b6 c = ca.h().c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", IronSourceUtils.getSDKVersion()));
        if (z) {
            arrayList.add(new Pair("rvManual", "1"));
        }
        if (!IronSourceUtils.isEncryptedResponse()) {
            arrayList.add(new Pair("serr", t2.h));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair("pluginType", ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair("pluginVersion", ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair("plugin_fw_v", ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(td.b, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String b = p0.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(b)) {
            arrayList.add(new Pair("appVer", b));
        }
        arrayList.add(new Pair("osVer", Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair("devMake", Build.MANUFACTURER));
        arrayList.add(new Pair("devModel", Build.MODEL));
        arrayList.add(new Pair(i5.v0, (IronSourceUtils.getFirstSession(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> c2 = m9.b().c();
        if (c2.containsKey(a.b)) {
            arrayList.add(new Pair("coppa", c2.get(a.b).get(0)));
        }
        if (c2.containsKey(a.f)) {
            String str6 = c2.get(a.f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(a.i)) {
                arrayList.add(new Pair(i5.T0, "1"));
            }
        }
        if (c2.containsKey(a.d)) {
            String str7 = c2.get(a.d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase(a.g)) {
                arrayList.add(new Pair("dff", "1"));
            }
        }
        if (c2.containsKey(a.e) && (list2 = c2.get(a.e)) != null) {
            arrayList.add(new Pair(a.e, list2.get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            arrayList.add(new Pair("connType", connectionType));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String s = c.s();
        if (s.length() != 0) {
            arrayList.add(new Pair("browserUserAgent", s));
        }
        try {
            str5 = c.b(context) + "-" + c.F(context);
        } catch (Exception e) {
            e.printStackTrace();
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            arrayList.add(new Pair("deviceLang", str5));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + p2.b(context)));
        arrayList.add(new Pair("mnc", "" + p2.c(context)));
        String n = c.n(context);
        if (!TextUtils.isEmpty(n)) {
            arrayList.add(new Pair("icc", n));
        }
        String j = c.j(context);
        if (!TextUtils.isEmpty(j)) {
            arrayList.add(new Pair(td.d, j));
        }
        String b2 = c.b();
        if (!TextUtils.isEmpty(b2)) {
            arrayList.add(new Pair("tz", b2));
        }
        arrayList.add(new Pair(td.d0, "" + c.p()));
        String s2 = c.s(context);
        if (!TextUtils.isEmpty(s2)) {
            arrayList.add(new Pair("auid", s2));
        }
        if (z2) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(i5.V, String.valueOf(t.a())));
        arrayList.addAll(IronSourceUtils.parseJsonToPairList(new f8().a()));
        return getBaseUrl(IronSourceUtils.getSDKVersion()) + URLEncoder.encode(IronSourceAES.encode(h4.b().c(), createURLParams(arrayList)), "UTF-8");
    }

    public static String getRequestURL(String str, boolean z, int i) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(AdSDKNotificationListener.IMPRESSION_EVENT, Boolean.toString(z)));
        arrayList.add(new Pair(t2.k, Integer.toString(i)));
        return str + t2.i.c + createURLParams(arrayList);
    }
}
