package androidx.media3.decoder;

/* loaded from: DecoderOutputBuffer.class */
public abstract class DecoderOutputBuffer extends Buffer {
    public boolean shouldBeSkipped;
    public int skippedOutputBufferCount;
    public long timeUs;

    /* loaded from: DecoderOutputBuffer$Owner.class */
    public interface Owner {
        void releaseOutputBuffer(DecoderOutputBuffer decoderOutputBuffer);
    }

    @Override // androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.timeUs = 0L;
        this.skippedOutputBufferCount = 0;
        this.shouldBeSkipped = false;
    }

    public abstract void release();
}
