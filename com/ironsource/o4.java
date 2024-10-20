package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: o4.class */
public final class o4 {
    private String a;
    private boolean b;
    private String c;
    private h6 d;
    private boolean e;
    private ArrayList f;

    /* loaded from: o4$a.class */
    public static class a {
        private String a;
        private h6 d;
        private boolean b = false;
        private String c = na.b;
        private boolean e = false;
        private ArrayList f = new ArrayList();

        public a(String str) {
            this.a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.a = str;
        }

        public a a(Pair<String, String> pair) {
            this.f.add(pair);
            return this;
        }

        public a a(h6 h6Var) {
            this.d = h6Var;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f.addAll(list);
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public o4 a() {
            return new o4(this);
        }

        public a b() {
            this.c = na.a;
            return this;
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a c() {
            this.c = na.b;
            return this;
        }
    }

    o4(a aVar) {
        this.e = false;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (aVar.f != null) {
            this.f = new ArrayList(aVar.f);
        }
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public h6 c() {
        return this.d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f);
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }
}
