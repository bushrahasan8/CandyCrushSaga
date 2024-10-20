package kotlinx.serialization;

/* loaded from: SerializationException.class */
public class SerializationException extends IllegalArgumentException {
    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }
}
