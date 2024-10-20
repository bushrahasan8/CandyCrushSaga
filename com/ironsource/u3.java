package com.ironsource;

import android.text.TextUtils;
import com.ironsource.f7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: u3.class */
public class u3 {
    private final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();

    private void a(f7.e eVar, String str, t3 t3Var) {
        Map b;
        if (TextUtils.isEmpty(str) || t3Var == null || (b = b(eVar)) == null) {
            return;
        }
        b.put(str, t3Var);
    }

    private Map b(f7.e eVar) {
        if (eVar.name().equalsIgnoreCase(f7.e.RewardedVideo.name())) {
            return this.a;
        }
        if (eVar.name().equalsIgnoreCase(f7.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(f7.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public t3 a(f7.e eVar, q8 q8Var) {
        t3 t3Var = new t3(q8Var);
        a(eVar, q8Var.d(), t3Var);
        return t3Var;
    }

    public t3 a(f7.e eVar, String str) {
        Map b;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null) {
            return null;
        }
        return (t3) b.get(str);
    }

    public t3 a(f7.e eVar, String str, Map<String, String> map, wa waVar) {
        t3 t3Var = new t3(str, str, map, waVar);
        a(eVar, str, t3Var);
        return t3Var;
    }

    public Collection<t3> a(f7.e eVar) {
        Map b = b(eVar);
        return b != null ? b.values() : new ArrayList();
    }

    public void b(f7.e eVar, String str) {
        Map b;
        t3 t3Var;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null || (t3Var = (t3) b.remove(str)) == null) {
            return;
        }
        t3Var.a();
    }
}
