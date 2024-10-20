package com.ironsource;

import android.content.Context;

/* loaded from: x3.class */
public class x3 {
    private static x3 h;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private final b6 g;

    private x3(Context context) {
        b6 c = ca.h().c();
        this.g = c;
        this.a = c.g();
        this.b = c.e();
        this.c = c.l();
        this.d = c.o();
        this.e = c.k();
        this.f = c.j(context);
    }

    public static x3 b(Context context) {
        if (h == null) {
            h = new x3(context);
        }
        return h;
    }

    public static void g() {
        h = null;
    }

    public float a(Context context) {
        return this.g.m(context);
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }
}
