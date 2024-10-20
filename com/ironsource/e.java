package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: e.class */
abstract class e {
    private final String a = "eventId";
    private final String b = "timestamp";
    private final String c = "InterstitialEvents";
    private final String d = m4.N;
    private final String e = m4.N;
    JSONObject f;
    int g;
    private String h;

    private String a(int i) {
        return i != 2 ? m4.N : "InterstitialEvents";
    }

    protected abstract String a();

    public abstract String a(ArrayList<l4> arrayList, JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(JSONArray jSONArray) {
        String str;
        if (this.f != null) {
            JSONObject jSONObject = new JSONObject(this.f.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimestamp());
            jSONObject.put(a(this.g), jSONArray);
            str = jSONObject.toString();
            return str;
        }
        str = "";
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a(l4 l4Var) {
        JSONObject jSONObject;
        try {
            jSONObject = !TextUtils.isEmpty(l4Var.a()) ? new JSONObject(l4Var.a()) : new JSONObject();
            jSONObject.put("eventId", l4Var.c());
            jSONObject.put("timestamp", l4Var.d());
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.h = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public abstract String c();
}
