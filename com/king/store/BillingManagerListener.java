package com.king.store;

import com.android.billingclient.api.BillingResult;
import java.util.List;

/* loaded from: BillingManagerListener.class */
public interface BillingManagerListener {
    void onBillingAcknowledgeResponse(BillingResult billingResult);

    void onBillingConsumeResponse(BillingResult billingResult, String str);

    void onBillingPurchasesUpdated(BillingResult billingResult, List list);

    void onBillingQueryPurchasesFinished(BillingResult billingResult, List list);

    void onBillingQuerySkuDetailsFinished(BillingResult billingResult, List list);

    void onBillingSetupFinished(BillingResult billingResult);
}
