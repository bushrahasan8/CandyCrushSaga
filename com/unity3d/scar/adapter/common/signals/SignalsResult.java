package com.unity3d.scar.adapter.common.signals;

import java.util.HashMap;
import java.util.Map;

/* loaded from: SignalsResult.class */
public class SignalsResult {
    private Map _signalsMap = new HashMap();
    private String _errorMessage = null;

    public void addToSignalsMap(String str, String str2) {
        this._signalsMap.put(str, str2);
    }

    public String getErrorMessage() {
        return this._errorMessage;
    }

    public Map getSignalsMap() {
        return this._signalsMap;
    }

    public void setErrorMessage(String str) {
        this._errorMessage = str;
    }
}
