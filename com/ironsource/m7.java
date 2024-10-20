package com.ironsource;

import android.util.Log;
import com.ironsource.hc;
import java.util.HashMap;
import java.util.Map;

/* loaded from: m7.class */
public class m7 {
    private static m7 b;
    private t4 a;

    private m7() {
    }

    private static m7 a() {
        if (b == null) {
            b = new m7();
        }
        return b;
    }

    public static void a(hc.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(hc.a aVar, Map<String, Object> map) {
        t4 t4Var = a().a;
        if (t4Var == null) {
            Log.d(m4.a, m4.T);
            return;
        }
        if (map != null) {
            map.put(m4.t, Integer.valueOf(aVar.b));
        }
        t4Var.a(aVar.a, map);
    }

    public static void a(o4 o4Var, k7 k7Var) {
        if (o4Var != null) {
            try {
                a().a = new t4(o4Var, k7Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
