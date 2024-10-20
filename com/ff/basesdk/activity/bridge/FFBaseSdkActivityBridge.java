package com.ff.basesdk.activity.bridge;

import android.app.Activity;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.sdk.core.KsdkCoreActivityHelper;

@Keep
/* loaded from: FFBaseSdkActivityBridge.class */
public class FFBaseSdkActivityBridge {
    public static void init() {
        Activity activity = ActivityHelper.getInstance().getActivity();
        if (activity != null) {
            KsdkCoreActivityHelper.getInstance().init(activity);
        }
    }
}
