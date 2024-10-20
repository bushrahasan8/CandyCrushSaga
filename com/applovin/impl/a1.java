package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* loaded from: a1.class */
public class a1 {
    private final Map a;
    private final List b;

    public a1(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    public Map a() {
        return this.a;
    }

    protected boolean a(Object obj) {
        return obj instanceof a1;
    }

    public List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (!a1Var.a(this)) {
            return false;
        }
        Map a = a();
        Map a2 = a1Var.a();
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        } else if (!a.equals(a2)) {
            return false;
        }
        List b = b();
        List b2 = a1Var.b();
        return b == null ? b2 == null : b.equals(b2);
    }

    public int hashCode() {
        Map a = a();
        int i = 43;
        int hashCode = a == null ? 43 : a.hashCode();
        List b = b();
        if (b != null) {
            i = b.hashCode();
        }
        return ((hashCode + 59) * 59) + i;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }
}
