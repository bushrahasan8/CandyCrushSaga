package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: pc.class */
public final class pc {
    private static final AtomicLong h = new AtomicLong();
    public final long a;
    public final p5 b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public pc(long j, p5 p5Var, long j2) {
        this(j, p5Var, p5Var.a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public pc(long j, p5 p5Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = j;
        this.b = p5Var;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }

    public static long a() {
        return h.getAndIncrement();
    }
}
