package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.i5;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: m5.class */
public class m5 {
    public void a(Context context) {
        j5.a().c(context);
    }

    public void a(String str, i5.a aVar) {
        JSONObject optJSONObject;
        try {
            String name = aVar.name();
            j5 a = j5.a();
            JSONObject optJSONObject2 = a.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject("adunit_data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            a.b("adunit_data", optJSONObject2.put(name, optJSONObject));
        } catch (JSONException e) {
        }
    }

    public void a(String str, Object obj) {
        j5.a().b(str, obj);
    }

    public void a(String str, Object obj, i5.a aVar) {
        try {
            String name = aVar.name();
            j5 a = j5.a();
            JSONObject optJSONObject = a.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject("adunit_data");
            if (optJSONObject == null) {
                a.b("adunit_data", new JSONObject().put(name, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
            if (optJSONObject2 == null) {
                a.b("adunit_data", optJSONObject.put(name, new JSONObject().put(str, obj)));
            } else {
                a.b("adunit_data", optJSONObject.put(name, optJSONObject2.put(str, obj)));
            }
        } catch (JSONException e) {
        }
    }

    public void a(String str, JSONObject jSONObject) {
        j5.a().a(str, jSONObject);
    }

    public void a(Map<String, Object> map) {
        j5.a().a(map);
    }
}
