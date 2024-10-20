package com.applovin.impl;

import com.ironsource.t2;

/* loaded from: mj.class */
public final class mj {
    public static final mj c = new mj(0, 0);
    public final long a;
    public final long b;

    public mj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || mj.class != obj.getClass()) {
            return false;
        }
        mj mjVar = (mj) obj;
        if (this.a != mjVar.a || this.b != mjVar.b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + t2.i.e;
    }
}
