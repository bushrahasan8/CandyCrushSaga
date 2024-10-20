package com.ironsource;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: cc.class */
public class cc {
    private ArrayList a;
    private r0 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private Placement n;
    private com.ironsource.mediationsdk.utils.a o;
    private boolean p;

    public cc() {
        this.a = new ArrayList();
        this.b = new r0();
    }

    public cc(int i, boolean z, int i2, int i3, r0 r0Var, com.ironsource.mediationsdk.utils.a aVar, int i4, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = new ArrayList();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = r0Var;
        this.f = i3;
        this.o = aVar;
        this.g = i4;
        this.p = z2;
        this.h = z3;
        this.i = j;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
    }

    public Placement a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Placement placement = (Placement) it.next();
            if (placement.isDefault()) {
                return placement;
            }
        }
        return this.n;
    }

    public Placement a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Placement placement = (Placement) it.next();
            if (placement.getPlacementName().equals(str)) {
                return placement;
            }
        }
        return null;
    }

    public void a(Placement placement) {
        if (placement != null) {
            this.a.add(placement);
            if (this.n == null || placement.isPlacementId(0)) {
                this.n = placement;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.p;
    }

    public ArrayList<Placement> e() {
        return this.a;
    }

    public boolean f() {
        return this.j;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public com.ironsource.mediationsdk.utils.a k() {
        return this.o;
    }

    public boolean l() {
        return this.h;
    }

    public long m() {
        return this.i;
    }

    public r0 n() {
        return this.b;
    }

    public boolean o() {
        return this.m;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.k;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }
}
