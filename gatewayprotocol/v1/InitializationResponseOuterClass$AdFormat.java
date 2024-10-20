package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: InitializationResponseOuterClass$AdFormat.class */
public enum InitializationResponseOuterClass$AdFormat implements Internal.EnumLite {
    AD_FORMAT_UNSPECIFIED(0),
    AD_FORMAT_INTERSTITIAL(1),
    AD_FORMAT_REWARDED(2),
    AD_FORMAT_BANNER(3),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.InitializationResponseOuterClass$AdFormat.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public InitializationResponseOuterClass$AdFormat findValueByNumber(int i) {
            return InitializationResponseOuterClass$AdFormat.forNumber(i);
        }
    };
    private final int value;

    InitializationResponseOuterClass$AdFormat(int i) {
        this.value = i;
    }

    public static InitializationResponseOuterClass$AdFormat forNumber(int i) {
        if (i == 0) {
            return AD_FORMAT_UNSPECIFIED;
        }
        if (i == 1) {
            return AD_FORMAT_INTERSTITIAL;
        }
        if (i == 2) {
            return AD_FORMAT_REWARDED;
        }
        if (i != 3) {
            return null;
        }
        return AD_FORMAT_BANNER;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
