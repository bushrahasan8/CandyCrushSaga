package com.applovin.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: ae.class */
public class ae {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public ae(ae aeVar) {
        this.a = aeVar.a;
        this.b = aeVar.b;
        this.c = aeVar.c;
        this.d = aeVar.d;
        this.e = aeVar.e;
    }

    public ae(Object obj) {
        this(obj, -1L);
    }

    public ae(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private ae(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public ae(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public ae(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public ae a(Object obj) {
        return this.a.equals(obj) ? this : new ae(obj, this.b, this.c, this.d, this.e);
    }

    public boolean a() {
        return this.b != -1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        if (!this.a.equals(aeVar.a) || this.b != aeVar.b || this.c != aeVar.c || this.d != aeVar.d || this.e != aeVar.e) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}
