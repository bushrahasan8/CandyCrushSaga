package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: DeveloperConsentOuterClass$DeveloperConsentType.class */
public enum DeveloperConsentOuterClass$DeveloperConsentType implements Internal.EnumLite {
    DEVELOPER_CONSENT_TYPE_UNSPECIFIED(0),
    DEVELOPER_CONSENT_TYPE_CUSTOM(1),
    DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL(2),
    DEVELOPER_CONSENT_TYPE_PIPL_CONSENT(3),
    DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT(4),
    DEVELOPER_CONSENT_TYPE_GDPR_CONSENT(5),
    DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT(6),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DeveloperConsentOuterClass$DeveloperConsentType findValueByNumber(int i) {
            return DeveloperConsentOuterClass$DeveloperConsentType.forNumber(i);
        }
    };
    private final int value;

    DeveloperConsentOuterClass$DeveloperConsentType(int i) {
        this.value = i;
    }

    public static DeveloperConsentOuterClass$DeveloperConsentType forNumber(int i) {
        switch (i) {
            case 0:
                return DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
            case 1:
                return DEVELOPER_CONSENT_TYPE_CUSTOM;
            case 2:
                return DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
            case 3:
                return DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
            case 4:
                return DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
            case 5:
                return DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
            case 6:
                return DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
