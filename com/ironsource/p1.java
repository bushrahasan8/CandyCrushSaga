package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: p1.class */
public class p1 {
    private r0 a;
    private int b;
    private long c;
    private boolean d;
    private ArrayList e;
    private r1 f;
    private int g;
    private int h;
    private com.ironsource.mediationsdk.utils.a i;
    private boolean j;
    private boolean k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public p1() {
        this.a = new r0();
        this.e = new ArrayList();
    }

    public p1(int i, long j, boolean z, r0 r0Var, int i2, com.ironsource.mediationsdk.utils.a aVar, int i3, boolean z2, boolean z3, long j2, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.e = new ArrayList();
        this.b = i;
        this.c = j;
        this.d = z;
        this.a = r0Var;
        this.g = i2;
        this.h = i3;
        this.i = aVar;
        this.j = z2;
        this.k = z3;
        this.l = j2;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
    }

    public int a() {
        return this.b;
    }

    public r1 a(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            if (r1Var.getPlacementName().equals(str)) {
                return r1Var;
            }
        }
        return null;
    }

    public void a(r1 r1Var) {
        if (r1Var != null) {
            this.e.add(r1Var);
            if (this.f == null || r1Var.isPlacementId(0)) {
                this.f = r1Var;
            }
        }
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public com.ironsource.mediationsdk.utils.a d() {
        return this.i;
    }

    public boolean e() {
        return this.k;
    }

    public long f() {
        return this.l;
    }

    public int g() {
        return this.h;
    }

    public r0 h() {
        return this.a;
    }

    public int i() {
        return this.g;
    }

    public r1 j() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            if (r1Var.isDefault()) {
                return r1Var;
            }
        }
        return this.f;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.m;
    }

    public boolean m() {
        return this.p;
    }

    public boolean n() {
        return this.o;
    }

    public boolean o() {
        return this.n;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.b + ", bidderExclusive=" + this.d + '}';
    }
}
