package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: zd.class */
public final class zd {
    private final od a;

    public zd(od time) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.a = time;
    }

    public final boolean a(long j, long j2) {
        long a = this.a.a();
        return j2 <= 0 || j <= 0 || a < j || a - j > j2;
    }
}
