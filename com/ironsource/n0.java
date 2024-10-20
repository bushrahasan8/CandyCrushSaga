package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: n0.class */
public final class n0 {
    private final String a;

    public n0() {
        this(null, 1, null);
    }

    public n0(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.a = auctionData;
    }

    public /* synthetic */ n0(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ n0 a(n0 n0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = n0Var.a;
        }
        return n0Var.a(str);
    }

    public final n0 a(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new n0(auctionData);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.areEqual(this.a, ((n0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.a + ')';
    }
}
