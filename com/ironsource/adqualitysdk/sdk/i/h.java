package com.ironsource.adqualitysdk.sdk.i;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: h.class */
public final class h extends FilterInputStream {

    /* renamed from: ﬤ, reason: contains not printable characters */
    private int f2315;

    /* renamed from: ףּ, reason: contains not printable characters */
    private int f2316;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private final int f2317;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private int f2318;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private final int f2319;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private int f2320;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private final byte[] f2321;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final byte[] f2322;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final byte[][] f2323;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final int[] f2324;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final int f2325;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final int[] f2326;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2313 = i.f2484;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final int[] f2311 = i.f2482;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final int[] f2314 = i.f2483;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final int[] f2310 = i.f2486;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final int[] f2312 = i.f2485;

    public h(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private h(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.f2326 = new int[4];
        this.f2322 = new byte[16];
        this.f2321 = new byte[16];
        this.f2318 = 1;
        this.f2320 = Integer.MAX_VALUE;
        this.f2316 = 16;
        this.f2315 = 16;
        this.f2325 = i;
        this.f2324 = i.m5281(bArr, i);
        this.f2323 = m5089(bArr2);
        this.f2317 = 100;
        this.f2319 = 100;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], byte[][]] */
    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[][] m5089(byte[][] bArr) {
        ?? r0 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            r0[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr2 = bArr[i];
                if (i2 < bArr2.length) {
                    r0[i][bArr2[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return r0;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private int m5090() {
        int i;
        if (this.f2320 == Integer.MAX_VALUE) {
            this.f2320 = ((FilterInputStream) this).in.read();
        }
        if (this.f2316 == 16) {
            byte[] bArr = this.f2322;
            int i2 = this.f2320;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.f2322, i3, 16 - i3);
                i = i3;
                if (read <= 0) {
                    break;
                }
                i = i3 + read;
                i3 = i;
            } while (i < 16);
            if (i < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.f2317;
            if (i4 == this.f2319) {
                m5091(this.f2322, this.f2321);
            } else {
                if (this.f2318 <= i4) {
                    m5091(this.f2322, this.f2321);
                } else {
                    byte[] bArr2 = this.f2322;
                    System.arraycopy(bArr2, 0, this.f2321, 0, bArr2.length);
                }
                int i5 = this.f2318;
                if (i5 < this.f2319) {
                    this.f2318 = i5 + 1;
                } else {
                    this.f2318 = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.f2320 = read2;
            this.f2316 = 0;
            int i6 = 16;
            if (read2 < 0) {
                i6 = 16 - (this.f2321[15] & 255);
            }
            this.f2315 = i6;
        }
        return this.f2315;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m5091(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f2326;
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        int[] iArr2 = this.f2324;
        iArr[0] = ((((b << 24) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255)) ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i = 4;
        int i2 = 1;
        while (i2 < this.f2325) {
            int[] iArr3 = f2311;
            int[] iArr4 = this.f2326;
            byte[][] bArr3 = this.f2323;
            byte[] bArr4 = bArr3[0];
            int i3 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = f2314;
            byte[] bArr5 = bArr3[1];
            int i4 = iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = f2310;
            byte[] bArr6 = bArr3[2];
            int i5 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = f2312;
            byte[] bArr7 = bArr3[3];
            int i6 = iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.f2324;
            int i7 = iArr8[i];
            int i8 = iArr3[iArr4[bArr4[1]] >>> 24];
            int i9 = iArr5[(iArr4[bArr5[1]] >>> 16) & 255];
            int i10 = iArr6[(iArr4[bArr6[1]] >>> 8) & 255];
            int i11 = iArr7[iArr4[bArr7[1]] & 255];
            int i12 = iArr8[i + 1];
            int i13 = iArr3[iArr4[bArr4[2]] >>> 24];
            int i14 = iArr5[(iArr4[bArr5[2]] >>> 16) & 255];
            int i15 = iArr6[(iArr4[bArr6[2]] >>> 8) & 255];
            int i16 = iArr7[iArr4[bArr7[2]] & 255];
            int i17 = iArr8[i + 2];
            int i18 = iArr3[iArr4[bArr4[3]] >>> 24];
            int i19 = iArr5[(iArr4[bArr5[3]] >>> 16) & 255];
            int i20 = iArr6[(iArr4[bArr6[3]] >>> 8) & 255];
            int i21 = iArr7[iArr4[bArr7[3]] & 255];
            int i22 = iArr8[i + 3];
            iArr4[0] = (i6 ^ (i5 ^ (i3 ^ i4))) ^ i7;
            iArr4[1] = ((i10 ^ (i8 ^ i9)) ^ i11) ^ i12;
            iArr4[2] = (((i14 ^ i13) ^ i15) ^ i16) ^ i17;
            iArr4[3] = (((i18 ^ i19) ^ i20) ^ i21) ^ i22;
            i2++;
            i += 4;
        }
        int[] iArr9 = this.f2324;
        int i23 = iArr9[i];
        byte[] bArr8 = f2313;
        int[] iArr10 = this.f2326;
        byte[][] bArr9 = this.f2323;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i23 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i23 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i23 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i23);
        int i24 = iArr9[i + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i24 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[7] = (byte) (i24 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i25 = iArr9[i + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i25 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[11] = (byte) (i25 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i26 = iArr9[i + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i26 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[15] = (byte) (i26 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        m5090();
        return this.f2315 - this.f2316;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m5090();
        int i = this.f2316;
        if (i >= this.f2315) {
            return -1;
        }
        byte[] bArr = this.f2321;
        this.f2316 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m5090();
            int i5 = this.f2316;
            if (i5 >= this.f2315) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.f2321;
            this.f2316 = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2;
        long j3 = 0;
        while (true) {
            j2 = j3;
            if (j2 >= j || read() == -1) {
                break;
            }
            j3 = j2 + 1;
        }
        return j2;
    }
}
