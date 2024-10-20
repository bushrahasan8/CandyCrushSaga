package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;

/* loaded from: StoreExceptionHandler.class */
public interface StoreExceptionHandler {
    void handleStoreException(StoreEvent storeEvent, int i, Exception exc);
}
