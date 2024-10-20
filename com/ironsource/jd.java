package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: jd.class */
public final class jd {
    private String a;

    public jd() {
        this(null, 1, null);
    }

    public jd(String str) {
        this.a = str;
    }

    public /* synthetic */ jd(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ jd a(jd jdVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jdVar.a;
        }
        return jdVar.a(str);
    }

    public final jd a(String str) {
        return new jd(str);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public final void b(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd) && Intrinsics.areEqual(this.a, ((jd) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        return str == null ? 0 : str.hashCode();
    }

    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.a + ')';
    }
}
