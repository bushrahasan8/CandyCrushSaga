package okio;

import com.google.android.gms.drive.ExecutionOptions;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.internal._BufferKt;

/* loaded from: Buffer.class */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    /* loaded from: Buffer$UnsafeCursor.class */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    public final void clear() {
        skip(size());
    }

    public Buffer clone() {
        return copy();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        long j = 0;
        if (size != 0) {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            j = size;
            if (segment2.limit < 8192) {
                j = size;
                if (segment2.owner) {
                    j = size - (r0 - segment2.pos);
                }
            }
        }
        return j;
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            Segment segment2 = segment.next;
            while (true) {
                Segment segment3 = segment2;
                if (segment3 == segment) {
                    break;
                }
                Segment segment4 = sharedCopy.prev;
                Intrinsics.checkNotNull(segment4);
                Intrinsics.checkNotNull(segment3);
                segment4.push(segment3.sharedCopy());
                segment2 = segment3.next;
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    public final Buffer copyTo(Buffer out, long j, long j2) {
        Segment segment;
        long j3;
        long j4;
        Intrinsics.checkNotNullParameter(out, "out");
        _UtilKt.checkOffsetAndCount(size(), j, j2);
        if (j2 != 0) {
            out.setSize$okio(out.size() + j2);
            Segment segment2 = this.head;
            while (true) {
                Segment segment3 = segment2;
                Intrinsics.checkNotNull(segment3);
                int i = segment3.limit;
                int i2 = segment3.pos;
                segment = segment3;
                j3 = j;
                j4 = j2;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                segment2 = segment3.next;
            }
            while (j4 > 0) {
                Intrinsics.checkNotNull(segment);
                Segment sharedCopy = segment.sharedCopy();
                int i3 = sharedCopy.pos + ((int) j3);
                sharedCopy.pos = i3;
                sharedCopy.limit = Math.min(i3 + ((int) j4), sharedCopy.limit);
                Segment segment4 = out.head;
                if (segment4 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    out.head = sharedCopy;
                } else {
                    Intrinsics.checkNotNull(segment4);
                    Segment segment5 = segment4.prev;
                    Intrinsics.checkNotNull(segment5);
                    segment5.push(sharedCopy);
                }
                j4 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j3 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            z = true;
        } else {
            if (obj instanceof Buffer) {
                Buffer buffer = (Buffer) obj;
                if (size() == buffer.size()) {
                    if (size() != 0) {
                        Segment segment = this.head;
                        Intrinsics.checkNotNull(segment);
                        Segment segment2 = buffer.head;
                        Intrinsics.checkNotNull(segment2);
                        int i = segment.pos;
                        int i2 = segment2.pos;
                        long j = 0;
                        loop0: while (true) {
                            z = true;
                            if (j >= size()) {
                                break;
                            }
                            long min = Math.min(segment.limit - i, segment2.limit - i2);
                            int i3 = i;
                            int i4 = i2;
                            if (0 < min) {
                                long j2 = 0;
                                while (true) {
                                    j2++;
                                    int i5 = i + 1;
                                    int i6 = i2 + 1;
                                    if (segment.data[i] != segment2.data[i2]) {
                                        break loop0;
                                    }
                                    if (j2 >= min) {
                                        i3 = i5;
                                        i4 = i6;
                                        break;
                                    }
                                    i2 = i6;
                                    i = i5;
                                }
                            }
                            Segment segment3 = segment;
                            i = i3;
                            if (i3 == segment.limit) {
                                segment3 = segment.next;
                                Intrinsics.checkNotNull(segment3);
                                i = segment3.pos;
                            }
                            Segment segment4 = segment2;
                            i2 = i4;
                            if (i4 == segment2.limit) {
                                segment4 = segment2.next;
                                Intrinsics.checkNotNull(segment4);
                                i2 = segment4.pos;
                            }
                            j += min;
                            segment2 = segment4;
                            segment = segment3;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j) {
        long j2;
        byte b;
        long j3;
        _UtilKt.checkOffsetAndCount(size(), j, 1L);
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (size() - j < j) {
            long size = size();
            while (true) {
                j3 = size;
                if (j3 <= j) {
                    break;
                }
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size = j3 - (segment.limit - segment.pos);
            }
            Intrinsics.checkNotNull(segment);
            b = segment.data[(int) ((segment.pos + j) - j3)];
        } else {
            long j4 = 0;
            while (true) {
                j2 = j4;
                long j5 = (segment.limit - segment.pos) + j2;
                if (j5 > j) {
                    break;
                }
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j4 = j5;
            }
            Intrinsics.checkNotNull(segment);
            b = segment.data[(int) ((segment.pos + j) - j2)];
        }
        return b;
    }

    public int hashCode() {
        int i;
        Segment segment;
        Segment segment2 = this.head;
        if (segment2 == null) {
            i = 0;
        } else {
            int i2 = 1;
            do {
                int i3 = segment2.limit;
                i = i2;
                for (int i4 = segment2.pos; i4 < i3; i4++) {
                    i = (i * 31) + segment2.data[i4];
                }
                segment = segment2.next;
                Intrinsics.checkNotNull(segment);
                segment2 = segment;
                i2 = i;
            } while (segment != this.head);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        r9 = (r13 - r23.pos) + r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long indexOf(byte r8, long r9, long r11) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.indexOf(byte, long, long):long");
    }

    public long indexOfElement(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    public long indexOfElement(ByteString targetBytes, long j) {
        long j2;
        int i;
        long j3;
        Segment segment;
        int i2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j4 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("fromIndex < 0: ", Long.valueOf(j)).toString());
        }
        Segment segment2 = this.head;
        if (segment2 == null) {
            j2 = -1;
        } else {
            Segment segment3 = segment2;
            if (size() - j < j) {
                j4 = size();
                segment3 = segment2;
                while (j4 > j) {
                    segment3 = segment3.prev;
                    Intrinsics.checkNotNull(segment3);
                    j4 -= segment3.limit - segment3.pos;
                }
                if (targetBytes.size() != 2) {
                    byte[] internalArray$okio = targetBytes.internalArray$okio();
                    long j5 = j;
                    loop3: while (true) {
                        long j6 = j5;
                        j2 = -1;
                        if (j4 >= size()) {
                            break;
                        }
                        byte[] bArr = segment3.data;
                        i = (int) ((segment3.pos + j6) - j4);
                        int i3 = segment3.limit;
                        while (i < i3) {
                            byte b = bArr[i];
                            int length = internalArray$okio.length;
                            int i4 = 0;
                            while (i4 < length) {
                                byte b2 = internalArray$okio[i4];
                                i4++;
                                if (b == b2) {
                                    break loop3;
                                }
                            }
                            i++;
                        }
                        j4 += segment3.limit - segment3.pos;
                        segment3 = segment3.next;
                        Intrinsics.checkNotNull(segment3);
                        j5 = j4;
                    }
                } else {
                    byte b3 = targetBytes.getByte(0);
                    byte b4 = targetBytes.getByte(1);
                    long j7 = j;
                    loop1: while (true) {
                        long j8 = j7;
                        j2 = -1;
                        if (j4 >= size()) {
                            break;
                        }
                        byte[] bArr2 = segment3.data;
                        int i5 = segment3.limit;
                        for (int i6 = (int) ((segment3.pos + j8) - j4); i6 < i5; i6++) {
                            byte b5 = bArr2[i6];
                            j3 = j4;
                            segment = segment3;
                            i = i6;
                            if (b5 == b3) {
                                break loop1;
                            }
                            if (b5 == b4) {
                                j3 = j4;
                                segment = segment3;
                                i = i6;
                                break loop1;
                            }
                        }
                        j4 += segment3.limit - segment3.pos;
                        segment3 = segment3.next;
                        Intrinsics.checkNotNull(segment3);
                        j7 = j4;
                    }
                    i2 = segment.pos;
                }
            } else {
                while (true) {
                    long j9 = (segment3.limit - segment3.pos) + j4;
                    if (j9 > j) {
                        break;
                    }
                    segment3 = segment3.next;
                    Intrinsics.checkNotNull(segment3);
                    j4 = j9;
                }
                if (targetBytes.size() == 2) {
                    byte b6 = targetBytes.getByte(0);
                    byte b7 = targetBytes.getByte(1);
                    long j10 = j;
                    loop7: while (true) {
                        long j11 = j10;
                        j2 = -1;
                        if (j4 >= size()) {
                            break;
                        }
                        byte[] bArr3 = segment3.data;
                        int i7 = segment3.limit;
                        for (int i8 = (int) ((segment3.pos + j11) - j4); i8 < i7; i8++) {
                            byte b8 = bArr3[i8];
                            j3 = j4;
                            segment = segment3;
                            i = i8;
                            if (b8 == b6) {
                                break loop7;
                            }
                            if (b8 == b7) {
                                j3 = j4;
                                segment = segment3;
                                i = i8;
                                break loop7;
                            }
                        }
                        j4 += segment3.limit - segment3.pos;
                        segment3 = segment3.next;
                        Intrinsics.checkNotNull(segment3);
                        j10 = j4;
                    }
                    i2 = segment.pos;
                } else {
                    byte[] internalArray$okio2 = targetBytes.internalArray$okio();
                    long j12 = j;
                    loop9: while (true) {
                        long j13 = j12;
                        j2 = -1;
                        if (j4 >= size()) {
                            break;
                        }
                        byte[] bArr4 = segment3.data;
                        i = (int) ((segment3.pos + j13) - j4);
                        int i9 = segment3.limit;
                        while (i < i9) {
                            byte b9 = bArr4[i];
                            int length2 = internalArray$okio2.length;
                            int i10 = 0;
                            while (i10 < length2) {
                                byte b10 = internalArray$okio2[i10];
                                i10++;
                                if (b9 == b10) {
                                    break loop9;
                                }
                            }
                            i++;
                        }
                        j4 += segment3.limit - segment3.pos;
                        segment3 = segment3.next;
                        Intrinsics.checkNotNull(segment3);
                        j12 = j4;
                    }
                    i2 = segment3.pos;
                    j3 = j4;
                }
            }
            j2 = (i - i2) + j3;
        }
        return j2;
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream(this) { // from class: okio.Buffer$inputStream$1
            final Buffer this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(this.this$0.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                return this.this$0.size() > 0 ? this.this$0.readByte() & 255 : -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int i, int i2) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                return this.this$0.read(sink, i, i2);
            }

            public String toString() {
                return this.this$0 + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, min);
        int i = segment.pos + min;
        segment.pos = i;
        this.size -= min;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public int read(byte[] sink, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(sink, "sink");
        _UtilKt.checkOffsetAndCount(sink.length, i, i2);
        Segment segment = this.head;
        if (segment == null) {
            i3 = -1;
        } else {
            int min = Math.min(i2, segment.limit - segment.pos);
            byte[] bArr = segment.data;
            int i4 = segment.pos;
            ArraysKt.copyInto(bArr, sink, i, i4, i4 + min);
            segment.pos += min;
            setSize$okio(size() - min);
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            i3 = min;
        }
        return i3;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        long j2;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
        }
        if (size() == 0) {
            j2 = -1;
        } else {
            j2 = j;
            if (j > size()) {
                j2 = size();
            }
            sink.write(this, j2);
        }
        return j2;
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        byte[] bArr = segment.data;
        int i3 = i + 1;
        byte b = bArr[i];
        setSize$okio(size() - 1);
        if (i3 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j) {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(j)).toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j) {
        ByteString byteString;
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(j)).toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        if (j >= 4096) {
            byteString = snapshot((int) j);
            skip(j);
        } else {
            byteString = new ByteString(readByteArray(j));
        }
        return byteString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        setSize$okio(size() - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        if (r9 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0123, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
    
        if (r8 >= r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
    
        if (size() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0139, code lost:
    
        if (r9 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        r19 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017d, code lost:
    
        throw new java.lang.NumberFormatException(r19 + " but was 0x" + okio._UtilKt.toHexString(getByte(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        r19 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0185, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0187, code lost:
    
        if (r9 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018d, code lost:
    
        r15 = -r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0194, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
    
        r7 = 1;
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= sink.length) {
                return;
            }
            int read = read(sink, i2, sink.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i = i2 + read;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        if (r10 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        throw new java.lang.NumberFormatException(kotlin.jvm.internal.Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", okio._UtilKt.toHexString(r0)));
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() {
        int i;
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 4) {
            i = ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        } else {
            byte[] bArr = segment.data;
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 1];
            byte b3 = bArr[i2 + 2];
            int i4 = i2 + 4;
            byte b4 = bArr[i2 + 3];
            setSize$okio(size() - 4);
            if (i4 == i3) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            i = (b4 & 255) | ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8);
        }
        return i;
    }

    public int readIntLe() {
        return _UtilKt.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public short readShort() {
        short s;
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            s = (short) (((readByte() & 255) << 8) | (readByte() & 255));
        } else {
            byte[] bArr = segment.data;
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            setSize$okio(size() - 2);
            if (i3 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            s = (short) ((b2 & 255) | ((b & 255) << 8));
        }
        return s;
    }

    public short readShortLe() {
        return _UtilKt.reverseBytes(readShort());
    }

    public String readString(long j, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(j)).toString());
        }
        if (this.size < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        if (i + j > segment.limit) {
            return new String(readByteArray(j), charset);
        }
        byte[] bArr = segment.data;
        int i2 = (int) j;
        String str = new String(bArr, i, i2, charset);
        int i3 = segment.pos + i2;
        segment.pos = i3;
        this.size -= j;
        if (i3 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    public String readUtf8(long j) {
        return readString(j, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j) {
        String readUtf8Line;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("limit < 0: ", Long.valueOf(j)).toString());
        }
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j + 1;
        }
        byte b = (byte) 10;
        long indexOf = indexOf(b, 0L, j2);
        if (indexOf != -1) {
            readUtf8Line = _BufferKt.readUtf8Line(this, indexOf);
        } else {
            if (j2 >= size() || getByte(j2 - 1) != ((byte) 13) || getByte(j2) != b) {
                Buffer buffer = new Buffer();
                copyTo(buffer, 0L, Math.min(32, size()));
                throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
            }
            readUtf8Line = _BufferKt.readUtf8Line(this, j2);
        }
        return readUtf8Line;
    }

    @Override // okio.BufferedSource
    public void require(long j) {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int selectPrefix$default = _BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            selectPrefix$default = -1;
        } else {
            skip(options.getByteStrings$okio()[selectPrefix$default].size());
        }
        return selectPrefix$default;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        while (j > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            setSize$okio(size() - j2);
            long j3 = j - j2;
            int i = segment.pos + min;
            segment.pos = i;
            j = j3;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
                j = j3;
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(Intrinsics.stringPlus("size > Int.MAX_VALUE: ", Long.valueOf(size())).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [okio.ByteString] */
    public final ByteString snapshot(int i) {
        SegmentedByteString segmentedByteString;
        if (i == 0) {
            segmentedByteString = ByteString.EMPTY;
        } else {
            _UtilKt.checkOffsetAndCount(size(), 0L, i);
            Segment segment = this.head;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                Intrinsics.checkNotNull(segment);
                int i5 = segment.limit;
                int i6 = segment.pos;
                if (i5 == i6) {
                    throw new AssertionError("s.limit == s.pos");
                }
                i3 += i5 - i6;
                i4++;
                segment = segment.next;
            }
            ?? r0 = new byte[i4];
            int[] iArr = new int[i4 * 2];
            Segment segment2 = this.head;
            int i7 = 0;
            while (i2 < i) {
                Intrinsics.checkNotNull(segment2);
                r0[i7] = segment2.data;
                i2 += segment2.limit - segment2.pos;
                iArr[i7] = Math.min(i2, i);
                iArr[i7 + i4] = segment2.pos;
                segment2.shared = true;
                i7++;
                segment2 = segment2.next;
            }
            segmentedByteString = new SegmentedByteString(r0, iArr);
        }
        return segmentedByteString;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i) {
        Segment segment;
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment2 = this.head;
        if (segment2 == null) {
            segment = SegmentPool.take();
            this.head = segment;
            segment.prev = segment;
            segment.next = segment;
        } else {
            Intrinsics.checkNotNull(segment2);
            segment = segment2.prev;
            Intrinsics.checkNotNull(segment);
            if (segment.limit + i > 8192 || !segment.owner) {
                segment = segment.push(SegmentPool.take());
            }
        }
        return segment;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i, 8192 - writableSegment$okio.limit);
            source.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        _UtilKt.checkOffsetAndCount(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            byte[] bArr = writableSegment$okio.data;
            int i4 = writableSegment$okio.limit;
            int i5 = i + min;
            ArraysKt.copyInto(source, bArr, i4, i, i5);
            writableSegment$okio.limit += min;
            i = i5;
        }
        setSize$okio(size() + j);
        return this;
    }

    @Override // okio.Sink
    public void write(Buffer source, long j) {
        Segment segment;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        _UtilKt.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            Segment segment2 = source.head;
            Intrinsics.checkNotNull(segment2);
            int i = segment2.limit;
            Intrinsics.checkNotNull(source.head);
            if (j < i - r0.pos) {
                Segment segment3 = this.head;
                if (segment3 != null) {
                    Intrinsics.checkNotNull(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                        Segment segment4 = source.head;
                        Intrinsics.checkNotNull(segment4);
                        segment4.writeTo(segment, (int) j);
                        source.setSize$okio(source.size() - j);
                        setSize$okio(size() + j);
                        return;
                    }
                }
                Segment segment5 = source.head;
                Intrinsics.checkNotNull(segment5);
                source.head = segment5.split((int) j);
            }
            Segment segment6 = source.head;
            Intrinsics.checkNotNull(segment6);
            long j2 = segment6.limit - segment6.pos;
            source.head = segment6.pop();
            Segment segment7 = this.head;
            if (segment7 == null) {
                this.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6;
            } else {
                Intrinsics.checkNotNull(segment7);
                Segment segment8 = segment7.prev;
                Intrinsics.checkNotNull(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j2);
            setSize$okio(size() + j2);
            j -= j2;
        }
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = j;
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j2;
            }
            j = j2 + read;
        }
    }

    @Override // okio.BufferedSink
    public Buffer writeByte(int i) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeDecimalLong(long j) {
        boolean z;
        Buffer buffer;
        if (j == 0) {
            buffer = writeByte(48);
        } else {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    buffer = writeUtf8("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (j >= 100000000) {
                i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
            } else if (j >= UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i = 2;
            }
            int i2 = i;
            if (z) {
                i2 = i + 1;
            }
            Segment writableSegment$okio = writableSegment$okio(i2);
            byte[] bArr = writableSegment$okio.data;
            int i3 = writableSegment$okio.limit + i2;
            while (j != 0) {
                long j2 = 10;
                i3--;
                bArr[i3] = _BufferKt.getHEX_DIGIT_BYTES()[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i3 - 1] = (byte) 45;
            }
            writableSegment$okio.limit += i2;
            setSize$okio(size() + i2);
            buffer = this;
        }
        return buffer;
    }

    @Override // okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j) {
        Buffer buffer;
        if (j == 0) {
            buffer = writeByte(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
            Segment writableSegment$okio = writableSegment$okio(i);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = _BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & j)];
                j >>>= 4;
            }
            writableSegment$okio.limit += i;
            setSize$okio(size() + i);
            buffer = this;
        }
        return buffer;
    }

    @Override // okio.BufferedSink
    public Buffer writeInt(int i) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public Buffer writeIntLe(int i) {
        return writeInt(_UtilKt.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    public Buffer writeShort(int i) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    public Buffer writeString(String string, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(i)).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return writeUtf8(string, i, i2);
        }
        String substring = string.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    public Buffer writeString(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public Buffer writeUtf8(String string, int i, int i2) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(i)).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        while (i < i2) {
            char charAt2 = string.charAt(i);
            if (charAt2 < 128) {
                Segment writableSegment$okio = writableSegment$okio(1);
                byte[] bArr = writableSegment$okio.data;
                int i3 = writableSegment$okio.limit - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = writableSegment$okio.limit;
                int i6 = (i3 + i) - i5;
                writableSegment$okio.limit = i5 + i6;
                setSize$okio(size() + i6);
            } else {
                if (charAt2 < 2048) {
                    Segment writableSegment$okio2 = writableSegment$okio(2);
                    byte[] bArr2 = writableSegment$okio2.data;
                    int i7 = writableSegment$okio2.limit;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit = i7 + 2;
                    setSize$okio(size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    Segment writableSegment$okio3 = writableSegment$okio(3);
                    byte[] bArr3 = writableSegment$okio3.data;
                    int i8 = writableSegment$okio3.limit;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit = i8 + 3;
                    setSize$okio(size() + 3);
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 > 57343) {
                        writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH;
                        Segment writableSegment$okio4 = writableSegment$okio(4);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i11 = writableSegment$okio4.limit;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        writableSegment$okio4.limit = i11 + 4;
                        setSize$okio(size() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public Buffer writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            Segment writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            writableSegment$okio.limit = i2 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i && i <= 57343) {
            writeByte(63);
        } else if (i < 65536) {
            Segment writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            writableSegment$okio2.limit = i3 + 3;
            setSize$okio(size() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected code point: 0x", _UtilKt.toHexString(i)));
            }
            Segment writableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i4 = writableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            writableSegment$okio3.limit = i4 + 4;
            setSize$okio(size() + 4);
        }
        return this;
    }
}
