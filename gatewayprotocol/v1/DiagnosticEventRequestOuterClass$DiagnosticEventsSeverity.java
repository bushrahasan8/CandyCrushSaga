package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity.class */
public enum DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity implements Internal.EnumLite {
    DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED(0),
    DIAGNOSTIC_EVENTS_SEVERITY_DEBUG(1),
    DIAGNOSTIC_EVENTS_SEVERITY_INFO(2),
    DIAGNOSTIC_EVENTS_SEVERITY_WARNING(3),
    DIAGNOSTIC_EVENTS_SEVERITY_ERROR(4),
    DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS(5),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity findValueByNumber(int i) {
            return DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity.forNumber(i);
        }
    };
    private final int value;

    DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity(int i) {
        this.value = i;
    }

    public static DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity forNumber(int i) {
        if (i == 0) {
            return DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED;
        }
        if (i == 1) {
            return DIAGNOSTIC_EVENTS_SEVERITY_DEBUG;
        }
        if (i == 2) {
            return DIAGNOSTIC_EVENTS_SEVERITY_INFO;
        }
        if (i == 3) {
            return DIAGNOSTIC_EVENTS_SEVERITY_WARNING;
        }
        if (i == 4) {
            return DIAGNOSTIC_EVENTS_SEVERITY_ERROR;
        }
        if (i != 5) {
            return null;
        }
        return DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
