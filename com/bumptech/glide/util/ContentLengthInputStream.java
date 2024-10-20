package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: ContentLengthInputStream.class */
public final class ContentLengthInputStream extends FilterInputStream {
    private final long contentLength;
    private int readSoFar;

    private ContentLengthInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.contentLength = j;
    }

    private int checkReadSoFarOrThrow(int i) {
        if (i >= 0) {
            this.readSoFar += i;
        } else if (this.contentLength - this.readSoFar > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.contentLength + ", but read: " + this.readSoFar);
        }
        return i;
    }

    public static InputStream obtain(InputStream inputStream, long j) {
        return new ContentLengthInputStream(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int max;
        synchronized (this) {
            max = (int) Math.max(this.contentLength - this.readSoFar, ((FilterInputStream) this).in.available());
        }
        return max;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        synchronized (this) {
            read = super.read();
            checkReadSoFarOrThrow(read >= 0 ? 1 : -1);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int checkReadSoFarOrThrow;
        synchronized (this) {
            checkReadSoFarOrThrow = checkReadSoFarOrThrow(super.read(bArr, i, i2));
        }
        return checkReadSoFarOrThrow;
    }
}
