package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: ClientInfoOuterClass$Platform.class */
public enum ClientInfoOuterClass$Platform implements Internal.EnumLite {
    PLATFORM_UNSPECIFIED(0),
    PLATFORM_ANDROID(1),
    PLATFORM_IOS(2),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.ClientInfoOuterClass$Platform.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ClientInfoOuterClass$Platform findValueByNumber(int i) {
            return ClientInfoOuterClass$Platform.forNumber(i);
        }
    };
    private final int value;

    ClientInfoOuterClass$Platform(int i) {
        this.value = i;
    }

    public static ClientInfoOuterClass$Platform forNumber(int i) {
        if (i == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i == 1) {
            return PLATFORM_ANDROID;
        }
        if (i != 2) {
            return null;
        }
        return PLATFORM_IOS;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
