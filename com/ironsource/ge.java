package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: ge.class */
public final class ge {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public ge(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static /* synthetic */ ge a(ge geVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = geVar.a;
        }
        if ((i & 2) != 0) {
            z2 = geVar.b;
        }
        if ((i & 4) != 0) {
            z3 = geVar.c;
        }
        return geVar.a(z, z2, z3);
    }

    public final ge a(boolean z, boolean z2, boolean z3) {
        return new ge(z, z2, z3);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return this.a == geVar.a && this.b == geVar.b && this.c == geVar.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final JSONObject g() {
        JSONObject put = new JSONObject().put(x6.k, this.a).put(x6.l, this.b).put(x6.m, this.c);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n\t\t\t.put(ISN…ts.IS_SHOWN_KEY, isShown)");
        return put;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        boolean z3 = z;
        if (z) {
            z3 = true;
        }
        boolean z4 = this.b;
        boolean z5 = z4;
        if (z4) {
            z5 = true;
        }
        boolean z6 = this.c;
        if (!z6) {
            z2 = z6;
        }
        return ((((z3 ? 1 : 0) * 31) + (z5 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.a + ", isWindowVisible=" + this.b + ", isShown=" + this.c + ')';
    }
}
