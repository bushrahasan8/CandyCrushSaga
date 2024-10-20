package com.unity3d.services.core.device;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: StorageManager.class */
public class StorageManager {
    private static final Map<StorageType, String> _storageFileMap = Collections.synchronizedMap(new HashMap());
    private static final List<Storage> _storages = Collections.synchronizedList(new ArrayList());

    /* loaded from: StorageManager$StorageType.class */
    public enum StorageType {
        PRIVATE,
        PUBLIC
    }

    public static void addStorageLocation(StorageType storageType, String str) {
        synchronized (StorageManager.class) {
            try {
                Map<StorageType, String> map = _storageFileMap;
                if (!map.containsKey(storageType)) {
                    map.put(storageType, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Storage getStorage(StorageType storageType) {
        List<Storage> list = _storages;
        if (list == null) {
            return null;
        }
        synchronized (list) {
            for (Storage storage : list) {
                if (storage.getType().equals(storageType)) {
                    return storage;
                }
            }
            return null;
        }
    }

    public static boolean hasStorage(StorageType storageType) {
        List<Storage> list = _storages;
        if (list == null) {
            return false;
        }
        synchronized (list) {
            Iterator<Storage> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getType().equals(storageType)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean init(Context context) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return false;
        }
        StorageType storageType = StorageType.PUBLIC;
        addStorageLocation(storageType, filesDir + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + SdkProperties.getLocalStorageFilePrefix() + "public-data.json");
        if (!setupStorage(storageType)) {
            return false;
        }
        StorageType storageType2 = StorageType.PRIVATE;
        addStorageLocation(storageType2, filesDir + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + SdkProperties.getLocalStorageFilePrefix() + "private-data.json");
        return setupStorage(storageType2);
    }

    public static void initStorage(StorageType storageType) {
        if (hasStorage(storageType)) {
            Storage storage = getStorage(storageType);
            if (storage != null) {
                storage.initStorage();
                return;
            }
            return;
        }
        Map<StorageType, String> map = _storageFileMap;
        if (map.containsKey(storageType)) {
            Storage storage2 = new Storage(map.get(storageType), storageType);
            storage2.initStorage();
            _storages.add(storage2);
        }
    }

    public static void removeStorage(StorageType storageType) {
        synchronized (StorageManager.class) {
            try {
                if (getStorage(storageType) != null) {
                    _storages.remove(getStorage(storageType));
                }
                Map<StorageType, String> map = _storageFileMap;
                if (map != null) {
                    map.remove(storageType);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean setupStorage(StorageType storageType) {
        if (hasStorage(storageType)) {
            return true;
        }
        initStorage(storageType);
        Storage storage = getStorage(storageType);
        if (storage != null && !storage.storageFileExists()) {
            storage.writeStorage();
        }
        return storage != null;
    }
}
