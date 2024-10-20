package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Charsets.class */
public final class Charsets {
    public static final Charsets INSTANCE = new Charsets();
    public static final Charset ISO_8859_1;
    public static final Charset US_ASCII;
    public static final Charset UTF_16;
    public static final Charset UTF_16BE;
    public static final Charset UTF_16LE;
    public static final Charset UTF_8;
    private static volatile Charset utf_32be;
    private static volatile Charset utf_32le;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        UTF_8 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(\"UTF-16\")");
        UTF_16 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName3, "forName(\"UTF-16BE\")");
        UTF_16BE = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(forName4, "forName(\"UTF-16LE\")");
        UTF_16LE = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(forName5, "forName(\"US-ASCII\")");
        US_ASCII = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(forName6, "forName(\"ISO-8859-1\")");
        ISO_8859_1 = forName6;
    }

    private Charsets() {
    }

    public final Charset UTF32_BE() {
        Charset charset = utf_32be;
        Charset charset2 = charset;
        if (charset == null) {
            charset2 = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(charset2, "forName(\"UTF-32BE\")");
            utf_32be = charset2;
        }
        return charset2;
    }

    public final Charset UTF32_LE() {
        Charset charset = utf_32le;
        Charset charset2 = charset;
        if (charset == null) {
            charset2 = Charset.forName("UTF-32LE");
            Intrinsics.checkNotNullExpressionValue(charset2, "forName(\"UTF-32LE\")");
            utf_32le = charset2;
        }
        return charset2;
    }
}
