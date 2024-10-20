package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import java.util.List;

/* loaded from: PurchaseUpdatedResponseListener.class */
public interface PurchaseUpdatedResponseListener {
    void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list);
}
