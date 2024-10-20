package com.onetrust.otpublishers.headless.UI.UIProperty;

/* loaded from: l.class */
public final class l {
    public String a;
    public String b;
    public String c;

    public final String a() {
        String str = this.b;
        if (str == null) {
            return str;
        }
        if ("".equalsIgnoreCase(str.trim())) {
            return null;
        }
        return this.b;
    }

    public final boolean b() {
        return !String.valueOf(false).equalsIgnoreCase(this.a);
    }

    public final String toString() {
        return "LogoProperty{show='" + this.a + "', url='" + this.b + "', height='null', width='null', contentDescription='" + this.c + "'}";
    }
}
