package com.applovin.impl;

import java.io.IOException;

/* loaded from: hh.class */
public class hh extends IOException {
    public final boolean a;
    public final int b;

    public hh(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static hh a(String str) {
        return new hh(str, null, false, 1);
    }

    public static hh a(String str, Throwable th) {
        return new hh(str, th, true, 1);
    }

    public static hh b(String str, Throwable th) {
        return new hh(str, th, true, 0);
    }
}
