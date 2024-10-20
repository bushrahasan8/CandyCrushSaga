package com.onetrust.otpublishers.headless.UI.DataModels;

import com.onetrust.otpublishers.headless.UI.UIProperty.q;
import com.onetrust.otpublishers.headless.UI.UIProperty.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: a.class */
public final class a {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final String q;
    public final String r;
    public final String s;
    public final q t;
    public final r u;

    public a(String alertMoreInfoText, String str, boolean z, String bannerRejectAllButtonText, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z3, boolean z4, String bannerAdditionalDescPlacement, boolean z5, String str9, String bannerDPDTitle, String bannerDPDDescription, q otBannerUIProperty, r rVar) {
        Intrinsics.checkNotNullParameter(alertMoreInfoText, "alertMoreInfoText");
        Intrinsics.checkNotNullParameter(bannerRejectAllButtonText, "bannerRejectAllButtonText");
        Intrinsics.checkNotNullParameter(bannerAdditionalDescPlacement, "bannerAdditionalDescPlacement");
        Intrinsics.checkNotNullParameter(bannerDPDTitle, "bannerDPDTitle");
        Intrinsics.checkNotNullParameter(bannerDPDDescription, "bannerDPDDescription");
        Intrinsics.checkNotNullParameter(otBannerUIProperty, "otBannerUIProperty");
        this.a = alertMoreInfoText;
        this.b = str;
        this.c = z;
        this.d = bannerRejectAllButtonText;
        this.e = z2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = z3;
        this.n = z4;
        this.o = bannerAdditionalDescPlacement;
        this.p = z5;
        this.q = str9;
        this.r = bannerDPDTitle;
        this.s = bannerDPDDescription;
        this.t = otBannerUIProperty;
        this.u = rVar;
    }

    public final boolean a(int i) {
        boolean z = true;
        if (i == 0 ? !this.n || !this.e : i != 1 || !this.n || this.e) {
            z = false;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && this.c == aVar.c && Intrinsics.areEqual(this.d, aVar.d) && this.e == aVar.e && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g) && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.i, aVar.i) && Intrinsics.areEqual(this.j, aVar.j) && Intrinsics.areEqual(this.k, aVar.k) && Intrinsics.areEqual(this.l, aVar.l) && this.m == aVar.m && this.n == aVar.n && Intrinsics.areEqual(this.o, aVar.o) && this.p == aVar.p && Intrinsics.areEqual(this.q, aVar.q) && Intrinsics.areEqual(this.r, aVar.r) && Intrinsics.areEqual(this.s, aVar.s) && Intrinsics.areEqual(this.t, aVar.t) && Intrinsics.areEqual(this.u, aVar.u);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.b;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        boolean z = this.c;
        int i2 = 1;
        int i3 = z ? 1 : 0;
        if (z) {
            i3 = 1;
        }
        int hashCode3 = this.d.hashCode();
        boolean z2 = this.e;
        int i4 = z2 ? 1 : 0;
        if (z2) {
            i4 = 1;
        }
        String str2 = this.f;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.g;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.h;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.i;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.j;
        int hashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.k;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.l;
        int hashCode10 = str8 == null ? 0 : str8.hashCode();
        boolean z3 = this.m;
        int i5 = z3 ? 1 : 0;
        if (z3) {
            i5 = 1;
        }
        boolean z4 = this.n;
        int i6 = z4 ? 1 : 0;
        if (z4) {
            i6 = 1;
        }
        int hashCode11 = this.o.hashCode();
        boolean z5 = this.p;
        if (!z5) {
            i2 = z5 ? 1 : 0;
        }
        String str9 = this.q;
        int hashCode12 = str9 == null ? 0 : str9.hashCode();
        int hashCode13 = this.r.hashCode();
        int hashCode14 = this.s.hashCode();
        int hashCode15 = this.t.hashCode();
        r rVar = this.u;
        if (rVar != null) {
            i = rVar.hashCode();
        }
        return ((hashCode15 + ((hashCode14 + ((hashCode13 + ((((((hashCode11 + ((((((((((((((((((((((hashCode3 + (((((hashCode * 31) + hashCode2) * 31) + i3) * 31)) * 31) + i4) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i5) * 31) + i6) * 31)) * 31) + i2) * 31) + hashCode12) * 31)) * 31)) * 31)) * 31) + i;
    }

    public final String toString() {
        return "BannerData(alertMoreInfoText=" + this.a + ", alertAllowCookiesText=" + this.b + ", bannerShowRejectAllButton=" + this.c + ", bannerRejectAllButtonText=" + this.d + ", bannerSettingButtonDisplayLink=" + this.e + ", bannerMPButtonColor=" + this.f + ", bannerMPButtonTextColor=" + this.g + ", textColor=" + this.h + ", buttonColor=" + this.i + ", buttonTextColor=" + this.j + ", backgroundColor=" + this.k + ", bannerLinksTextColor=" + this.l + ", showBannerAcceptButton=" + this.m + ", showBannerCookieSetting=" + this.n + ", bannerAdditionalDescPlacement=" + this.o + ", isIABEnabled=" + this.p + ", iABType=" + this.q + ", bannerDPDTitle=" + this.r + ", bannerDPDDescription=" + this.s + ", otBannerUIProperty=" + this.t + ", otGlobalUIProperty=" + this.u + ')';
    }
}
