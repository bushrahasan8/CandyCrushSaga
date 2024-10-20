package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: AdRequestOuterClass$AdRequestType.class */
public enum AdRequestOuterClass$AdRequestType implements Internal.EnumLite {
    AD_REQUEST_TYPE_UNSPECIFIED(0),
    AD_REQUEST_TYPE_FULLSCREEN(1),
    AD_REQUEST_TYPE_BANNER(2),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.AdRequestOuterClass$AdRequestType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public AdRequestOuterClass$AdRequestType findValueByNumber(int i) {
            return AdRequestOuterClass$AdRequestType.forNumber(i);
        }
    };
    private final int value;

    AdRequestOuterClass$AdRequestType(int i) {
        this.value = i;
    }

    public static AdRequestOuterClass$AdRequestType forNumber(int i) {
        if (i == 0) {
            return AD_REQUEST_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return AD_REQUEST_TYPE_FULLSCREEN;
        }
        if (i != 2) {
            return null;
        }
        return AD_REQUEST_TYPE_BANNER;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
