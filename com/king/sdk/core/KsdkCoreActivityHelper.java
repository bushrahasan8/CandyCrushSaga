package com.king.sdk.core;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;

@Keep
/* loaded from: KsdkCoreActivityHelper.class */
public class KsdkCoreActivityHelper {
    private static final KsdkCoreActivityHelper instance = new KsdkCoreActivityHelper();
    private Activity activity = null;

    public static KsdkCoreActivityHelper getInstance() {
        return instance;
    }

    public void deinit() {
        this.activity = null;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public Context getApplicationContext() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return null;
    }

    public void init(Activity activity) {
        this.activity = activity;
    }
}
