package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.google.android.gms.drive.ExecutionOptions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: RecyclableBufferedInputStream.class */
public class RecyclableBufferedInputStream extends FilterInputStream {
    private volatile byte[] buf;
    private final ArrayPool byteArrayPool;
    private int count;
    private int marklimit;
    private int markpos;
    private int pos;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: RecyclableBufferedInputStream$InvalidMarkException.class */
    public static class InvalidMarkException extends IOException {
        InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool) {
        this(inputStream, arrayPool, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH);
    }

    RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool, int i) {
        super(inputStream);
        this.markpos = -1;
        this.byteArrayPool = arrayPool;
        this.buf = (byte[]) arrayPool.get(i, byte[].class);
    }

    private int fillbuf(InputStream inputStream, byte[] bArr) {
        byte[] bArr2;
        int i = this.markpos;
        if (i != -1) {
            int i2 = this.pos;
            int i3 = this.marklimit;
            if (i2 - i < i3) {
                if (i == 0 && i3 > bArr.length && this.count == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    bArr2 = (byte[]) this.byteArrayPool.get(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.buf = bArr2;
                    this.byteArrayPool.put(bArr);
                } else {
                    bArr2 = bArr;
                    if (i > 0) {
                        System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                        bArr2 = bArr;
                    }
                }
                int i4 = this.pos - this.markpos;
                this.pos = i4;
                this.markpos = 0;
                this.count = 0;
                int read = inputStream.read(bArr2, i4, bArr2.length - i4);
                int i5 = this.pos;
                if (read > 0) {
                    i5 += read;
                }
                this.count = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.markpos = -1;
            this.pos = 0;
            this.count = read2;
        }
        return read2;
    }

    private static IOException streamClosed() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i;
        int i2;
        int available;
        synchronized (this) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (this.buf == null || inputStream == null) {
                throw streamClosed();
            }
            i = this.count;
            i2 = this.pos;
            available = inputStream.available();
        }
        return (i - i2) + available;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.buf != null) {
            this.byteArrayPool.put(this.buf);
            this.buf = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public void fixMarkLimit() {
        synchronized (this) {
            this.marklimit = this.buf.length;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            this.marklimit = Math.max(this.marklimit, i);
            this.markpos = this.pos;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        synchronized (this) {
            byte[] bArr = this.buf;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr == null || inputStream == null) {
                throw streamClosed();
            }
            if (this.pos >= this.count && fillbuf(inputStream, bArr) == -1) {
                return -1;
            }
            byte[] bArr2 = bArr;
            if (bArr != this.buf) {
                bArr2 = this.buf;
                if (bArr2 == null) {
                    throw streamClosed();
                }
            }
            int i = this.count;
            int i2 = this.pos;
            if (i - i2 <= 0) {
                return -1;
            }
            this.pos = i2 + 1;
            return bArr2[i2] & 255;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2;
        int i5;
        synchronized (this) {
            byte[] bArr3 = this.buf;
            if (bArr3 == null) {
                throw streamClosed();
            }
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw streamClosed();
            }
            int i6 = this.pos;
            int i7 = this.count;
            if (i6 < i7) {
                int i8 = i7 - i6 >= i2 ? i2 : i7 - i6;
                System.arraycopy(bArr3, i6, bArr, i, i8);
                this.pos += i8;
                if (i8 == i2 || inputStream.available() == 0) {
                    return i8;
                }
                int i9 = i + i8;
                i4 = i2 - i8;
                i3 = i9;
            } else {
                i3 = i;
                i4 = i2;
            }
            while (true) {
                int i10 = -1;
                if (this.markpos == -1 && i4 >= bArr3.length) {
                    int read = inputStream.read(bArr, i3, i4);
                    bArr2 = bArr3;
                    i5 = read;
                    if (read == -1) {
                        if (i4 != i2) {
                            i10 = i2 - i4;
                        }
                        return i10;
                    }
                } else {
                    if (fillbuf(inputStream, bArr3) == -1) {
                        if (i4 != i2) {
                            i10 = i2 - i4;
                        }
                        return i10;
                    }
                    bArr2 = bArr3;
                    if (bArr3 != this.buf) {
                        bArr2 = this.buf;
                        if (bArr2 == null) {
                            throw streamClosed();
                        }
                    }
                    int i11 = this.count;
                    int i12 = this.pos;
                    int i13 = i11 - i12 >= i4 ? i4 : i11 - i12;
                    System.arraycopy(bArr2, i12, bArr, i3, i13);
                    this.pos += i13;
                    i5 = i13;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i4;
                }
                i3 += i5;
                bArr3 = bArr2;
            }
        }
    }

    public void release() {
        synchronized (this) {
            if (this.buf != null) {
                this.byteArrayPool.put(this.buf);
                this.buf = null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        synchronized (this) {
            if (this.buf == null) {
                throw new IOException("Stream is closed");
            }
            int i = this.markpos;
            if (-1 == i) {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.pos + " markLimit: " + this.marklimit);
            }
            this.pos = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        synchronized (this) {
            if (j < 1) {
                return 0L;
            }
            byte[] bArr = this.buf;
            if (bArr == null) {
                throw streamClosed();
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw streamClosed();
            }
            int i = this.count;
            int i2 = this.pos;
            if (i - i2 >= j) {
                this.pos = (int) (i2 + j);
                return j;
            }
            long j2 = i - i2;
            this.pos = i;
            if (this.markpos == -1 || j > this.marklimit) {
                return j2 + inputStream.skip(j - j2);
            }
            if (fillbuf(inputStream, bArr) == -1) {
                return j2;
            }
            int i3 = this.count;
            int i4 = this.pos;
            if (i3 - i4 >= j - j2) {
                this.pos = (int) ((i4 + j) - j2);
                return j;
            }
            long j3 = i3;
            long j4 = i4;
            this.pos = i3;
            return (j2 + j3) - j4;
        }
    }
}
