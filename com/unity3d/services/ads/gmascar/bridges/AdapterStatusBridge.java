package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.HashMap;

/* loaded from: AdapterStatusBridge.class */
public class AdapterStatusBridge extends GenericBridge {
    private static final String initializeStateMethodName = "getInitializationState";
    private Class _adapterStateClass;

    public AdapterStatusBridge() {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge.1
            {
                put(AdapterStatusBridge.initializeStateMethodName, new Class[0]);
            }
        });
        AdapterStatusStateBridge adapterStatusStateBridge = new AdapterStatusStateBridge();
        try {
            this._adapterStateClass = Class.forName(adapterStatusStateBridge.getClassName());
        } catch (ClassNotFoundException e) {
            DeviceLog.debug("ERROR: Could not find class %s %s", adapterStatusStateBridge.getClassName(), e.getLocalizedMessage());
        }
    }

    public Object[] getAdapterStatesEnum() {
        return this._adapterStateClass.getEnumConstants();
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    public boolean isGMAInitialized(Object obj) {
        Object[] adapterStatesEnum = getAdapterStatesEnum();
        boolean z = false;
        if (adapterStatesEnum == null) {
            DeviceLog.debug("ERROR: Could not get adapter states enum from AdapterStatus.State");
            return false;
        }
        if (callNonVoidMethod(initializeStateMethodName, obj, new Object[0]) == adapterStatesEnum[1]) {
            z = true;
        }
        return z;
    }
}
