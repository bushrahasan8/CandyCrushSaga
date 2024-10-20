package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdDataRefreshToken.class */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m6383boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m6384constructorimpl(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6385equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && Intrinsics.areEqual(str, ((AdDataRefreshToken) obj).m6389unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6386equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6387hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6388toStringimpl(String str) {
        return "AdDataRefreshToken(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m6385equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m6387hashCodeimpl(this.data);
    }

    public String toString() {
        return m6388toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m6389unboximpl() {
        return this.data;
    }
}
