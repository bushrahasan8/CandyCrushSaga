package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.bb;
import com.ironsource.da;
import com.ironsource.f7;
import com.ironsource.h3;
import com.ironsource.i3;
import com.ironsource.j3;
import com.ironsource.sdk.controller.f;
import com.ironsource.t3;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: l.class */
public interface l {

    /* loaded from: l$a.class */
    public interface a {
        void a(f.a aVar);
    }

    /* loaded from: l$b.class */
    public interface b {
        void a(da daVar);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(f.c cVar, a aVar);

    void a(t3 t3Var);

    void a(t3 t3Var, Map<String, String> map, h3 h3Var);

    void a(t3 t3Var, Map<String, String> map, i3 i3Var);

    void a(String str, i3 i3Var);

    void a(String str, String str2, bb bbVar);

    void a(String str, String str2, t3 t3Var, h3 h3Var);

    void a(String str, String str2, t3 t3Var, i3 i3Var);

    void a(String str, String str2, t3 t3Var, j3 j3Var);

    void a(String str, String str2, Map<String, String> map, bb bbVar);

    void a(Map<String, String> map, bb bbVar);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, h3 h3Var);

    void a(JSONObject jSONObject, i3 i3Var);

    void a(JSONObject jSONObject, j3 j3Var);

    boolean a(String str);

    void b(Context context);

    void b(t3 t3Var);

    void b(t3 t3Var, Map<String, String> map, i3 i3Var);

    void b(JSONObject jSONObject);

    void d();

    void destroy();

    @Deprecated
    void e();

    void f();

    f7.c g();
}
