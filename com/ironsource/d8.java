package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: d8.class */
public final class d8 {
    private final String a;
    private final String b;
    private q c;
    private boolean d;
    private String e;
    private String f;

    public d8(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.a = appKey;
        this.b = userId;
    }

    public static /* synthetic */ d8 a(d8 d8Var, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = d8Var.a;
        }
        if ((i & 2) != 0) {
            str2 = d8Var.b;
        }
        return d8Var.a(str, str2);
    }

    public final d8 a(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new d8(appKey, userId);
    }

    public final <T> T a(ba<d8, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    public final String a() {
        return this.a;
    }

    public final void a(q qVar) {
        this.c = qVar;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final String b() {
        return this.b;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final q e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return Intrinsics.areEqual(this.a, d8Var.a) && Intrinsics.areEqual(this.b, d8Var.b);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "InitConfig(appKey=" + this.a + ", userId=" + this.b + ')';
    }
}
