package com.applovin.impl;

/* loaded from: jq.class */
final class jq {
    private static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] a = new byte[8];
    private int b;
    private int c;

    public static int a(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            long[] jArr = d;
            if (i3 >= jArr.length) {
                i2 = -1;
                break;
            }
            i2 = i3 + 1;
            i3 = i2;
            if ((jArr[i3] & i) != 0) {
                break;
            }
        }
        return i2;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        long j2 = j;
        if (z) {
            j2 = j & (d[i - 1] ^ (-1));
        }
        for (int i2 = 1; i2 < i; i2++) {
            j2 = (j2 << 8) | (bArr[i2] & 255);
        }
        return j2;
    }

    public int a() {
        return this.c;
    }

    public long a(q8 q8Var, boolean z, boolean z2, int i) {
        if (this.b == 0) {
            if (!q8Var.a(this.a, 0, 1, z)) {
                return -1L;
            }
            int a = a(this.a[0] & 255);
            this.c = a;
            if (a == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i2 = this.c;
        if (i2 > i) {
            this.b = 0;
            return -2L;
        }
        if (i2 != 1) {
            q8Var.d(this.a, 1, i2 - 1);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }

    public void b() {
        this.b = 0;
        this.c = 0;
    }
}
