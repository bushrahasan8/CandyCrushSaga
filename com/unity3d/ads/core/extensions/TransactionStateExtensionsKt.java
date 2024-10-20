package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionState;

/* loaded from: TransactionStateExtensionsKt.class */
public final class TransactionStateExtensionsKt {
    public static final TransactionEventRequestOuterClass$TransactionState fromPurchaseState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? TransactionEventRequestOuterClass$TransactionState.UNRECOGNIZED : TransactionEventRequestOuterClass$TransactionState.TRANSACTION_STATE_PENDING : TransactionEventRequestOuterClass$TransactionState.TRANSACTION_STATE_UNSPECIFIED : TransactionEventRequestOuterClass$TransactionState.TRANSACTION_STATE_PURCHASED;
    }
}
