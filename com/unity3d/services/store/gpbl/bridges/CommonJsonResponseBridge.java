package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.JsonSerializable;
import com.unity3d.services.store.gpbl.IBillingResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: CommonJsonResponseBridge.class */
public abstract class CommonJsonResponseBridge extends GenericBridge implements IBillingResponse, JsonSerializable {
    private static final String getOriginalJsonMethodName = "getOriginalJson";
    private final Object _internalBridgeRef;

    /* JADX INFO: Access modifiers changed from: protected */
    public CommonJsonResponseBridge(Object obj) {
        this(obj, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CommonJsonResponseBridge(Object obj, Map<String, Class<?>[]> map) {
        super(appendCommonResponseMethods(map));
        this._internalBridgeRef = obj;
    }

    private static Map<String, Class<?>[]> appendCommonResponseMethods(Map<String, Class<?>[]> map) {
        map.putAll(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge.1
            {
                put(CommonJsonResponseBridge.getOriginalJsonMethodName, new Class[0]);
            }
        });
        return map;
    }

    @Override // com.unity3d.services.store.gpbl.IBillingResponse
    public JSONObject getOriginalJson() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject((String) callNonVoidMethod(getOriginalJsonMethodName, this._internalBridgeRef, new Object[0]));
        } catch (JSONException e) {
            DeviceLog.error("Couldn't parse BillingResponse JSON : %s", e.getMessage());
            jSONObject = null;
        }
        return jSONObject;
    }

    @Override // com.unity3d.services.store.JsonSerializable
    public JSONObject toJson() {
        return getOriginalJson();
    }
}
