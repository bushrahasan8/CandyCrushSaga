package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: i1.class */
public class i1 {
    public static final String n = "adMarkup";
    public static final String o = "instance";
    public static final String p = "adData";
    public static final String q = "price";
    public static final String r = "serverData";
    public static final String s = "loadTimeout";
    public static final String t = "order";
    public static final String u = "show";
    public static final String v = "price";
    public static final String w = "notifications";
    public static final String x = "burl";
    public static final String y = "lurl";
    public static final String z = "nurl";
    private String a;
    private String b;
    private JSONObject c;
    private String d;
    private Integer e;
    private int f;
    private int g;
    private int h;
    private final List i;
    private final List j;
    private final List k;
    private ImpressionData l;
    private boolean m;

    public i1(String str) {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = null;
        this.m = true;
        this.a = str;
    }

    public i1(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0068, B:5:0x0071, B:6:0x0082, B:8:0x008b, B:10:0x00ab, B:12:0x00b1, B:14:0x00cf, B:16:0x00f6, B:18:0x0120, B:20:0x0129, B:22:0x013b, B:26:0x0096, B:28:0x009f), top: B:2:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0129 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0068, B:5:0x0071, B:6:0x0082, B:8:0x008b, B:10:0x00ab, B:12:0x00b1, B:14:0x00cf, B:16:0x00f6, B:18:0x0120, B:20:0x0129, B:22:0x013b, B:26:0x0096, B:28:0x009f), top: B:2:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i1(org.json.JSONObject r7, int r8, org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.i1.<init>(org.json.JSONObject, int, org.json.JSONObject):void");
    }

    private void a(JSONObject jSONObject, int i) {
        this.f = i;
        this.g = i;
        this.h = i;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(u, i);
            this.g = optInt;
            this.h = jSONObject.optInt("price", optInt);
        }
    }

    private void a(JSONObject jSONObject, String str, List list) {
        if (jSONObject.has(str)) {
            list.addAll(i9.b(jSONObject.getJSONArray(str)));
        }
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData;
        ImpressionData impressionData2 = this.l;
        if (impressionData2 != null) {
            ImpressionData impressionData3 = new ImpressionData(impressionData2);
            impressionData3.replaceMacroForPlacementWithValue(com.ironsource.mediationsdk.d.r, str);
            impressionData = impressionData3;
        } else {
            impressionData = null;
        }
        return impressionData;
    }

    public JSONObject a() {
        return this.c;
    }

    public List<String> b() {
        return this.i;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.f;
    }

    public Integer e() {
        return this.e;
    }

    public List<String> f() {
        return this.j;
    }

    public List<String> g() {
        return this.k;
    }

    public String h() {
        return this.d;
    }

    public int i() {
        return this.h;
    }

    public String j() {
        return this.b;
    }

    public int k() {
        return this.g;
    }

    public boolean l() {
        return this.m;
    }
}
