package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: fa.class */
public final class fa {
    public static final a o = new a(null);
    private final boolean a;
    private final boolean b;
    private r0 c;
    private int d;
    private long e;
    private boolean f;
    private final ArrayList g;
    private la h;
    private int i;
    private com.ironsource.mediationsdk.utils.a j;
    private boolean k;
    private long l;
    private boolean m;
    private boolean n;

    /* loaded from: fa$a.class */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public fa(int i, long j, boolean z, r0 events, com.ironsource.mediationsdk.utils.a auctionSettings, int i2, boolean z2, long j2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.a = z5;
        this.b = z6;
        this.g = new ArrayList();
        this.d = i;
        this.e = j;
        this.f = z;
        this.c = events;
        this.i = i2;
        this.j = auctionSettings;
        this.k = z2;
        this.l = j2;
        this.m = z3;
        this.n = z4;
    }

    public final la a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            la laVar = (la) it.next();
            if (Intrinsics.areEqual(laVar.getPlacementName(), placementName)) {
                return laVar;
            }
        }
        return null;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(long j) {
        this.e = j;
    }

    public final void a(la laVar) {
        if (laVar != null) {
            this.g.add(laVar);
            if (this.h == null || laVar.getPlacementId() == 0) {
                this.h = laVar;
            }
        }
    }

    public final void a(com.ironsource.mediationsdk.utils.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.j = aVar;
    }

    public final void a(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<set-?>");
        this.c = r0Var;
    }

    public final void a(boolean z) {
        this.f = z;
    }

    public final boolean a() {
        return this.f;
    }

    public final int b() {
        return this.d;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void b(long j) {
        this.l = j;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final long c() {
        return this.e;
    }

    public final void c(boolean z) {
        this.m = z;
    }

    public final com.ironsource.mediationsdk.utils.a d() {
        return this.j;
    }

    public final void d(boolean z) {
        this.n = z;
    }

    public final la e() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            la laVar = (la) it.next();
            if (laVar.isDefault()) {
                return laVar;
            }
        }
        return this.h;
    }

    public final int f() {
        return this.i;
    }

    public final r0 g() {
        return this.c;
    }

    public final boolean h() {
        return this.k;
    }

    public final long i() {
        return this.l;
    }

    public final boolean j() {
        return this.m;
    }

    public final boolean k() {
        return this.b;
    }

    public final boolean l() {
        return this.a;
    }

    public final boolean m() {
        return this.n;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.d + ", bidderExclusive=" + this.f + '}';
    }
}
