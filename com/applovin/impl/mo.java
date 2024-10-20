package com.applovin.impl;

import java.util.Arrays;

/* loaded from: mo.class */
public final class mo {
    private long[] a;
    private Object[] b;
    private int c;
    private int d;

    public mo() {
        this(10);
    }

    public mo(int i) {
        this.a = new long[i];
        this.b = a(i);
    }

    private Object a(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (true) {
            long j3 = j2;
            if (this.d <= 0) {
                break;
            }
            long j4 = j - this.a[this.c];
            if (j4 < 0 && (z || (-j4) >= j3)) {
                break;
            }
            obj = d();
            j2 = j4;
        }
        return obj;
    }

    private void a(long j) {
        int i = this.d;
        if (i > 0) {
            int i2 = this.c;
            if (j <= this.a[((i2 + i) - 1) % this.b.length]) {
                a();
            }
        }
    }

    private static Object[] a(int i) {
        return new Object[i];
    }

    private void b() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] a = a(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, a, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, a, i3, this.c);
        }
        this.a = jArr;
        this.b = a;
        this.c = 0;
    }

    private void b(long j, Object obj) {
        int i = this.c;
        int i2 = this.d;
        Object[] objArr = this.b;
        int length = (i + i2) % objArr.length;
        this.a[length] = j;
        objArr[length] = obj;
        this.d = i2 + 1;
    }

    private Object d() {
        f1.b(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public void a() {
        synchronized (this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill(this.b, (Object) null);
        }
    }

    public void a(long j, Object obj) {
        synchronized (this) {
            a(j);
            b();
            b(j, obj);
        }
    }

    public Object b(long j) {
        Object a;
        synchronized (this) {
            a = a(j, false);
        }
        return a;
    }

    public Object c() {
        Object d;
        synchronized (this) {
            d = this.d == 0 ? null : d();
        }
        return d;
    }

    public Object c(long j) {
        Object a;
        synchronized (this) {
            a = a(j, true);
        }
        return a;
    }

    public int e() {
        int i;
        synchronized (this) {
            i = this.d;
        }
        return i;
    }
}
