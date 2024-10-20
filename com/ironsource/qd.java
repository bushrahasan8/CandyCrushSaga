package com.ironsource;

/* loaded from: qd.class */
public class qd {
    protected long a;
    protected long b;
    protected long c;

    public long a() {
        return Math.max(0L, this.a - System.currentTimeMillis());
    }

    public void a(long j) {
        this.a = System.currentTimeMillis() + j;
    }

    public void b() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
    }

    public void b(long j) {
        this.c = j;
        this.a += j - this.b;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }
}
