package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionData;
import gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: GetTransactionRequest.class */
public interface GetTransactionRequest {
    Object invoke(List<TransactionEventRequestOuterClass$TransactionData> list, Continuation<? super TransactionEventRequestOuterClass$TransactionEventRequest> continuation);
}
