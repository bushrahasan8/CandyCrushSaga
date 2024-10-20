package com.google.protobuf;

import java.nio.ByteBuffer;

@CheckReturnValue
/* loaded from: AllocatedBuffer.class */
abstract class AllocatedBuffer {
    AllocatedBuffer() {
    }

    public static AllocatedBuffer wrap(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer(byteBuffer) { // from class: com.google.protobuf.AllocatedBuffer.1
            final ByteBuffer val$buffer;

            {
                this.val$buffer = byteBuffer;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public byte[] array() {
                return this.val$buffer.array();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return this.val$buffer.arrayOffset();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return this.val$buffer.hasArray();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int limit() {
                return this.val$buffer.limit();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return this.val$buffer;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int position() {
                return this.val$buffer.position();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i) {
                return this;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int remaining() {
                return this.val$buffer.remaining();
            }
        };
    }

    public static AllocatedBuffer wrap(byte[] bArr) {
        return wrapNoCheck(bArr, 0, bArr.length);
    }

    public static AllocatedBuffer wrap(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return wrapNoCheck(bArr, i, i2);
    }

    private static AllocatedBuffer wrapNoCheck(byte[] bArr, int i, int i2) {
        return new AllocatedBuffer(bArr, i, i2) { // from class: com.google.protobuf.AllocatedBuffer.2
            private int position;
            final byte[] val$bytes;
            final int val$length;
            final int val$offset;

            {
                this.val$bytes = bArr;
                this.val$offset = i;
                this.val$length = i2;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public byte[] array() {
                return this.val$bytes;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return this.val$offset;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int limit() {
                return this.val$length;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i3) {
                if (i3 >= 0 && i3 <= this.val$length) {
                    this.position = i3;
                    return this;
                }
                throw new IllegalArgumentException("Invalid position: " + i3);
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int remaining() {
                return this.val$length - this.position;
            }
        };
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    @CanIgnoreReturnValue
    public abstract AllocatedBuffer position(int i);

    public abstract int remaining();
}
