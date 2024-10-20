package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: u7.class */
public interface u7 {

    /* loaded from: u7$a.class */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(s7 s7Var);

        void onNativeAdShown();
    }

    a a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(v7 v7Var);

    s7 b();

    void destroy();
}
