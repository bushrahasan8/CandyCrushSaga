package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: OperativeEventRequestOuterClass$OperativeEventErrorType.class */
public enum OperativeEventRequestOuterClass$OperativeEventErrorType implements Internal.EnumLite {
    OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED(0),
    OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT(1),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public OperativeEventRequestOuterClass$OperativeEventErrorType findValueByNumber(int i) {
            return OperativeEventRequestOuterClass$OperativeEventErrorType.forNumber(i);
        }
    };
    private final int value;

    OperativeEventRequestOuterClass$OperativeEventErrorType(int i) {
        this.value = i;
    }

    public static OperativeEventRequestOuterClass$OperativeEventErrorType forNumber(int i) {
        if (i == 0) {
            return OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
