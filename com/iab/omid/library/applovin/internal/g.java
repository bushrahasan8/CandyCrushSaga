package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: g.class */
public class g {

    @SuppressLint({"StaticFieldLeak"})
    private static g b = new g();
    private Context a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
