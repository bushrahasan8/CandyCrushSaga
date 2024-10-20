package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* loaded from: PresenceDetector.class */
public class PresenceDetector {
    private AdapterStatusBridge _adapterStatusBridge;
    private InitializeListenerBridge _initializationListenerBridge;
    private InitializationStatusBridge _initializationStatusBridge;
    private MobileAdsBridgeBase _mobileAdsBridge;

    public PresenceDetector(MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge) {
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._initializationListenerBridge = initializeListenerBridge;
        this._initializationStatusBridge = initializationStatusBridge;
        this._adapterStatusBridge = adapterStatusBridge;
    }

    public boolean areGMAClassesPresent() {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        boolean z = false;
        if (mobileAdsBridgeBase != null) {
            z = false;
            if (this._initializationListenerBridge != null) {
                z = false;
                if (this._initializationStatusBridge != null) {
                    if (this._adapterStatusBridge == null) {
                        z = false;
                    } else {
                        z = false;
                        if (mobileAdsBridgeBase.exists()) {
                            z = false;
                            if (this._initializationListenerBridge.exists()) {
                                z = false;
                                if (this._initializationStatusBridge.exists()) {
                                    z = false;
                                    if (this._adapterStatusBridge.exists()) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
