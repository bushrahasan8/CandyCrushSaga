package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: f.class */
public class f {

    @SuppressLint({"StaticFieldLeak"})
    private static f b = new f();
    private Context a;

    private f() {
    }

    public static f b() {
        return b;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
