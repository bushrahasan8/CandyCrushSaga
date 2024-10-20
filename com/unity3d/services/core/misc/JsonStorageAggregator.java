package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: JsonStorageAggregator.class */
public class JsonStorageAggregator implements IJsonStorageReader {
    private final List<IJsonStorageReader> _jsonStorageReaders;

    public JsonStorageAggregator(List<IJsonStorageReader> list) {
        this._jsonStorageReaders = list;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public Object get(String str) {
        Object obj;
        Iterator<IJsonStorageReader> it = this._jsonStorageReaders.iterator();
        Object obj2 = null;
        while (true) {
            obj = obj2;
            if (!it.hasNext()) {
                break;
            }
            IJsonStorageReader next = it.next();
            if (next != null) {
                obj = next.get(str);
                obj2 = obj;
                if (obj != null) {
                    break;
                }
            }
        }
        return obj;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public JSONObject getData() {
        JSONObject jSONObject = new JSONObject();
        Iterator<IJsonStorageReader> it = this._jsonStorageReaders.iterator();
        while (true) {
            JSONObject jSONObject2 = jSONObject;
            if (!it.hasNext()) {
                return jSONObject2;
            }
            IJsonStorageReader next = it.next();
            jSONObject = jSONObject2;
            if (next != null) {
                try {
                    jSONObject = Utilities.mergeJsonObjects(jSONObject2, next.getData());
                } catch (JSONException e) {
                    DeviceLog.error("Failed to merge storage: " + next);
                    jSONObject = jSONObject2;
                }
            }
        }
    }
}
