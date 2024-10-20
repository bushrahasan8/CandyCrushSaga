package com.onetrust.otpublishers.headless.UI.DataModels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: i.class */
public final class i {
    public final String a;
    public final String b;
    public k c;

    public i(String id, String name, k consentState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        this.a = id;
        this.b = name;
        this.c = consentState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.a, iVar.a) && Intrinsics.areEqual(this.b, iVar.b) && this.c == iVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "VendorItem(id=" + this.a + ", name=" + this.b + ", consentState=" + this.c + ')';
    }
}
