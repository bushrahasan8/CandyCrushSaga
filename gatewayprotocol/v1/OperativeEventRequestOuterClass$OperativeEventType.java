package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: OperativeEventRequestOuterClass$OperativeEventType.class */
public enum OperativeEventRequestOuterClass$OperativeEventType implements Internal.EnumLite {
    OPERATIVE_EVENT_TYPE_UNSPECIFIED(0),
    OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER(1),
    OPERATIVE_EVENT_TYPE_LOAD_ERROR(2),
    OPERATIVE_EVENT_TYPE_SHOW_ERROR(3),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public OperativeEventRequestOuterClass$OperativeEventType findValueByNumber(int i) {
            return OperativeEventRequestOuterClass$OperativeEventType.forNumber(i);
        }
    };
    private final int value;

    OperativeEventRequestOuterClass$OperativeEventType(int i) {
        this.value = i;
    }

    public static OperativeEventRequestOuterClass$OperativeEventType forNumber(int i) {
        if (i == 0) {
            return OPERATIVE_EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
        }
        if (i == 2) {
            return OPERATIVE_EVENT_TYPE_LOAD_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return OPERATIVE_EVENT_TYPE_SHOW_ERROR;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
