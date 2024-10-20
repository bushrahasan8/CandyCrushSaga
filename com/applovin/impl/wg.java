package com.applovin.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: wg.class */
public class wg {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final String h;
    private final JSONArray i;
    private final List j;
    private final List k;

    /* loaded from: wg$a.class */
    public static class a {
        private boolean a;
        private String b;
        private boolean c;
        private String d;
        private boolean e;
        private String f;
        private boolean g;
        private String h;
        private String i;
        private int j;
        private int k;
        private String l;
        private boolean m;
        private JSONArray n;
        private boolean o;
        private List p;
        private boolean q;
        private List r;

        a() {
        }

        public a a(int i) {
            this.k = i;
            return this;
        }

        public a a(String str) {
            this.f = str;
            this.e = true;
            return this;
        }

        public a a(List list) {
            this.r = list;
            this.q = true;
            return this;
        }

        public a a(JSONArray jSONArray) {
            this.n = jSONArray;
            this.m = true;
            return this;
        }

        public wg a() {
            String str = this.b;
            if (!this.a) {
                str = wg.h();
            }
            String str2 = this.d;
            if (!this.c) {
                str2 = wg.i();
            }
            String str3 = this.f;
            if (!this.e) {
                str3 = wg.j();
            }
            String str4 = this.h;
            if (!this.g) {
                str4 = wg.k();
            }
            JSONArray jSONArray = this.n;
            if (!this.m) {
                jSONArray = wg.l();
            }
            List list = this.p;
            if (!this.o) {
                list = wg.m();
            }
            List list2 = this.r;
            if (!this.q) {
                list2 = wg.n();
            }
            return new wg(str, str2, str3, str4, this.i, this.j, this.k, this.l, jSONArray, list, list2);
        }

        public a b(int i) {
            this.j = i;
            return this;
        }

        public a b(String str) {
            this.h = str;
            this.g = true;
            return this;
        }

        public a b(List list) {
            this.p = list;
            this.o = true;
            return this;
        }

        public a c(String str) {
            this.l = str;
            return this;
        }

        public a d(String str) {
            this.i = str;
            return this;
        }

        public a e(String str) {
            this.d = str;
            this.c = true;
            return this;
        }

        public a f(String str) {
            this.b = str;
            this.a = true;
            return this;
        }

        public String toString() {
            return "OpenRtbAdConfiguration.Builder(version$value=" + this.b + ", title$value=" + this.d + ", advertiser$value=" + this.f + ", body$value=" + this.h + ", mainImageUrl=" + this.i + ", mainImageWidth=" + this.j + ", mainImageHeight=" + this.k + ", clickDestinationUrl=" + this.l + ", clickTrackingUrls$value=" + this.n + ", jsTrackers$value=" + this.p + ", impressionUrls$value=" + this.r + ")";
        }
    }

    wg(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, JSONArray jSONArray, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = str6;
        this.i = jSONArray;
        this.j = list;
        this.k = list2;
    }

    private static String a() {
        return "";
    }

    private static String b() {
        return "";
    }

    private static JSONArray c() {
        return new JSONArray();
    }

    private static List d() {
        return new ArrayList();
    }

    private static List e() {
        return new ArrayList();
    }

    private static String f() {
        return "";
    }

    private static String g() {
        return "";
    }

    static /* synthetic */ String h() {
        return g();
    }

    static /* synthetic */ String i() {
        return f();
    }

    static /* synthetic */ String j() {
        return a();
    }

    static /* synthetic */ String k() {
        return b();
    }

    static /* synthetic */ JSONArray l() {
        return c();
    }

    static /* synthetic */ List m() {
        return e();
    }

    static /* synthetic */ List n() {
        return d();
    }

    public static a o() {
        return new a();
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.d;
    }

    public String r() {
        return this.h;
    }

    public JSONArray s() {
        return this.i;
    }

    public List t() {
        return this.k;
    }

    public List u() {
        return this.j;
    }

    public int v() {
        return this.g;
    }

    public String w() {
        return this.e;
    }

    public int x() {
        return this.f;
    }

    public String y() {
        return this.b;
    }

    public String z() {
        return this.a;
    }
}
