package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* loaded from: q8.class */
public class q8 {
    private final boolean a;
    private String b;
    private String c;
    private boolean d;
    private w6 e;
    private Map f;
    private wa g;
    private boolean h;
    protected boolean i;
    protected boolean j = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q8(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Map map, wa waVar, w6 w6Var) {
        this.b = str;
        this.c = str2;
        this.a = z;
        this.d = z2;
        this.f = map;
        this.g = waVar;
        this.e = w6Var;
        this.h = z3;
        this.i = z4;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", this.b);
        hashMap.put("instanceName", this.c);
        hashMap.put("rewarded", Boolean.toString(this.a));
        hashMap.put("inAppBidding", Boolean.toString(this.d));
        hashMap.put("isOneFlow", Boolean.toString(this.h));
        hashMap.put(t2.s, String.valueOf(2));
        w6 w6Var = this.e;
        hashMap.put("width", w6Var != null ? Integer.toString(w6Var.c()) : t2.h);
        w6 w6Var2 = this.e;
        String str = t2.h;
        if (w6Var2 != null) {
            str = Integer.toString(w6Var2.a());
        }
        hashMap.put("height", str);
        w6 w6Var3 = this.e;
        hashMap.put("label", w6Var3 != null ? w6Var3.b() : "");
        hashMap.put(t2.w, Boolean.toString(g()));
        hashMap.put("isMultipleAdObjects", Boolean.toString(this.i));
        Map map = this.f;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public void a(wa waVar) {
        this.g = waVar;
        this.j = true;
    }

    public final wa b() {
        return this.g;
    }

    public Map<String, String> c() {
        return this.f;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public w6 f() {
        return this.e;
    }

    public boolean g() {
        return f() != null && f().d();
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return h() || k();
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.a;
    }

    public boolean m() {
        return this.j;
    }
}
