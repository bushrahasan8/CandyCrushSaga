package com.unity3d.services.core.misc;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: JsonStorage.class */
public class JsonStorage implements IJsonStorageReader {
    private JSONObject _data;

    private void createObjectTree(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            String[] split = str.split("\\.");
            JSONObject jSONObject2 = this._data;
            if (str.length() == 0) {
                return;
            }
            int i = 0;
            while (i < split.length) {
                if (jSONObject2.has(split[i])) {
                    try {
                        jSONObject = jSONObject2.getJSONObject(split[i]);
                    } catch (Exception e) {
                        DeviceLog.exception("Couldn't get existing JSONObject", e);
                        jSONObject = jSONObject2;
                    }
                    i++;
                    jSONObject2 = jSONObject;
                } else {
                    String str2 = split[i];
                    jSONObject = jSONObject2;
                    try {
                        JSONObject jSONObject3 = jSONObject2;
                        JSONObject jSONObject4 = jSONObject2;
                        jSONObject = jSONObject2.put(str2, new JSONObject()).getJSONObject(split[i]);
                    } catch (Exception e2) {
                        DeviceLog.exception("Couldn't create new JSONObject", e2);
                    }
                    i++;
                    jSONObject2 = jSONObject;
                }
            }
        }
    }

    private Object findObject(String str) {
        synchronized (this) {
            String[] split = str.split("\\.");
            JSONObject jSONObject = this._data;
            if (str.length() == 0) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject;
            for (int i = 0; i < split.length; i++) {
                if (!jSONObject2.has(split[i])) {
                    return null;
                }
                try {
                    jSONObject2 = jSONObject2.getJSONObject(split[i]);
                } catch (Exception e) {
                    DeviceLog.exception("Couldn't read JSONObject: " + split[i], e);
                    return null;
                }
            }
            return jSONObject2;
        }
    }

    private String getParentObjectTreeFor(String str) {
        String join;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.split("\\.")));
            arrayList.remove(arrayList.size() - 1);
            join = TextUtils.join(".", arrayList.toArray());
        }
        return join;
    }

    public void clearData() {
        synchronized (this) {
            this._data = null;
        }
    }

    public boolean delete(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            if (this._data == null) {
                DeviceLog.error("Data is NULL, readStorage probably not called");
                return false;
            }
            String[] split = str.split("\\.");
            return (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject) || (jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str))) == null || jSONObject.remove(split[split.length - 1]) == null) ? false : true;
        }
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public Object get(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            if (this._data == null) {
                DeviceLog.error("Data is NULL, readStorage probably not called");
                return null;
            }
            String[] split = str.split("\\.");
            if (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject) || (jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str))) == null) {
                return null;
            }
            Object obj = null;
            try {
                if (jSONObject.has(split[split.length - 1])) {
                    obj = jSONObject.get(split[split.length - 1]);
                }
            } catch (Exception e) {
                DeviceLog.exception("Error getting data", e);
                obj = null;
            }
            return obj;
        }
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public JSONObject getData() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this._data;
        }
        return jSONObject;
    }

    public List<String> getKeys(String str, boolean z) {
        List<String> list;
        synchronized (this) {
            if (!(get(str) instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) get(str);
            ArrayList arrayList = new ArrayList();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (z) {
                        list = getKeys(str + "." + next, z);
                    } else {
                        list = null;
                    }
                    arrayList.add(next);
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(next + "." + it.next());
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public boolean hasData() {
        synchronized (this) {
            JSONObject jSONObject = this._data;
            if (jSONObject != null) {
                if (jSONObject.length() > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean initData() {
        synchronized (this) {
            if (this._data != null) {
                return false;
            }
            this._data = new JSONObject();
            return true;
        }
    }

    public boolean set(String str, Object obj) {
        synchronized (this) {
            if (this._data == null || str == null || str.length() == 0 || obj == null) {
                DeviceLog.error("Storage not properly initialized or incorrect parameters:" + this._data + ", " + str + ", " + obj);
                return false;
            }
            createObjectTree(getParentObjectTreeFor(str));
            if (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject)) {
                DeviceLog.debug("Cannot set subvalue to an object that is not JSONObject");
                return false;
            }
            JSONObject jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str));
            String[] split = str.split("\\.");
            if (jSONObject != null) {
                try {
                    jSONObject.put(split[split.length - 1], obj);
                } catch (JSONException e) {
                    DeviceLog.exception("Couldn't set value", e);
                    return false;
                }
            }
            return true;
        }
    }

    public void setData(JSONObject jSONObject) {
        synchronized (this) {
            this._data = jSONObject;
        }
    }
}
