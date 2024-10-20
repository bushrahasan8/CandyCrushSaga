package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import java.util.List;

/* loaded from: SkuDetailsResponseListener.class */
public interface SkuDetailsResponseListener {
    void onSkuDetailsUpdated(BillingResultBridge billingResultBridge, List<? extends SkuDetailsBridge> list);
}
