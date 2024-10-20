package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: b1.class */
public final class b1 {
    private final String a;
    private final boolean b;
    private boolean c;
    private String d;
    private Map e;
    private com.ironsource.mediationsdk.h f;
    private Map g;

    public b1(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = z;
        this.d = "";
        this.e = MapsKt.emptyMap();
        this.g = new HashMap();
    }

    public static /* synthetic */ b1 a(b1 b1Var, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b1Var.a;
        }
        if ((i & 2) != 0) {
            z = b1Var.b;
        }
        return b1Var.a(str, z);
    }

    public final b1 a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b1(name, z);
    }

    public final String a() {
        return this.a;
    }

    public final void a(com.ironsource.mediationsdk.h hVar) {
        this.f = hVar;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.g = map;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void b(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    public final boolean b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.h d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.areEqual(this.a, b1Var.a) && this.b == b1Var.b;
    }

    public final Map<String, Object> f() {
        return this.e;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        boolean z = this.b;
        int i = z ? 1 : 0;
        if (z) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public final boolean i() {
        return this.c;
    }

    public String toString() {
        return "AuctionInstanceInfo(name=" + this.a + ", bidder=" + this.b + ')';
    }
}
