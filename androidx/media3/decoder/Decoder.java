package androidx.media3.decoder;

/* loaded from: Decoder.class */
public interface Decoder {
    Object dequeueInputBuffer();

    Object dequeueOutputBuffer();

    void flush();

    void queueInputBuffer(Object obj);

    void release();
}
