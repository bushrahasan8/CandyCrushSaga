package com.applovin.impl;

/* loaded from: gh.class */
public final class gh {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public gh(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    private void a() {
        int i;
        int i2 = this.c;
        f1.b(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0[r5 - 1] == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = r5
            if (r0 > r1) goto L2e
            r0 = r5
            r1 = r4
            int r1 = r1.b
            if (r0 >= r1) goto L2e
            r0 = r4
            byte[] r0 = r0.a
            r7 = r0
            r0 = r7
            r1 = r5
            r0 = r0[r1]
            r1 = 3
            if (r0 != r1) goto L2e
            r0 = r7
            r1 = r5
            r2 = 2
            int r1 = r1 - r2
            r0 = r0[r1]
            if (r0 != 0) goto L2e
            r0 = 1
            r6 = r0
            r0 = r7
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            r6 = r0
        L30:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gh.c(int):boolean");
    }

    private int d() {
        int i = 0;
        int i2 = 0;
        while (!c()) {
            i2++;
        }
        if (i2 > 0) {
            i = b(i2);
        }
        return ((1 << i2) - 1) + i;
    }

    public void a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        a();
    }

    public boolean a(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        int i6 = i2;
        int i7 = i4;
        int i8 = i5;
        if (i5 > 7) {
            i7 = i4 + 1;
            i8 = i5 - 8;
            i6 = i2;
        }
        while (true) {
            int i9 = i6 + 1;
            if (i9 > i7 || i7 >= this.b) {
                break;
            }
            if (c(i9)) {
                i7++;
                i6 += 3;
            } else {
                i6 = i9;
            }
        }
        int i10 = this.b;
        return i7 < i10 || (i7 == i10 && i8 == 0);
    }

    public int b(int i) {
        int i2;
        int i3;
        this.d += i;
        int i4 = 0;
        while (true) {
            i2 = this.d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            byte[] bArr = this.a;
            int i6 = this.c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!c(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        byte[] bArr2 = this.a;
        int i7 = this.c;
        byte b = bArr2[i7];
        if (i2 == 8) {
            this.d = 0;
            if (!c(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        a();
        return ((-1) >>> (32 - i)) & (i4 | ((b & 255) >> (8 - i2)));
    }

    public boolean b() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !c()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.d = i2;
        boolean z2 = false;
        if (!z) {
            z2 = false;
            if (a((i3 * 2) + 1)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean c() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        g();
        return z;
    }

    public void d(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        int i6 = i2;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
            i6 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            if (i7 > this.c) {
                a();
                return;
            }
            i6 = i7;
            if (c(i7)) {
                this.c++;
                i6 = i7 + 2;
            }
        }
    }

    public int e() {
        int d = d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    public int f() {
        return d();
    }

    public void g() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (c(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        a();
    }
}
