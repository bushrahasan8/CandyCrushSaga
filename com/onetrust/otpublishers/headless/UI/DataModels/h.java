package com.onetrust.otpublishers.headless.UI.DataModels;

import com.onetrust.otpublishers.headless.UI.UIProperty.a0;
import com.onetrust.otpublishers.headless.UI.UIProperty.b0;
import com.onetrust.otpublishers.headless.UI.UIProperty.t;
import com.onetrust.otpublishers.headless.UI.UIProperty.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: h.class */
public final class h {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final b0 k;
    public final b0 l;
    public final a0 m;
    public final b0 n;
    public final v o;
    public final t p;

    public h(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String consentLabel, b0 summaryTitle, b0 summaryDescription, a0 searchBarProperty, b0 allowAllToggleTextProperty, v otSdkListUIProperty, t tVar) {
        Intrinsics.checkNotNullParameter(consentLabel, "consentLabel");
        Intrinsics.checkNotNullParameter(summaryTitle, "summaryTitle");
        Intrinsics.checkNotNullParameter(summaryDescription, "summaryDescription");
        Intrinsics.checkNotNullParameter(searchBarProperty, "searchBarProperty");
        Intrinsics.checkNotNullParameter(allowAllToggleTextProperty, "allowAllToggleTextProperty");
        Intrinsics.checkNotNullParameter(otSdkListUIProperty, "otSdkListUIProperty");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = consentLabel;
        this.k = summaryTitle;
        this.l = summaryDescription;
        this.m = searchBarProperty;
        this.n = allowAllToggleTextProperty;
        this.o = otSdkListUIProperty;
        this.p = tVar;
    }

    public final String a() {
        return this.c;
    }

    public final a0 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && Intrinsics.areEqual(this.b, hVar.b) && Intrinsics.areEqual(this.c, hVar.c) && Intrinsics.areEqual(this.d, hVar.d) && Intrinsics.areEqual(this.e, hVar.e) && Intrinsics.areEqual(this.f, hVar.f) && Intrinsics.areEqual(this.g, hVar.g) && Intrinsics.areEqual(this.h, hVar.h) && Intrinsics.areEqual(this.i, hVar.i) && Intrinsics.areEqual(this.j, hVar.j) && Intrinsics.areEqual(this.k, hVar.k) && Intrinsics.areEqual(this.l, hVar.l) && Intrinsics.areEqual(this.m, hVar.m) && Intrinsics.areEqual(this.n, hVar.n) && Intrinsics.areEqual(this.o, hVar.o) && Intrinsics.areEqual(this.p, hVar.p);
    }

    public final int hashCode() {
        boolean z = this.a;
        boolean z2 = z;
        if (z) {
            z2 = true;
        }
        String str = this.b;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.e;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.g;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.h;
        int hashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.i;
        int hashCode8 = str8 == null ? 0 : str8.hashCode();
        int hashCode9 = this.j.hashCode();
        int hashCode10 = this.k.hashCode();
        int hashCode11 = this.l.hashCode();
        int hashCode12 = this.m.hashCode();
        int hashCode13 = this.n.hashCode();
        int hashCode14 = this.o.hashCode();
        t tVar = this.p;
        if (tVar != null) {
            i = tVar.hashCode();
        }
        return ((hashCode14 + ((hashCode13 + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((((((((((((((((((z2 ? 1 : 0) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + i;
    }

    public final String toString() {
        return "SDKListData(showSdkDescription=" + this.a + ", backButtonColor=" + this.b + ", backgroundColor=" + this.c + ", filterOnColor=" + this.d + ", filterOffColor=" + this.e + ", dividerColor=" + this.f + ", toggleThumbColorOn=" + this.g + ", toggleThumbColorOff=" + this.h + ", toggleTrackColor=" + this.i + ", consentLabel=" + this.j + ", summaryTitle=" + this.k + ", summaryDescription=" + this.l + ", searchBarProperty=" + this.m + ", allowAllToggleTextProperty=" + this.n + ", otSdkListUIProperty=" + this.o + ", otPCUIProperty=" + this.p + ')';
    }
}
