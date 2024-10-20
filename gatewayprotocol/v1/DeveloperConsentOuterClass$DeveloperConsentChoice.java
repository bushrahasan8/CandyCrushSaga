package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: DeveloperConsentOuterClass$DeveloperConsentChoice.class */
public enum DeveloperConsentOuterClass$DeveloperConsentChoice implements Internal.EnumLite {
    DEVELOPER_CONSENT_CHOICE_UNSPECIFIED(0),
    DEVELOPER_CONSENT_CHOICE_TRUE(1),
    DEVELOPER_CONSENT_CHOICE_FALSE(2),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DeveloperConsentOuterClass$DeveloperConsentChoice findValueByNumber(int i) {
            return DeveloperConsentOuterClass$DeveloperConsentChoice.forNumber(i);
        }
    };
    private final int value;

    DeveloperConsentOuterClass$DeveloperConsentChoice(int i) {
        this.value = i;
    }

    public static DeveloperConsentOuterClass$DeveloperConsentChoice forNumber(int i) {
        if (i == 0) {
            return DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
        }
        if (i == 1) {
            return DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        if (i != 2) {
            return null;
        }
        return DEVELOPER_CONSENT_CHOICE_FALSE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
