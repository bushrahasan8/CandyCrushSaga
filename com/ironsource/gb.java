package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: gb.class */
public final class gb {
    private final String a;
    private final String b;

    public gb(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = str;
    }

    public /* synthetic */ gb(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ gb a(gb gbVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gbVar.a;
        }
        if ((i & 2) != 0) {
            str2 = gbVar.b;
        }
        return gbVar.a(str, str2);
    }

    public final gb a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new gb(url, str);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return Intrinsics.areEqual(this.a, gbVar.a) && Intrinsics.areEqual(this.b, gbVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.b;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OpenUrl(url=" + this.a + ", packageName=" + this.b + ')';
    }
}
