package com.applovin.impl;

import java.util.Arrays;

/* loaded from: w8.class */
final class w8 {
    private boolean c;
    private boolean d;
    private int f;
    private a a = new a();
    private a b = new a();
    private long e = -9223372036854775807L;

    /* loaded from: w8$a.class */
    public static final class a {
        private long a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g = new boolean[15];
        private int h;

        private static int a(long j) {
            return (int) (j % 15);
        }

        public long a() {
            long j = this.e;
            long j2 = 0;
            if (j != 0) {
                j2 = this.f / j;
            }
            return j2;
        }

        public long b() {
            return this.f;
        }

        public void b(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.a = j;
            } else if (j2 == 1) {
                long j3 = j - this.a;
                this.b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int a = a(j2);
                if (Math.abs(j4 - this.b) <= 1000000) {
                    this.e++;
                    this.f += j4;
                    boolean[] zArr = this.g;
                    if (zArr[a]) {
                        zArr[a] = false;
                        this.h--;
                    }
                } else {
                    boolean[] zArr2 = this.g;
                    if (!zArr2[a]) {
                        zArr2[a] = true;
                        this.h++;
                    }
                }
            }
            this.d++;
            this.c = j;
        }

        public boolean c() {
            long j = this.d;
            if (j == 0) {
                return false;
            }
            return this.g[a(j - 1)];
        }

        public boolean d() {
            return this.d > 15 && this.h == 0;
        }

        public void e() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }

    public long a() {
        return e() ? this.a.a() : -9223372036854775807L;
    }

    public void a(long j) {
        this.a.b(j);
        int i = 0;
        if (this.a.d() && !this.d) {
            this.c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.c || this.b.c()) {
                this.b.e();
                this.b.b(this.e);
            }
            this.c = true;
            this.b.b(j);
        }
        if (this.c && this.b.d()) {
            a aVar = this.a;
            this.a = this.b;
            this.b = aVar;
            this.c = false;
            this.d = false;
        }
        this.e = j;
        if (!this.a.d()) {
            i = this.f + 1;
        }
        this.f = i;
    }

    public float b() {
        return e() ? (float) (1.0E9d / this.a.a()) : -1.0f;
    }

    public int c() {
        return this.f;
    }

    public long d() {
        return e() ? this.a.b() : -9223372036854775807L;
    }

    public boolean e() {
        return this.a.d();
    }

    public void f() {
        this.a.e();
        this.b.e();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }
}
