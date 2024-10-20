package com.onetrust.otpublishers.headless.UI.UIProperty;

/* loaded from: q.class */
public final class q {
    public String a;
    public String b;
    public b0 c = new b0();
    public b0 d = new b0();
    public b0 e = new b0();
    public b0 f = new b0();
    public b0 g = new b0();
    public d h = new d();
    public c i = new c();
    public c j = new c();
    public c k = new c();
    public k l = new k();
    public k m = new k();
    public l n = new l();
    public boolean o = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder("OTBannerUIProperty{backgroundColor='");
        sb.append(this.a);
        sb.append("', layoutHeight='");
        sb.append(this.b);
        sb.append("', summaryTitleTextProperty=");
        StringBuilder a = j.a(this.g, j.a(this.f, j.a(this.e, j.a(this.d, j.a(this.c, sb, ", iabTitleTextProperty="), ", summaryTitleDescriptionTextProperty="), ", iabTitleDescriptionTextProperty="), ", summaryAdditionalDescriptionTextProperty="), ", acceptAllButtonProperty=");
        a.append(this.i.toString());
        a.append(", rejectAllButtonProperty=");
        a.append(this.j.toString());
        a.append(", closeButtonProperty=");
        a.append(this.h.toString());
        a.append(", showPreferencesButtonProperty=");
        a.append(this.k.toString());
        a.append(", policyLinkProperty=");
        a.append(this.l.toString());
        a.append(", vendorListLinkProperty=");
        a.append(this.m.toString());
        a.append(", logoProperty=");
        a.append(this.n.toString());
        a.append(", applyUIProperty=");
        a.append(this.o);
        a.append('}');
        return a.toString();
    }
}
