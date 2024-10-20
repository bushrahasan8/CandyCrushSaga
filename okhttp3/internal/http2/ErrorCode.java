package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ErrorCode.class */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final Companion Companion = new Companion(null);
    private final int httpCode;

    /* loaded from: ErrorCode$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCode fromHttp2(int i) {
            ErrorCode errorCode;
            ErrorCode[] values = ErrorCode.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    errorCode = null;
                    break;
                }
                errorCode = values[i2];
                if (errorCode.getHttpCode() == i) {
                    break;
                }
                i2++;
            }
            return errorCode;
        }
    }

    ErrorCode(int i) {
        this.httpCode = i;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
