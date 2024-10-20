package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: t8.class */
public final class t8 {
    private final String a;
    private final String b;

    public t8(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.a = advId;
        this.b = advIdType;
    }

    public static /* synthetic */ t8 a(t8 t8Var, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = t8Var.a;
        }
        if ((i & 2) != 0) {
            str2 = t8Var.b;
        }
        return t8Var.a(str, str2);
    }

    public final t8 a(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new t8(advId, advIdType);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return Intrinsics.areEqual(this.a, t8Var.a) && Intrinsics.areEqual(this.b, t8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "IronSourceAdvId(advId=" + this.a + ", advIdType=" + this.b + ')';
    }
}
