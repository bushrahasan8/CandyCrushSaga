package com.onetrust.otpublishers.headless.UI.UIProperty;

/* loaded from: k.class */
public final class k {
    public b0 a = new b0();
    public String b;
    public String c;
    public String d;

    public final String a() {
        String str = this.d;
        if (str == null) {
            str = "activate";
        }
        return str;
    }

    public final String toString() {
        StringBuilder a = j.a(this.a, new StringBuilder("LinkProperty{linkTextProperty="), "url=");
        a.append(this.b);
        a.append("actionDescription=");
        a.append(this.d);
        a.append('}');
        return a.toString();
    }
}
