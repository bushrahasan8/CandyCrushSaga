package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* loaded from: t3.class */
public class t3 {
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;
    public static final int m = -1;
    private String a;
    private String b;
    private int c;
    private Map d;
    private int e;
    private boolean f;
    private wa g;
    private q8 h;

    public t3(q8 q8Var) {
        this(q8Var.d(), q8Var.e(), q8Var.a(), q8Var.b());
        this.h = q8Var;
    }

    public t3(String str, String str2, Map<String, String> map, wa waVar) {
        this.c = -1;
        this.b = str;
        this.a = str2;
        this.d = map;
        this.g = waVar;
        this.e = 0;
        this.f = false;
        this.h = null;
    }

    public void a() {
        this.g = null;
        Map map = this.d;
        if (map != null) {
            map.clear();
        }
        this.d = null;
    }

    public void a(wa waVar) {
        this.g = waVar;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean a(int i2) {
        return this.c == i2;
    }

    public Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.b);
        hashMap.put("demandSourceName", this.a);
        Map map = this.d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public void b(int i2) {
        synchronized (this) {
            this.e = i2;
        }
    }

    public q8 c() {
        return this.h;
    }

    public void c(int i2) {
        this.c = i2;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public Map<String, String> g() {
        return this.d;
    }

    public String h() {
        return this.b;
    }

    public wa i() {
        return this.g;
    }

    public int j() {
        return this.c;
    }

    public boolean k() {
        Map map = this.d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean((String) this.d.get("rewarded"));
    }
}
