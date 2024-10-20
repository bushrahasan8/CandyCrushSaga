package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: ea.class */
public class ea {
    private String a;

    public ea(String str) {
        this.a = str;
    }

    private o7 a() {
        o7 o7Var = new o7(this.a, "metadata.json");
        if (!o7Var.exists()) {
            a(o7Var);
        }
        return o7Var;
    }

    private void a(o7 o7Var) {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), o7Var.getPath());
    }

    private boolean a(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        synchronized (this) {
            JSONObject b = b();
            if (!b.has(str)) {
                return true;
            }
            b.remove(str);
            return a(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str, JSONObject jSONObject) {
        boolean a;
        synchronized (this) {
            JSONObject b = b();
            b.put(str, jSONObject);
            a = a(b);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(((o7) it.next()).getName())) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject b() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = new JSONObject(IronSourceStorageUtils.readFile(a()));
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(String str, JSONObject jSONObject) {
        boolean a;
        synchronized (this) {
            JSONObject b = b();
            JSONObject optJSONObject = b.optJSONObject(str);
            if (optJSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    optJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                b.putOpt(str, jSONObject);
            }
            a = a(b);
        }
        return a;
    }
}
