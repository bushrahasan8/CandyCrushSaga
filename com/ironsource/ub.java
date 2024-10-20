package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: ub.class */
public class ub {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();

    public ArrayList<String> a() {
        return this.c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(str);
    }

    public ArrayList<String> b() {
        return this.b;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public ArrayList<String> c() {
        return this.d;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.add(str);
    }

    public ArrayList<String> d() {
        return this.a;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }
}
