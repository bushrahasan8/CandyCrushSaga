package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: i9.class */
public class i9 {
    private static Object a(Object obj) {
        Object obj2;
        if (obj instanceof JSONObject) {
            obj2 = a((JSONObject) obj);
        } else {
            obj2 = obj;
            if (obj instanceof JSONArray) {
                obj2 = a((JSONArray) obj);
            }
        }
        return obj2;
    }

    public static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(a(jSONArray.get(i)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e.getMessage()));
            }
        }
        return arrayList;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, a(jSONObject.get(next)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e.getMessage()));
            }
        }
        return hashMap;
    }

    public static JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), b(entry.getValue()));
                } catch (JSONException e) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            jSONObject.put(next, jSONObject2.get(next));
                        } catch (JSONException e) {
                            IronLog.INTERNAL.error(e.getMessage());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException e) {
            return false;
        }
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray((Collection) Arrays.asList(obj));
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            Object obj2 = obj;
            if (!(obj instanceof Boolean)) {
                obj2 = obj;
                if (!(obj instanceof Byte)) {
                    obj2 = obj;
                    if (!(obj instanceof Character)) {
                        obj2 = obj;
                        if (!(obj instanceof Double)) {
                            obj2 = obj;
                            if (!(obj instanceof Float)) {
                                obj2 = obj;
                                if (!(obj instanceof Integer)) {
                                    obj2 = obj;
                                    if (!(obj instanceof Long)) {
                                        obj2 = obj;
                                        if (!(obj instanceof Short)) {
                                            if (obj instanceof String) {
                                                obj2 = obj;
                                            } else {
                                                if (obj instanceof Enum) {
                                                    return obj.toString();
                                                }
                                                obj2 = obj;
                                                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                                                    obj2 = obj.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return obj2;
        } catch (Exception e) {
            return null;
        }
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
