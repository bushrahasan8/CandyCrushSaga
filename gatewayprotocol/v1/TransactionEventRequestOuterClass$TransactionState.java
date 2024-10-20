package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: TransactionEventRequestOuterClass$TransactionState.class */
public enum TransactionEventRequestOuterClass$TransactionState implements Internal.EnumLite {
    TRANSACTION_STATE_UNSPECIFIED(0),
    TRANSACTION_STATE_PENDING(1),
    TRANSACTION_STATE_PURCHASED(2),
    TRANSACTION_STATE_FAILED(3),
    TRANSACTION_STATE_RESTORED(4),
    TRANSACTION_STATE_DEFERRED(5),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionState.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public TransactionEventRequestOuterClass$TransactionState findValueByNumber(int i) {
            return TransactionEventRequestOuterClass$TransactionState.forNumber(i);
        }
    };
    private final int value;

    TransactionEventRequestOuterClass$TransactionState(int i) {
        this.value = i;
    }

    public static TransactionEventRequestOuterClass$TransactionState forNumber(int i) {
        if (i == 0) {
            return TRANSACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return TRANSACTION_STATE_PENDING;
        }
        if (i == 2) {
            return TRANSACTION_STATE_PURCHASED;
        }
        if (i == 3) {
            return TRANSACTION_STATE_FAILED;
        }
        if (i == 4) {
            return TRANSACTION_STATE_RESTORED;
        }
        if (i != 5) {
            return null;
        }
        return TRANSACTION_STATE_DEFERRED;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
