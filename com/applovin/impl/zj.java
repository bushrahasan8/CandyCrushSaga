package com.applovin.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: zj.class */
public interface zj {

    /* loaded from: zj$a.class */
    public static class a implements zj {
        private final Random a;
        private final int[] b;
        private final int[] c;

        public a(int i) {
            this(i, new Random());
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        private a(int[] iArr, Random random) {
            this.b = iArr;
            this.a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= i) {
                    return iArr;
                }
                int i4 = i3 + 1;
                int nextInt = random.nextInt(i4);
                iArr[i3] = iArr[nextInt];
                iArr[nextInt] = i3;
                i2 = i4;
            }
        }

        @Override // com.applovin.impl.zj
        public int a() {
            return this.b.length;
        }

        @Override // com.applovin.impl.zj
        public int a(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            return i2 < iArr.length ? iArr[i2] : -1;
        }

        @Override // com.applovin.impl.zj
        public zj a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i4 >= iArr2.length) {
                    return new a(iArr, new Random(this.a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i6;
                    if (i6 >= i) {
                        i7 = i6 - i3;
                    }
                    iArr[i4 - i5] = i7;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // com.applovin.impl.zj
        public int b() {
            int[] iArr = this.b;
            return iArr.length > 0 ? iArr[0] : -1;
        }

        @Override // com.applovin.impl.zj
        public int b(int i) {
            int i2 = this.c[i];
            int i3 = -1;
            int i4 = i2 - 1;
            if (i4 >= 0) {
                i3 = this.b[i4];
            }
            return i3;
        }

        @Override // com.applovin.impl.zj
        public zj b(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= i2) {
                    break;
                }
                iArr[i5] = this.a.nextInt(this.b.length + 1);
                int i6 = i5 + 1;
                int nextInt = this.a.nextInt(i6);
                iArr2[i5] = iArr2[nextInt];
                iArr2[nextInt] = i5 + i;
                i4 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + i2];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i3 >= iArr4.length + i2) {
                    return new a(iArr3, new Random(this.a.nextLong()));
                }
                if (i7 >= i2 || i8 != iArr[i7]) {
                    int i9 = iArr4[i8];
                    iArr3[i3] = i9;
                    if (i9 >= i) {
                        iArr3[i3] = i9 + i2;
                    }
                    i8++;
                } else {
                    iArr3[i3] = iArr2[i7];
                    i7++;
                }
                i3++;
            }
        }

        @Override // com.applovin.impl.zj
        public int c() {
            int[] iArr = this.b;
            return iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        }

        @Override // com.applovin.impl.zj
        public zj d() {
            return new a(0, new Random(this.a.nextLong()));
        }
    }

    int a();

    int a(int i);

    zj a(int i, int i2);

    int b();

    int b(int i);

    zj b(int i, int i2);

    int c();

    zj d();
}
