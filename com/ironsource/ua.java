package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: ua.class */
public class ua {
    private ArrayList a = new ArrayList();
    private va b;
    private r0 c;
    private JSONObject d;

    public ua(r0 r0Var) {
        this.c = r0Var;
    }

    public va a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            va vaVar = (va) it.next();
            if (vaVar.isDefault()) {
                return vaVar;
            }
        }
        return this.b;
    }

    public va a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            va vaVar = (va) it.next();
            if (vaVar.getPlacementName().equals(str)) {
                return vaVar;
            }
        }
        return null;
    }

    public void a(va vaVar) {
        if (vaVar != null) {
            this.a.add(vaVar);
            if (this.b == null || vaVar.isPlacementId(0)) {
                this.b = vaVar;
            }
        }
    }

    public void a(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public String b() {
        JSONObject jSONObject = this.d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.d.optString("adapterName");
    }

    public r0 c() {
        return this.c;
    }
}
