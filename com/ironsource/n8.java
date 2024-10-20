package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: n8.class */
public class n8 {
    private ArrayList a;
    private r0 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private com.ironsource.mediationsdk.utils.a g;
    private boolean h;
    private boolean i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private InterstitialPlacement o;

    public n8() {
        this.a = new ArrayList();
        this.b = new r0();
    }

    public n8(int i, boolean z, int i2, r0 r0Var, com.ironsource.mediationsdk.utils.a aVar, int i3, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = new ArrayList();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = r0Var;
        this.g = aVar;
        this.k = z4;
        this.l = z5;
        this.f = i3;
        this.h = z2;
        this.i = z3;
        this.j = j;
        this.m = z6;
        this.n = z7;
    }

    public InterstitialPlacement a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement interstitialPlacement = (InterstitialPlacement) it.next();
            if (interstitialPlacement.isDefault()) {
                return interstitialPlacement;
            }
        }
        return this.o;
    }

    public InterstitialPlacement a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement interstitialPlacement = (InterstitialPlacement) it.next();
            if (interstitialPlacement.getPlacementName().equals(str)) {
                return interstitialPlacement;
            }
        }
        return null;
    }

    public void a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.a.add(interstitialPlacement);
            if (this.o == null || interstitialPlacement.isPlacementId(0)) {
                this.o = interstitialPlacement;
            }
        }
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public com.ironsource.mediationsdk.utils.a g() {
        return this.g;
    }

    public boolean h() {
        return this.i;
    }

    public long i() {
        return this.j;
    }

    public r0 j() {
        return this.b;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.k;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public boolean o() {
        return this.l;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }
}
