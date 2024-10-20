package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.google.android.gms.drive.ExecutionOptions;
import java.io.OutputStream;

/* loaded from: BufferedOutputStream.class */
public final class BufferedOutputStream extends OutputStream {
    private ArrayPool arrayPool;
    private byte[] buffer;
    private int index;
    private final OutputStream out;

    public BufferedOutputStream(OutputStream outputStream, ArrayPool arrayPool) {
        this(outputStream, arrayPool, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH);
    }

    BufferedOutputStream(OutputStream outputStream, ArrayPool arrayPool, int i) {
        this.out = outputStream;
        this.arrayPool = arrayPool;
        this.buffer = (byte[]) arrayPool.get(i, byte[].class);
    }

    private void flushBuffer() {
        int i = this.index;
        if (i > 0) {
            this.out.write(this.buffer, 0, i);
            this.index = 0;
        }
    }

    private void maybeFlushBuffer() {
        if (this.index == this.buffer.length) {
            flushBuffer();
        }
    }

    private void release() {
        byte[] bArr = this.buffer;
        if (bArr != null) {
            this.arrayPool.put(bArr);
            this.buffer = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.out.close();
            release();
        } catch (Throwable th) {
            this.out.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        flushBuffer();
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.buffer;
        int i2 = this.index;
        this.index = i2 + 1;
        bArr[i2] = (byte) i;
        maybeFlushBuffer();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = i2 - i4;
            int i6 = i + i4;
            int i7 = this.index;
            if (i7 == 0 && i5 >= this.buffer.length) {
                this.out.write(bArr, i6, i5);
                return;
            }
            int min = Math.min(i5, this.buffer.length - i7);
            System.arraycopy(bArr, i6, this.buffer, this.index, min);
            this.index += min;
            i3 = i4 + min;
            maybeFlushBuffer();
            i4 = i3;
        } while (i3 < i2);
    }
}
