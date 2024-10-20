package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: hb.class */
public final class hb {
    private final boolean a;
    private final int b;

    public hb() {
        this(false, 0, 3, null);
    }

    public hb(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public /* synthetic */ hb(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }

    public static /* synthetic */ hb a(hb hbVar, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = hbVar.a;
        }
        if ((i2 & 2) != 0) {
            i = hbVar.b;
        }
        return hbVar.a(z, i);
    }

    public final hb a(boolean z, int i) {
        return new hb(z, i);
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return this.a == hbVar.a && this.b == hbVar.b;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = z;
        if (z) {
            z2 = true;
        }
        return ((z2 ? 1 : 0) * 31) + this.b;
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.a + ", flags=" + this.b + ')';
    }
}
