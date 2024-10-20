package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: fm.class */
public class fm<T> extends eb {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Object f2118;

    public fm(T t, dr drVar) {
        super(drVar);
        this.f2118 = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f2118;
        Object obj3 = ((fm) obj).f2118;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public int hashCode() {
        Object obj = this.f2118;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2118);
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eb
    /* renamed from: ｋ */
    public final dx mo4937(dy dyVar, co coVar) {
        return new dx(this.f2118);
    }
}
