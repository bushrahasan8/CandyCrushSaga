package com.applovin.impl;

/* loaded from: b1.class */
public class b1 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final boolean g;

    public b1(String str) {
        this(str, -1);
    }

    public b1(String str, int i) {
        this.e = str;
        this.f = i;
        String[] split = str.split(",");
        boolean z = split.length == 3 || split.length == 4;
        this.g = z;
        if (z) {
            this.a = a(split[0]);
            this.b = a(split[1]);
            this.c = a(split[2]);
            this.d = split.length == 4 ? a(split[3]) : "";
            return;
        }
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public String a() {
        return this.d;
    }

    protected boolean a(Object obj) {
        return obj instanceof b1;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (!b1Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = b1Var.b();
        if (b == null) {
            if (b2 != null) {
                return false;
            }
        } else if (!b.equals(b2)) {
            return false;
        }
        String c = c();
        String c2 = b1Var.c();
        if (c == null) {
            if (c2 != null) {
                return false;
            }
        } else if (!c.equals(c2)) {
            return false;
        }
        String e = e();
        String e2 = b1Var.e();
        if (e == null) {
            if (e2 != null) {
                return false;
            }
        } else if (!e.equals(e2)) {
            return false;
        }
        String a = a();
        String a2 = b1Var.a();
        return a == null ? a2 == null : a.equals(a2);
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.a.equals("applovin.com");
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        String b = b();
        int i = 43;
        int hashCode = b == null ? 43 : b.hashCode();
        String c = c();
        int hashCode2 = c == null ? 43 : c.hashCode();
        String e = e();
        int hashCode3 = e == null ? 43 : e.hashCode();
        String a = a();
        if (a != null) {
            i = a.hashCode();
        }
        return ((((((hashCode + 59) * 59) + hashCode2) * 59) + hashCode3) * 59) + i;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }
}
