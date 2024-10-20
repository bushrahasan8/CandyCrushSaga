package com.applovin.impl;

import java.util.Arrays;

/* loaded from: tc.class */
public final class tc {
    private int a;
    private long[] b;

    public tc() {
        this(32);
    }

    public tc(int i) {
        this.b = new long[i];
    }

    public int a() {
        return this.a;
    }

    public long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public long[] b() {
        return Arrays.copyOf(this.b, this.a);
    }
}
