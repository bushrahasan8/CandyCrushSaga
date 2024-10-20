package com.unity3d.scar.adapter.common.signals;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: SignalsStorage.class */
public class SignalsStorage {
    private final Map _queryInfoMap = new ConcurrentHashMap();

    public Object getQueryInfo(String str) {
        return this._queryInfoMap.get(str);
    }

    public void put(String str, Object obj) {
        this._queryInfoMap.put(str, obj);
    }
}
