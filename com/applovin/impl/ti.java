package com.applovin.impl;

/* loaded from: ti.class */
public final class ti {
    public static final ti b = new ti(false);
    public final boolean a;

    public ti(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ti.class != obj.getClass()) {
            return false;
        }
        if (this.a != ((ti) obj).a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return !this.a ? 1 : 0;
    }
}
