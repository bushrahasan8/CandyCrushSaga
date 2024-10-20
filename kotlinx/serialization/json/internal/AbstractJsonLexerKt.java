package kotlinx.serialization.json.internal;

/* loaded from: AbstractJsonLexerKt.class */
public abstract class AbstractJsonLexerKt {
    public static final byte charToTokenClass(char c) {
        return c < '~' ? CharMappings.CHAR_TO_TOKEN[c] : (byte) 0;
    }

    public static final char escapeToChar(int i) {
        return i < 117 ? CharMappings.ESCAPE_2_CHAR[i] : (char) 0;
    }
}
