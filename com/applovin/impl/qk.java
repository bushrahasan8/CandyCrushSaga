package com.applovin.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: qk.class */
final class qk {
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public qk(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    private int a(int i) {
        int min = Math.min(this.h, this.r);
        a(this.j, i, min);
        this.r -= min;
        return min;
    }

    private int a(short[] sArr, int i) {
        int i2;
        int i3 = this.a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.b == 1 && i4 == 1) {
            i2 = a(sArr, i, this.f, this.g);
        } else {
            b(sArr, i, i4);
            int a = a(this.i, 0, this.f / i4, this.g / i4);
            if (i4 != 1) {
                int i5 = a * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f;
                int i10 = i7;
                if (i7 < i9) {
                    i10 = i9;
                }
                int i11 = this.g;
                int i12 = i8;
                if (i8 > i11) {
                    i12 = i11;
                }
                if (this.b == 1) {
                    i2 = a(sArr, i, i10, i12);
                } else {
                    b(sArr, i, 1);
                    i2 = a(this.i, 0, i10, i12);
                }
            } else {
                i2 = a;
            }
        }
        int i13 = a(this.u, this.v) ? this.s : i2;
        this.t = this.u;
        this.s = i2;
        return i13;
    }

    private int a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] c = c(this.l, this.m, i4);
        this.l = c;
        int i5 = this.b;
        System.arraycopy(sArr, i * i5, c, this.m * i5, i5 * i2);
        a(i3, this.b, this.l, this.m + i2, sArr, i + i2, sArr, i);
        this.m += i4;
        return i3;
    }

    private int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i2 > i3) {
                this.u = i6 / i7;
                this.v = i9 / i5;
                return i7;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                i10 += Math.abs(sArr[i4 + i11] - sArr[(i4 + i2) + i11]);
            }
            int i12 = i6;
            int i13 = i7;
            if (i10 * i7 < i6 * i2) {
                i13 = i2;
                i12 = i10;
            }
            int i14 = i5;
            int i15 = i9;
            if (i10 * i5 > i9 * i2) {
                i14 = i2;
                i15 = i10;
            }
            i2++;
            i5 = i14;
            i6 = i12;
            i7 = i13;
            i8 = i15;
        }
    }

    private void a(float f) {
        int b;
        int i;
        int i2 = this.k;
        if (i2 < this.h) {
            return;
        }
        int i3 = 0;
        do {
            if (this.r > 0) {
                b = a(i3);
            } else {
                int a = a(this.j, i3);
                b = ((double) f) > 1.0d ? a + b(this.j, i3, f, a) : a(this.j, i3, f, a);
            }
            i = i3 + b;
            i3 = i;
        } while (this.h + i <= i2);
        d(i);
    }

    private void a(float f, int i) {
        int i2;
        int i3;
        if (this.m == i) {
            return;
        }
        int i4 = this.a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        b(i);
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = this.o - 1;
            if (i6 >= i7) {
                c(i7);
                return;
            }
            while (true) {
                i2 = this.p + 1;
                i3 = this.q;
                if (i2 * i5 <= i3 * i4) {
                    break;
                }
                this.l = c(this.l, this.m, 1);
                int i8 = 0;
                while (true) {
                    int i9 = this.b;
                    if (i8 < i9) {
                        this.l[(this.m * i9) + i8] = b(this.n, (i9 * i6) + i8, i4, i5);
                        i8++;
                    }
                }
                this.q++;
                this.m++;
            }
            this.p = i2;
            if (i2 == i4) {
                this.p = 0;
                if (i3 != i5) {
                    z = false;
                }
                f1.b(z);
                this.q = 0;
            }
            i6++;
        }
    }

    private static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    private void a(short[] sArr, int i, int i2) {
        short[] c = c(this.l, this.m, i2);
        this.l = c;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, c, this.m * i3, i3 * i2);
        this.m += i2;
    }

    private boolean a(int i, int i2) {
        return i != 0 && this.s != 0 && i2 <= i * 3 && i * 2 > this.t * 3;
    }

    private int b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] c = c(this.l, this.m, i3);
        this.l = c;
        a(i3, this.b, c, this.m, sArr, i, sArr, i + i2);
        this.m += i3;
        return i3;
    }

    private short b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.b];
        int i4 = this.q;
        int i5 = this.p;
        int i6 = (i5 + 1) * i3;
        int i7 = i6 - (i4 * i2);
        int i8 = i6 - (i5 * i3);
        return (short) (((s * i7) + ((i8 - i7) * s2)) / i8);
    }

    private void b(int i) {
        int i2 = this.m - i;
        short[] c = c(this.n, this.o, i2);
        this.n = c;
        short[] sArr = this.l;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, c, this.o * i3, i3 * i2);
        this.m = i;
        this.o += i2;
    }

    private void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                i7 += sArr[(i6 * i5) + (i * i4) + i8];
            }
            this.i[i6] = (short) (i7 / i5);
        }
    }

    private void c(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.n;
        int i2 = this.b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.o - i) * i2);
        this.o -= i;
    }

    private short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private void d() {
        int i = this.m;
        float f = this.c;
        float f2 = this.d;
        float f3 = f / f2;
        float f4 = this.e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            a(f3);
        } else {
            a(this.j, 0, this.k);
            this.k = 0;
        }
        if (f4 != 1.0f) {
            a(f4, i);
        }
    }

    private void d(int i) {
        int i2 = this.k - i;
        short[] sArr = this.j;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.k = i2;
    }

    public void a() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public void a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * min);
        int i = this.m - min;
        this.m = i;
        short[] sArr = this.l;
        int i2 = this.b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public int b() {
        return this.m * this.b * 2;
    }

    public void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.b;
        int i2 = remaining / i;
        short[] c = c(this.j, this.k, i2);
        this.j = c;
        shortBuffer.get(c, this.k * this.b, ((i * i2) * 2) / 2);
        this.k += i2;
        d();
    }

    public int c() {
        return this.k * this.b * 2;
    }

    public void e() {
        int i;
        int i2 = this.k;
        float f = this.c;
        float f2 = this.d;
        int i3 = this.m + ((int) ((((i2 / (f / f2)) + this.o) / (this.e * f2)) + 0.5f));
        this.j = c(this.j, i2, (this.h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.h * 2;
            int i5 = this.b;
            if (i4 >= i * i5) {
                break;
            }
            this.j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.k += i;
        d();
        if (this.m > i3) {
            this.m = i3;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }
}
