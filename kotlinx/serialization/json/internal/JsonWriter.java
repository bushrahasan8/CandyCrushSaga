package kotlinx.serialization.json.internal;

/* loaded from: JsonWriter.class */
public interface JsonWriter {
    void write(String str);

    void writeChar(char c);

    void writeLong(long j);

    void writeQuoted(String str);
}
