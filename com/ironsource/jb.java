package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: jb.class */
public class jb {
    public static final String a = "com.google.market";
    public static final String b = "com.android.vending";
    public static final String c = "isInstalled";
    private static final String d = "jb";
    private static final ArrayList e = new a();

    /* loaded from: jb$a.class */
    class a extends ArrayList {
        a() {
            add(jb.a);
            add("com.android.vending");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: jb$b.class */
    public class b extends JSONObject {
        final boolean a;

        b(boolean z) {
            this.a = z;
            put("isInstalled", z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: jb$c.class */
    public enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{jb.a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});

        private static final Map h = new HashMap();
        private final int a;
        private final String[] b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    h.put(str, cVar);
                }
            }
        }

        c(int i2, String[] strArr) {
            this.a = i2;
            this.b = strArr;
        }

        static /* synthetic */ ArrayList a() {
            return b();
        }

        private static ArrayList b() {
            return new ArrayList(h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.b;
        }
    }

    private static JSONObject a(Context context) {
        return a(context, e);
    }

    private static JSONObject a(Context context, ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList b2 = b(context);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                jSONObject.put(str, a(b2.contains(str.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e2) {
            Log.d(d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static JSONObject a(boolean z) {
        return new b(z);
    }

    private static ArrayList b(Context context) {
        List<ApplicationInfo> o = ca.h().c().o(context);
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : o) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer c(Context context) {
        int i;
        JSONObject a2 = a(context, c.a());
        c[] values = c.values();
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i2 >= length) {
                return Integer.valueOf(i4);
            }
            String[] d2 = values[i2].d();
            int length2 = d2.length;
            int i5 = 0;
            while (true) {
                i = i4;
                if (i5 < length2) {
                    JSONObject optJSONObject = a2.optJSONObject(d2[i5]);
                    if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                        i = (int) (i4 + Math.pow(2.0d, r0.c() - 1));
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            i2++;
            i3 = i;
        }
    }

    public static boolean d(Context context) {
        JSONObject a2 = a(context);
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a2.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }
}
