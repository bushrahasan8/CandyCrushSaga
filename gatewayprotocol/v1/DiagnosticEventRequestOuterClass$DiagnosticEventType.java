package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: DiagnosticEventRequestOuterClass$DiagnosticEventType.class */
public enum DiagnosticEventRequestOuterClass$DiagnosticEventType implements Internal.EnumLite {
    DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
    DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DiagnosticEventRequestOuterClass$DiagnosticEventType findValueByNumber(int i) {
            return DiagnosticEventRequestOuterClass$DiagnosticEventType.forNumber(i);
        }
    };
    private final int value;

    DiagnosticEventRequestOuterClass$DiagnosticEventType(int i) {
        this.value = i;
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventType forNumber(int i) {
        if (i == 0) {
            return DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return DIAGNOSTIC_EVENT_TYPE_CUSTOM;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
