package com.ironsource;

/* loaded from: ob.class */
public class ob {
    private boolean a;
    private boolean b;
    private boolean c;
    private pb d;
    private int e;
    private int f;

    /* loaded from: ob$b.class */
    public static class b {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private pb d = null;
        private int e = 0;
        private int f = 0;

        public b a(boolean z) {
            this.a = z;
            return this;
        }

        public b a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public b a(boolean z, pb pbVar, int i) {
            this.b = z;
            pb pbVar2 = pbVar;
            if (pbVar == null) {
                pbVar2 = pb.PER_DAY;
            }
            this.d = pbVar2;
            this.e = i;
            return this;
        }

        public ob a() {
            return new ob(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    private ob(boolean z, boolean z2, boolean z3, pb pbVar, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = pbVar;
        this.e = i;
        this.f = i2;
    }

    public pb a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.c;
    }
}
