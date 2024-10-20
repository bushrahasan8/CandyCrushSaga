package com.onetrust.otpublishers.headless.UI.UIProperty;

/* loaded from: v.class */
public final class v {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String j;
    public b0 f = new b0();
    public b0 g = new b0();
    public b0 h = new b0();
    public a0 i = new a0();
    public b0 k = new b0();
    public b0 l = new b0();
    public c m = new c();
    public final i n = new i();
    public final g o = new g();

    public final String toString() {
        StringBuilder sb = new StringBuilder("OTSDKListUIProperty{backgroundColor='");
        sb.append(this.a);
        sb.append("', lineBreakColor='");
        sb.append(this.b);
        sb.append("', filterOnColor='");
        sb.append(this.c);
        sb.append("', filterOffColor='");
        sb.append(this.d);
        sb.append("', summaryTitle=");
        StringBuilder a = j.a(this.g, j.a(this.f, sb, ", summaryDescription="), ", searchBarProperty=");
        a.append(this.i.toString());
        a.append(", filterList_SelectionColor='");
        a.append(this.j);
        a.append("', filterList_NavItem=");
        StringBuilder a2 = j.a(this.l, j.a(this.k, a, ", filterList_SDKItem="), ", backIconProperty=");
        a2.append(this.n.toString());
        a2.append(", filterIconProperty=");
        a2.append(this.o.toString());
        a2.append('}');
        return a2.toString();
    }
}
