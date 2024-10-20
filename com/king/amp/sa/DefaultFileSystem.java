package com.king.amp.sa;

import android.app.Activity;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;

@Keep
/* loaded from: DefaultFileSystem.class */
public class DefaultFileSystem {
    private static Activity sActivity;

    public static String getDefaultAppDirectory() {
        return sActivity.getDir("abm", 0).getAbsolutePath() + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
    }

    public static void setActivity(Activity activity) {
        sActivity = activity;
    }
}
