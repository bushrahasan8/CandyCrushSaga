package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: TransactionEventRequestOuterClass$StoreType.class */
public enum TransactionEventRequestOuterClass$StoreType implements Internal.EnumLite {
    STORE_TYPE_UNSPECIFIED(0),
    STORE_TYPE_CUSTOM(1),
    STORE_TYPE_APPLE_APP_STORE(2),
    STORE_TYPE_GOOGLE_PLAY(3),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass$StoreType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public TransactionEventRequestOuterClass$StoreType findValueByNumber(int i) {
            return TransactionEventRequestOuterClass$StoreType.forNumber(i);
        }
    };
    private final int value;

    TransactionEventRequestOuterClass$StoreType(int i) {
        this.value = i;
    }

    public static TransactionEventRequestOuterClass$StoreType forNumber(int i) {
        if (i == 0) {
            return STORE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return STORE_TYPE_CUSTOM;
        }
        if (i == 2) {
            return STORE_TYPE_APPLE_APP_STORE;
        }
        if (i != 3) {
            return null;
        }
        return STORE_TYPE_GOOGLE_PLAY;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
