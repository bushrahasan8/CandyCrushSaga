package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;

/* loaded from: ye.class */
public class ye {
    private static final Set b = new HashSet();
    public static final ye c = a("ar");
    public static final ye d = a("ttdasi_ms");
    private String a;

    /* loaded from: ye$a.class */
    public interface a {
        Object a(Object obj);
    }

    private ye(String str) {
        this.a = str;
    }

    private static ye a(String str) {
        Set set = b;
        if (!set.contains(str)) {
            set.add(str);
            return new ye(str);
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public String a() {
        return this.a;
    }

    protected boolean a(Object obj) {
        return obj instanceof ye;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj;
        if (!yeVar.a(this)) {
            return false;
        }
        String a2 = a();
        String a3 = yeVar.a();
        return a2 == null ? a3 == null : a2.equals(a3);
    }

    public int hashCode() {
        String a2 = a();
        return (a2 == null ? 43 : a2.hashCode()) + 59;
    }

    public String toString() {
        return this.a;
    }
}
