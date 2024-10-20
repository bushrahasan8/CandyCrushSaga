package com.onetrust.otpublishers.headless.UI.DataModels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: f.class */
public final class f {
    public final String a;
    public final String b;
    public final String c;
    public final g d;

    public f(String id, String name, String str, g consentState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        this.a = id;
        this.b = name;
        this.c = str;
        this.d = consentState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        String str = this.c;
        return this.d.hashCode() + ((((hashCode2 + (hashCode * 31)) * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SDKItem(id=" + this.a + ", name=" + this.b + ", description=" + this.c + ", consentState=" + this.d + ')';
    }
}
