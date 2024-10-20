package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: DynamicDeviceInfoOuterClass$ConnectionType.class */
public enum DynamicDeviceInfoOuterClass$ConnectionType implements Internal.EnumLite {
    CONNECTION_TYPE_UNSPECIFIED(0),
    CONNECTION_TYPE_WIFI(1),
    CONNECTION_TYPE_CELLULAR(2),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DynamicDeviceInfoOuterClass$ConnectionType findValueByNumber(int i) {
            return DynamicDeviceInfoOuterClass$ConnectionType.forNumber(i);
        }
    };
    private final int value;

    DynamicDeviceInfoOuterClass$ConnectionType(int i) {
        this.value = i;
    }

    public static DynamicDeviceInfoOuterClass$ConnectionType forNumber(int i) {
        if (i == 0) {
            return CONNECTION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTION_TYPE_WIFI;
        }
        if (i != 2) {
            return null;
        }
        return CONNECTION_TYPE_CELLULAR;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
