package com.onetrust.otpublishers.headless.UI.UIProperty;

/* loaded from: z.class */
public final class z {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String q;
    public b0 j = new b0();
    public b0 k = new b0();
    public b0 l = new b0();
    public b0 m = new b0();
    public a0 n = new a0();
    public c o = new c();
    public c p = new c();
    public u r = new u();
    public final i s = new i();
    public final g t = new g();

    public final String toString() {
        StringBuilder sb = new StringBuilder("OTVendorListUIProperty{backgroundColor='");
        sb.append(this.a);
        sb.append("', lineBreakColor='");
        sb.append(this.b);
        sb.append("', toggleThumbColorOn='");
        sb.append(this.c);
        sb.append("', toggleThumbColorOff='");
        sb.append(this.d);
        sb.append("', toggleTrackColor='");
        sb.append(this.e);
        sb.append("', filterOnColor='");
        sb.append(this.f);
        sb.append("', filterOffColor='");
        sb.append(this.g);
        sb.append("', rightChevronColor='");
        sb.append(this.i);
        sb.append("', filterSelectionColor='");
        sb.append(this.h);
        sb.append("', filterNavTextProperty=");
        StringBuilder a = j.a(this.m, j.a(this.l, j.a(this.k, j.a(this.j, sb, ", titleTextProperty="), ", allowAllToggleTextProperty="), ", filterItemTitleTextProperty="), ", searchBarProperty=");
        a.append(this.n.toString());
        a.append(", confirmMyChoiceProperty=");
        a.append(this.o.toString());
        a.append(", applyFilterButtonProperty=");
        a.append(this.p.toString());
        a.append(", backButtonColor='");
        a.append(this.q);
        a.append("', pageHeaderProperty=");
        a.append(this.r.toString());
        a.append(", backIconProperty=");
        a.append(this.s.toString());
        a.append(", filterIconProperty=");
        a.append(this.t.toString());
        a.append('}');
        return a.toString();
    }
}
