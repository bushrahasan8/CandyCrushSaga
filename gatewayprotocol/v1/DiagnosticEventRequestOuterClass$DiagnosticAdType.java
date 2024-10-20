package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: DiagnosticEventRequestOuterClass$DiagnosticAdType.class */
public enum DiagnosticEventRequestOuterClass$DiagnosticAdType implements Internal.EnumLite {
    DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
    DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
    DIAGNOSTIC_AD_TYPE_BANNER(2),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DiagnosticEventRequestOuterClass$DiagnosticAdType findValueByNumber(int i) {
            return DiagnosticEventRequestOuterClass$DiagnosticAdType.forNumber(i);
        }
    };
    private final int value;

    DiagnosticEventRequestOuterClass$DiagnosticAdType(int i) {
        this.value = i;
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticAdType forNumber(int i) {
        if (i == 0) {
            return DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DIAGNOSTIC_AD_TYPE_FULLSCREEN;
        }
        if (i != 2) {
            return null;
        }
        return DIAGNOSTIC_AD_TYPE_BANNER;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
