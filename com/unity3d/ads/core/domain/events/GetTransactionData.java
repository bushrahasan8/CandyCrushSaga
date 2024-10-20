package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionData;

/* loaded from: GetTransactionData.class */
public interface GetTransactionData {
    TransactionEventRequestOuterClass$TransactionData invoke(PurchaseBridge purchaseBridge, SkuDetailsBridge skuDetailsBridge);
}
