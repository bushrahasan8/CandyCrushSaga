package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: DiagnosticEventRequestOuterClass$DiagnosticTagType.class */
public enum DiagnosticEventRequestOuterClass$DiagnosticTagType implements Internal.EnumLite {
    DIAGNOSTIC_TAG_TYPE_UNSPECIFIED(0),
    DIAGNOSTIC_TAG_TYPE_CUSTOM(1),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DiagnosticEventRequestOuterClass$DiagnosticTagType findValueByNumber(int i) {
            return DiagnosticEventRequestOuterClass$DiagnosticTagType.forNumber(i);
        }
    };
    private final int value;

    DiagnosticEventRequestOuterClass$DiagnosticTagType(int i) {
        this.value = i;
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticTagType forNumber(int i) {
        if (i == 0) {
            return DIAGNOSTIC_TAG_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return DIAGNOSTIC_TAG_TYPE_CUSTOM;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
