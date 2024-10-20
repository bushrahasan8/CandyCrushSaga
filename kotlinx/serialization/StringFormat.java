package kotlinx.serialization;

/* loaded from: StringFormat.class */
public interface StringFormat extends SerialFormat {
    Object decodeFromString(DeserializationStrategy deserializationStrategy, String str);

    String encodeToString(SerializationStrategy serializationStrategy, Object obj);
}
