package com.onetrust.otpublishers.headless.UI.UIProperty;

import java.util.ArrayList;

/* loaded from: w.class */
public final class w {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public b0 e = new b0();
    public b0 f = new b0();
    public c g = new c();
    public ArrayList h = new ArrayList();

    public final ArrayList a() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OTConsentPreferencesUIProperty{show='");
        sb.append(this.a);
        sb.append("', backgroundColor='null', titleTextProperty=");
        StringBuilder a = j.a(this.f, j.a(this.e, sb, ", descriptionTextProperty="), ", showOTLogo=");
        a.append(this.d);
        a.append(", saveChoicesButtonProperty=");
        a.append(this.g.toString());
        a.append(", otConsentPreferencesPurposeModelHashSet=");
        a.append(this.h);
        a.append('}');
        return a.toString();
    }
}
