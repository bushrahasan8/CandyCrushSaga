package com.unity3d.services.store.gpbl.listeners;

/* loaded from: BillingInitializationListener.class */
public interface BillingInitializationListener extends BillingClientStateListener, PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}
