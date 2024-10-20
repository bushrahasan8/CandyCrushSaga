package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.i5;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: k5.class */
public class k5 {
    private JSONObject a(Context context, i5.a aVar) {
        String name = aVar.name();
        JSONObject b = j5.a().b(context);
        JSONObject optJSONObject = b.optJSONObject("adunit_data");
        JSONObject a = a(b);
        if (optJSONObject != null && optJSONObject.optJSONObject(name) != null) {
            JSONObject jSONObject = optJSONObject.getJSONObject(name);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a.putOpt(next, jSONObject.opt(next));
            }
        }
        return a;
    }

    private JSONObject a(Context context, List list) {
        return a(a(j5.a().b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    private JSONObject a(JSONObject jSONObject) {
        jSONObject.remove("adunit_data");
        return jSONObject;
    }

    private JSONObject a(JSONObject jSONObject, String[] strArr) {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    public JSONObject a(Context context, String[] strArr) throws JSONException {
        return a(a(j5.a().b(context)), strArr);
    }

    public JSONObject a(List<String> list) throws JSONException {
        return a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    public JSONObject a(List<String> list, i5.a aVar) throws JSONException {
        return a(a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    public JSONObject a(String[] strArr) throws JSONException {
        return a(a(j5.a().b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }
}
