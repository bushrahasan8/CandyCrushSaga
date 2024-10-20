package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: f3.class */
public final class f3 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public f3() {
        this(null, null, null, null, 15, null);
    }

    public f3(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.a = customNetworkAdapterName;
        this.b = customRewardedVideoAdapterName;
        this.c = customInterstitialAdapterName;
        this.d = customBannerAdapterName;
    }

    public /* synthetic */ f3(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ f3 a(f3 f3Var, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = f3Var.a;
        }
        if ((i & 2) != 0) {
            str2 = f3Var.b;
        }
        if ((i & 4) != 0) {
            str3 = f3Var.c;
        }
        if ((i & 8) != 0) {
            str4 = f3Var.d;
        }
        return f3Var.a(str, str2, str3, str4);
    }

    public final f3 a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new f3(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return Intrinsics.areEqual(this.a, f3Var.a) && Intrinsics.areEqual(this.b, f3Var.b) && Intrinsics.areEqual(this.c, f3Var.c) && Intrinsics.areEqual(this.d, f3Var.d);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.a + ", customRewardedVideoAdapterName=" + this.b + ", customInterstitialAdapterName=" + this.c + ", customBannerAdapterName=" + this.d + ')';
    }
}
