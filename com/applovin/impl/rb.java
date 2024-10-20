package com.applovin.impl;

import java.util.NoSuchElementException;

/* loaded from: rb.class */
final class rb {
    private int a = 0;
    private int b = -1;
    private int c = 0;
    private int[] d = new int[16];
    private int e = 15;

    private void b() {
        int[] iArr = this.d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.a;
        int i2 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.d, 0, iArr2, i2, i);
        this.a = 0;
        this.b = this.c - 1;
        this.d = iArr2;
        this.e = length - 1;
    }

    public void a() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public void a(int i) {
        if (this.c == this.d.length) {
            b();
        }
        int i2 = (this.b + 1) & this.e;
        this.b = i2;
        this.d[i2] = i;
        this.c++;
    }

    public boolean c() {
        return this.c == 0;
    }

    public int d() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.d;
        int i2 = this.a;
        int i3 = iArr[i2];
        this.a = (i2 + 1) & this.e;
        this.c = i - 1;
        return i3;
    }
}
