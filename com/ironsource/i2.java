package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: i2.class */
public final class i2 {
    private String a;
    private String b;
    private String c;

    public i2(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.a = cachedAppKey;
        this.b = cachedUserId;
        this.c = cachedSettings;
    }

    public static /* synthetic */ i2 a(i2 i2Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = i2Var.a;
        }
        if ((i & 2) != 0) {
            str2 = i2Var.b;
        }
        if ((i & 4) != 0) {
            str3 = i2Var.c;
        }
        return i2Var.a(str, str2, str3);
    }

    public final i2 a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new i2(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final String a() {
        return this.a;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }

    public final String b() {
        return this.b;
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final String c() {
        return this.c;
    }

    public final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.areEqual(this.a, i2Var.a) && Intrinsics.areEqual(this.b, i2Var.b) && Intrinsics.areEqual(this.c, i2Var.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.a + ", cachedUserId=" + this.b + ", cachedSettings=" + this.c + ')';
    }
}
