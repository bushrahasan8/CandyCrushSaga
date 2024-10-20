package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.data.DataRewinder;
import java.nio.ByteBuffer;

/* loaded from: ByteBufferRewinder.class */
public class ByteBufferRewinder implements DataRewinder {
    private final ByteBuffer buffer;

    /* loaded from: ByteBufferRewinder$Factory.class */
    public static class Factory implements DataRewinder.Factory {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public DataRewinder build(ByteBuffer byteBuffer) {
            return new ByteBufferRewinder(byteBuffer);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public Class getDataClass() {
            return ByteBuffer.class;
        }
    }

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public ByteBuffer rewindAndGet() {
        this.buffer.position(0);
        return this.buffer;
    }
}
