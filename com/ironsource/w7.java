package com.ironsource;

import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: w7.class */
public interface w7 {

    /* loaded from: w7$a.class */
    public interface a {
        void a(String str);

        void b(String str);
    }

    void a(String str, String str2);

    void a(String str, String str2, String str3);

    void a(JSONObject jSONObject, String str, String str2);

    void b(JSONObject jSONObject, String str, String str2);

    void c(JSONObject jSONObject, String str, String str2) throws JSONException;

    WebView getPresentingView();
}
