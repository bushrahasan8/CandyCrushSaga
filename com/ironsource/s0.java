package com.ironsource;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: s0.class */
public final class s0 {
    private final Map a;

    public s0() {
        this(null, 1, null);
    }

    public s0(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.a = mediationTypes;
    }

    public /* synthetic */ s0(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    public static /* synthetic */ s0 a(s0 s0Var, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = s0Var.a;
        }
        return s0Var.a(map);
    }

    public final s0 a(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new s0(mediationTypes);
    }

    public final Map<String, String> a() {
        return this.a;
    }

    public final Map<String, String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.areEqual(this.a, ((s0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.a + ')';
    }
}
