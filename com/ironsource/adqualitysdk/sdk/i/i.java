package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: i.class */
public final class i {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f2481 = new byte[256];

    /* renamed from: ｋ, reason: contains not printable characters */
    static final byte[] f2484 = new byte[256];

    /* renamed from: ﻐ, reason: contains not printable characters */
    static final int[] f2482 = new int[256];

    /* renamed from: ﻛ, reason: contains not printable characters */
    static final int[] f2483 = new int[256];

    /* renamed from: ﾒ, reason: contains not printable characters */
    static final int[] f2486 = new int[256];

    /* renamed from: ﾇ, reason: contains not printable characters */
    static final int[] f2485 = new int[256];

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f2480 = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) (((b & 128) != 0 ? 27 : 0) ^ ((b << 1) ^ b));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = f2481;
            i = b & 255;
            int i2 = b2 & 255;
            bArr[i] = (byte) (((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 >> 4) | (i2 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = f2481[i3] & 255;
            f2484[i4] = (byte) i3;
            int i5 = i3 << 1;
            int i6 = i5;
            if (i5 >= 256) {
                i6 = i5 ^ 283;
            }
            int i7 = i6 << 1;
            int i8 = i7;
            if (i7 >= 256) {
                i8 = i7 ^ 283;
            }
            int i9 = i8 << 1;
            int i10 = i9;
            if (i9 >= 256) {
                i10 = i9 ^ 283;
            }
            int i11 = i10 ^ i3;
            int i12 = ((i6 ^ (i8 ^ i10)) << 24) | (i11 << 16) | ((i11 ^ i8) << 8) | (i11 ^ i6);
            f2482[i4] = i12;
            f2483[i4] = (i12 >>> 8) | (i12 << 24);
            f2486[i4] = (i12 >>> 16) | (i12 << 16);
            f2485[i4] = (i12 << 8) | (i12 >>> 24);
        }
        f2480[0] = 16777216;
        int i13 = 1;
        for (int i14 = 1; i14 < 10; i14++) {
            int i15 = i13 << 1;
            i13 = i15;
            if (i15 >= 256) {
                i13 = i15 ^ 283;
            }
            f2480[i14] = i13 << 24;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static int[] m5281(byte[] bArr, int i) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 1) * 4;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i3 >= 4) {
                break;
            }
            i4 = i5 + 4;
            iArr[i3] = ((bArr[i5 + 1] & 255) << 16) | (bArr[i5] << 24) | ((bArr[i5 + 2] & 255) << 8) | (bArr[i5 + 3] & 255);
            i3++;
        }
        int i6 = 4;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i6 >= i2) {
                break;
            }
            int i10 = iArr[i6 - 1];
            int i11 = i7;
            int i12 = i9;
            int i13 = i10;
            if (i7 == 0) {
                byte[] bArr2 = f2481;
                i13 = ((bArr2[i10 >>> 24] & 255) | (((bArr2[(i10 >>> 16) & 255] << 24) | ((bArr2[(i10 >>> 8) & 255] & 255) << 16)) | ((bArr2[i10 & 255] & 255) << 8))) ^ f2480[i9];
                i11 = 4;
                i12 = i9 + 1;
            }
            iArr[i6] = i13 ^ iArr[i6 - 4];
            i6++;
            i7 = i11 - 1;
            i8 = i12;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i2];
        int i14 = i * 4;
        iArr2[0] = iArr[i14];
        int i15 = 1;
        iArr2[1] = iArr[i14 + 1];
        iArr2[2] = iArr[i14 + 2];
        iArr2[3] = iArr[i14 + 3];
        int i16 = i14 - 4;
        int i17 = 4;
        while (true) {
            int i18 = i17;
            if (i15 >= i) {
                iArr2[i18] = iArr[i16];
                iArr2[i18 + 1] = iArr[i16 + 1];
                iArr2[i18 + 2] = iArr[i16 + 2];
                iArr2[i18 + 3] = iArr[i16 + 3];
                return iArr2;
            }
            int i19 = iArr[i16];
            int[] iArr3 = f2482;
            byte[] bArr3 = f2481;
            int i20 = iArr3[bArr3[i19 >>> 24] & 255];
            int[] iArr4 = f2483;
            int i21 = iArr4[bArr3[(i19 >>> 16) & 255] & 255];
            int[] iArr5 = f2486;
            int i22 = iArr5[bArr3[(i19 >>> 8) & 255] & 255];
            int[] iArr6 = f2485;
            iArr2[i18] = iArr6[bArr3[i19 & 255] & 255] ^ ((i20 ^ i21) ^ i22);
            int i23 = iArr[i16 + 1];
            iArr2[i18 + 1] = ((iArr4[bArr3[(i23 >>> 16) & 255] & 255] ^ iArr3[bArr3[i23 >>> 24] & 255]) ^ iArr5[bArr3[(i23 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i23 & 255] & 255];
            int i24 = iArr[i16 + 2];
            iArr2[i18 + 2] = iArr6[bArr3[i24 & 255] & 255] ^ ((iArr3[bArr3[i24 >>> 24] & 255] ^ iArr4[bArr3[(i24 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i24 >>> 8) & 255] & 255]);
            int i25 = iArr[i16 + 3];
            iArr2[i18 + 3] = iArr6[bArr3[i25 & 255] & 255] ^ ((iArr3[bArr3[i25 >>> 24] & 255] ^ iArr4[bArr3[(i25 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i25 >>> 8) & 255] & 255]);
            i16 -= 4;
            i15++;
            i17 = i18 + 4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], byte[][]] */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static byte[][] m5282(int i) {
        ?? r0 = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            byte[] bArr = new byte[4];
            bArr[0] = (byte) (i3 & 3);
            bArr[1] = (byte) ((i3 >> 2) & 3);
            bArr[2] = (byte) ((i3 >> 4) & 3);
            bArr[3] = (byte) ((i3 >> 6) & 3);
            r0[i2] = bArr;
        }
        return r0;
    }
}
