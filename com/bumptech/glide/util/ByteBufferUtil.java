package com.bumptech.glide.util;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ByteBufferUtil.class */
public abstract class ByteBufferUtil {
    private static final AtomicReference BUFFER_REF = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ByteBufferUtil$ByteBufferStream.class */
    public static class ByteBufferStream extends InputStream {
        private final ByteBuffer byteBuffer;
        private int markPos = -1;

        ByteBufferStream(ByteBuffer byteBuffer) {
            this.byteBuffer = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.byteBuffer.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            synchronized (this) {
                this.markPos = this.byteBuffer.position();
            }
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.byteBuffer.hasRemaining()) {
                return this.byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!this.byteBuffer.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.byteBuffer.get(bArr, i, min);
            return min;
        }

        @Override // java.io.InputStream
        public void reset() {
            synchronized (this) {
                int i = this.markPos;
                if (i == -1) {
                    throw new IOException("Cannot reset to unset mark position");
                }
                this.byteBuffer.position(i);
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.byteBuffer.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            this.byteBuffer.position((int) (r0.position() + min));
            return min;
        }
    }

    /* loaded from: ByteBufferUtil$SafeArray.class */
    public static final class SafeArray {
        final byte[] data;
        final int limit;
        final int offset;

        SafeArray(byte[] bArr, int i, int i2) {
            this.data = bArr;
            this.offset = i;
            this.limit = i2;
        }
    }

    public static ByteBuffer fromFile(File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            fileChannel = null;
            try {
                FileChannel channel = randomAccessFile.getChannel();
                fileChannel = channel;
                MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException e) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            fileChannel = null;
        }
    }

    public static ByteBuffer fromStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) BUFFER_REF.getAndSet(null);
        byte[] bArr2 = bArr;
        if (bArr == null) {
            bArr2 = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr2);
            if (read < 0) {
                BUFFER_REF.set(bArr2);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
    }

    private static SafeArray getSafeArray(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new SafeArray(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static byte[] toBytes(ByteBuffer byteBuffer) {
        byte[] bArr;
        SafeArray safeArray = getSafeArray(byteBuffer);
        if (safeArray != null && safeArray.offset == 0 && safeArray.limit == safeArray.data.length) {
            bArr = byteBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            bArr = new byte[asReadOnlyBuffer.limit()];
            asReadOnlyBuffer.position(0);
            asReadOnlyBuffer.get(bArr);
        }
        return bArr;
    }

    public static void toFile(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            FileChannel fileChannel2 = null;
            try {
                FileChannel channel = randomAccessFile2.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                fileChannel2 = channel;
                randomAccessFile2.close();
                try {
                    channel.close();
                } catch (IOException e) {
                }
                try {
                    randomAccessFile2.close();
                } catch (IOException e2) {
                }
            } catch (Throwable th) {
                th = th;
                fileChannel = fileChannel2;
                randomAccessFile = randomAccessFile2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static InputStream toStream(ByteBuffer byteBuffer) {
        return new ByteBufferStream(byteBuffer);
    }
}
