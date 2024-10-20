package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: ib.class */
class ib extends e {
    private final String i = nb.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ib(int i) {
        this.g = i;
    }

    @Override // com.ironsource.e
    public String a() {
        return nb.a;
    }

    @Override // com.ironsource.e
    public String a(ArrayList<l4> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        }
        this.f = jSONObject2;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<l4> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject a = a(it.next());
                if (a != null) {
                    jSONArray.put(a);
                }
            }
        }
        return a(jSONArray);
    }

    @Override // com.ironsource.e
    public String c() {
        return "outcome";
    }
}
