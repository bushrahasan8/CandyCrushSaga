package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: td.class */
public final class td extends IOException {
    public final p5 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public td(p5 p5Var, Uri uri, Map map, long j, Throwable th) {
        super(th);
        this.a = p5Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
