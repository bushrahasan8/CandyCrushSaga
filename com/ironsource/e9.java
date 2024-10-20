package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.f7;
import com.ironsource.t2;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: e9.class */
public class e9 {
    private static e9 h;
    private SharedPreferences a;

    private e9(Context context) {
        this.a = context.getSharedPreferences(UnityAdsConstants.Preferences.PREF_NAME_AUID, 0);
    }

    public static e9 a(Context context) {
        e9 e9Var;
        synchronized (e9.class) {
            try {
                if (h == null) {
                    h = new e9(context);
                }
                e9Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e9Var;
    }

    private boolean b(String str) {
        return str.matches("^\\d+_\\d+$");
    }

    public static e9 e() {
        e9 e9Var;
        synchronized (e9.class) {
            try {
                e9Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e9Var;
    }

    public String a(String str) {
        String string = this.a.getString(str, null);
        return string != null ? string : "{}";
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor edit = this.a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public f7.a b() {
        int parseInt = Integer.parseInt(this.a.getString("back_button_state", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION));
        return parseInt == 0 ? f7.a.None : parseInt == 1 ? f7.a.Device : parseInt == 2 ? f7.a.Controller : f7.a.Controller;
    }

    public String c() {
        return this.a.getString("version", "-1");
    }

    public void c(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("back_button_state", str);
        edit.apply();
    }

    public List<String> d() {
        String string = this.a.getString("search_keys", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            ic icVar = new ic(string);
            if (icVar.a(t2.h.R)) {
                try {
                    arrayList.addAll(icVar.a((JSONArray) icVar.b(t2.h.R)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public void e(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("search_keys", str);
        edit.apply();
    }
}
