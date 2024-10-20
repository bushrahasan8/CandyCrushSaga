package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ic.class */
public class ic {
    private JSONObject a;

    public ic() {
        this.a = new JSONObject();
    }

    public ic(String str) {
        f(str);
    }

    private Object a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        Object obj2 = obj;
        if (obj instanceof JSONArray) {
            obj2 = a((JSONArray) obj);
        }
        return obj2;
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public static Object b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObject.put(obj2.toString(), b(map.get(obj2)));
            }
        }
        return jSONObject;
    }

    private Map b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }

    private void f(String str) {
        try {
            this.a = new JSONObject(str);
        } catch (Exception e) {
            this.a = new JSONObject();
        }
    }

    public int a(String str, int i) {
        return this.a.optInt(str, i);
    }

    public String a(String str, String str2) {
        return this.a.optString(str, str2);
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public JSONObject a() {
        return this.a;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.a.put(str, jSONObject);
        } catch (Exception e) {
        }
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e) {
            return null;
        }
    }

    public void b(String str, String str2) {
        try {
            this.a.put(str, str2);
        } catch (Exception e) {
        }
    }

    public boolean c(String str) {
        try {
            return this.a.getBoolean(str);
        } catch (JSONException e) {
            return false;
        }
    }

    public String d(String str) {
        try {
            return this.a.getString(str);
        } catch (JSONException e) {
            return null;
        }
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.a;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
