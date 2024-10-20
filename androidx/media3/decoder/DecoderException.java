package androidx.media3.decoder;

/* loaded from: DecoderException.class */
public abstract class DecoderException extends Exception {
    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(String str, Throwable th) {
        super(str, th);
    }

    public DecoderException(Throwable th) {
        super(th);
    }
}
