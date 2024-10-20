package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: TransactionEventRepository.class */
public interface TransactionEventRepository {
    void addTransactionEvent(TransactionEventRequestOuterClass$TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest);

    SharedFlow getTransactionEvents();
}
