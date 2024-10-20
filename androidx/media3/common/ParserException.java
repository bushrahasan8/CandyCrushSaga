package androidx.media3.common;

import java.io.IOException;

/* loaded from: ParserException.class */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException createForMalformedContainer(String str, Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(String str, Throwable th) {
        return new ParserException(str, th, true, 0);
    }

    public static ParserException createForMalformedManifest(String str, Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.contentIsMalformed + ", dataType=" + this.dataType + "}";
    }
}
