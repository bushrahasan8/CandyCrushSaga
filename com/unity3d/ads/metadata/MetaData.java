package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: MetaData.class */
public class MetaData extends JsonStorage {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        String str2 = str;
        if (getCategory() != null) {
            str2 = getCategory() + "." + str;
        }
        return str2;
    }

    private boolean set(String str, int i) {
        boolean z;
        synchronized (this) {
            z = set(str, Integer.valueOf(i));
        }
        return z;
    }

    private boolean set(String str, long j) {
        boolean z;
        synchronized (this) {
            z = set(str, Long.valueOf(j));
        }
        return z;
    }

    private boolean set(String str, boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = set(str, Boolean.valueOf(z));
        }
        return z2;
    }

    public void commit() {
        if (!StorageManager.init(this._context)) {
            DeviceLog.error("Unity Ads could not commit metadata due to storage error");
            return;
        }
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        if (getData() == null || storage == null) {
            return;
        }
        Iterator<String> keys = getData().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = get(next);
            Object obj2 = obj;
            if (storage.get(next) != null) {
                obj2 = obj;
                if (storage.get(next) instanceof JSONObject) {
                    obj2 = obj;
                    if (get(next) instanceof JSONObject) {
                        try {
                            obj2 = Utilities.mergeJsonObjects((JSONObject) obj, (JSONObject) storage.get(next));
                        } catch (Exception e) {
                            DeviceLog.exception("Exception merging JSONs", e);
                            obj2 = obj;
                        }
                    }
                }
            }
            storage.set(next, obj2);
        }
        storage.writeStorage();
        storage.sendEvent(StorageEvent.SET, getData());
    }

    public String getCategory() {
        return this._category;
    }

    @Override // com.unity3d.services.core.misc.JsonStorage
    public boolean set(String str, Object obj) {
        boolean z;
        synchronized (this) {
            initData();
            if (super.set(getActualKey(str) + ".value", obj)) {
                if (super.set(getActualKey(str) + ".ts", Long.valueOf(System.currentTimeMillis()))) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setRaw(String str, Object obj) {
        boolean z;
        synchronized (this) {
            initData();
            z = super.set(getActualKey(str), obj);
        }
        return z;
    }
}
