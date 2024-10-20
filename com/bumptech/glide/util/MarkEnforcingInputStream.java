package com.bumptech.glide.util;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: MarkEnforcingInputStream.class */
public class MarkEnforcingInputStream extends FilterInputStream {
    private int availableBytes;

    public MarkEnforcingInputStream(InputStream inputStream) {
        super(inputStream);
        this.availableBytes = RecyclerView.UNDEFINED_DURATION;
    }

    private long getBytesToRead(long j) {
        int i = this.availableBytes;
        if (i == 0) {
            return -1L;
        }
        long j2 = j;
        if (i != Integer.MIN_VALUE) {
            j2 = j;
            if (j > i) {
                j2 = i;
            }
        }
        return j2;
    }

    private void updateAvailableBytesAfterRead(long j) {
        int i = this.availableBytes;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.availableBytes = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.availableBytes;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            super.mark(i);
            this.availableBytes = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (getBytesToRead(1L) == -1) {
            return -1;
        }
        int read = super.read();
        updateAvailableBytesAfterRead(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int bytesToRead = (int) getBytesToRead(i2);
        if (bytesToRead == -1) {
            return -1;
        }
        int read = super.read(bArr, i, bytesToRead);
        updateAvailableBytesAfterRead(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        synchronized (this) {
            super.reset();
            this.availableBytes = RecyclerView.UNDEFINED_DURATION;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long bytesToRead = getBytesToRead(j);
        if (bytesToRead == -1) {
            return 0L;
        }
        long skip = super.skip(bytesToRead);
        updateAvailableBytesAfterRead(skip);
        return skip;
    }
}
