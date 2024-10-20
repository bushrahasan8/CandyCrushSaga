package com.onetrust.otpublishers.headless.UI.UIProperty;

/* loaded from: s.class */
public final class s {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public b0 g = new b0();
    public b0 h = new b0();
    public b0 i = new b0();
    public b0 j = new b0();
    public b0 k = new b0();
    public b0 l = new b0();
    public k m = new k();
    public k n = new k();
    public k o = new k();
    public final i p = new i();

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OTPCDetailsUIProperty{backgroundColor='");
        sb.append(this.a);
        sb.append("', lineBreakColor='");
        sb.append(this.b);
        sb.append("', toggleThumbColorOn='");
        sb.append(this.c);
        sb.append("', toggleThumbColorOff='");
        sb.append(this.d);
        sb.append("', toggleTrackColor='");
        sb.append(this.e);
        sb.append("', summaryTitleTextProperty=");
        StringBuilder a = j.a(this.l, j.a(this.k, j.a(this.j, j.a(this.i, j.a(this.g, sb, ", summaryTitleDescriptionTextProperty="), ", consentTitleTextProperty="), ", legitInterestTitleTextProperty="), ", alwaysActiveTextProperty="), ", sdkListLinkProperty=");
        a.append(this.m.toString());
        a.append(", vendorListLinkProperty=");
        a.append(this.n.toString());
        a.append(", fullLegalTextLinkProperty=");
        a.append(this.o.toString());
        a.append(", backIconProperty=");
        a.append(this.p.toString());
        a.append('}');
        return a.toString();
    }
}
