package com.king.usdk.adinfo;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;

@Keep
/* loaded from: AppInstallTimeProvider.class */
public class AppInstallTimeProvider {
    private static final String TAG = "AppInstallTimeProvider";
    private static final String appInstallTimeProviderMeta = "com.king.usdk.adinfo.AppInstallTimeProvider";

    public static long getInstallTimeMsts(Activity activity) {
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            return 0L;
        }
    }

    public static long getUpdateTimeMsts(Activity activity) {
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            return 0L;
        }
    }
}
