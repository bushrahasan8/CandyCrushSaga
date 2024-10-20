package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: ImpressionConfig.class */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m6393boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m6394constructorimpl(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6395equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && Intrinsics.areEqual(str, ((ImpressionConfig) obj).m6399unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6396equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6397hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6398toStringimpl(String str) {
        return "ImpressionConfig(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m6395equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m6397hashCodeimpl(this.data);
    }

    public String toString() {
        return m6398toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m6399unboximpl() {
        return this.data;
    }
}
