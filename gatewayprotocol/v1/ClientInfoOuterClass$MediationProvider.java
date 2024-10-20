package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: ClientInfoOuterClass$MediationProvider.class */
public enum ClientInfoOuterClass$MediationProvider implements Internal.EnumLite {
    MEDIATION_PROVIDER_UNSPECIFIED(0),
    MEDIATION_PROVIDER_CUSTOM(1),
    MEDIATION_PROVIDER_ADMOB(2),
    MEDIATION_PROVIDER_MAX(3),
    MEDIATION_PROVIDER_LEVELPLAY(4),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ClientInfoOuterClass$MediationProvider findValueByNumber(int i) {
            return ClientInfoOuterClass$MediationProvider.forNumber(i);
        }
    };
    private final int value;

    ClientInfoOuterClass$MediationProvider(int i) {
        this.value = i;
    }

    public static ClientInfoOuterClass$MediationProvider forNumber(int i) {
        if (i == 0) {
            return MEDIATION_PROVIDER_UNSPECIFIED;
        }
        if (i == 1) {
            return MEDIATION_PROVIDER_CUSTOM;
        }
        if (i == 2) {
            return MEDIATION_PROVIDER_ADMOB;
        }
        if (i == 3) {
            return MEDIATION_PROVIDER_MAX;
        }
        if (i != 4) {
            return null;
        }
        return MEDIATION_PROVIDER_LEVELPLAY;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
