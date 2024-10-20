package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.IJsonStorageReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: DeviceInfoReaderFilterProvider.class */
public class DeviceInfoReaderFilterProvider {
    private static final String FILTER_EXCLUDE_KEY = "exclude";
    private static final String UNIFIED_CONFIG_KEY = "unifiedconfig";
    private IJsonStorageReader _storage;

    public DeviceInfoReaderFilterProvider(IJsonStorageReader iJsonStorageReader) {
        this._storage = iJsonStorageReader;
    }

    private List<String> trimWhiteSpaces(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trim());
        }
        return arrayList;
    }

    public List<String> getFilterList() {
        ArrayList arrayList = new ArrayList();
        IJsonStorageReader iJsonStorageReader = this._storage;
        List<String> list = arrayList;
        if (iJsonStorageReader != null) {
            list = arrayList;
            if (iJsonStorageReader.getData() != null) {
                Object opt = this._storage.getData().opt("unifiedconfig");
                list = arrayList;
                if (opt != null) {
                    list = arrayList;
                    if (opt instanceof JSONObject) {
                        Object opt2 = ((JSONObject) opt).opt(FILTER_EXCLUDE_KEY);
                        list = arrayList;
                        if (opt2 instanceof String) {
                            list = trimWhiteSpaces(Arrays.asList(((String) opt2).split(",")));
                        }
                    }
                }
            }
        }
        return list;
    }
}
