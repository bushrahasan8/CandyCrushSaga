package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdData.class */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m6376boximpl(String str) {
        return new AdData(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m6377constructorimpl(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6378equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && Intrinsics.areEqual(str, ((AdData) obj).m6382unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6379equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6380hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6381toStringimpl(String str) {
        return "AdData(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m6378equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m6380hashCodeimpl(this.data);
    }

    public String toString() {
        return m6381toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m6382unboximpl() {
        return this.data;
    }
}
