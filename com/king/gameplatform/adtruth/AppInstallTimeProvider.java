package com.king.gameplatform.adtruth;

import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;

@Keep
/* loaded from: AppInstallTimeProvider.class */
public class AppInstallTimeProvider {
    private static final String TAG = "AppInstallTimeProvider";
    private static final String appInstallTimeProviderMeta = "com.king.gameplatform.adtruth.AppInstallTimeProvider";

    public static long getInstallTimeMsts() {
        try {
            return ActivityHelper.getInstance().getActivity().getPackageManager().getPackageInfo(ActivityHelper.getInstance().getActivity().getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            return 0L;
        }
    }

    public static long getUpdateTimeMsts() {
        try {
            return ActivityHelper.getInstance().getActivity().getPackageManager().getPackageInfo(ActivityHelper.getInstance().getActivity().getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            return 0L;
        }
    }
}
