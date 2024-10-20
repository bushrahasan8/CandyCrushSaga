package com.king.gameplatform.adtruth;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;

@Keep
/* loaded from: DistributionId.class */
public class DistributionId {
    private static final String TAG = "DistributionId";
    private static final String districutionIdMeta = "com.king.gameplatform.adtruth.DistributionId";

    public static String getDistributionId() {
        try {
            Activity activity = ActivityHelper.getInstance().getActivity();
            Bundle bundle = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData;
            String str = districutionIdMeta;
            String string = bundle.getString(str);
            Logging.logInfo(TAG, "Distribution Id found at " + str + ": " + string);
            return string;
        } catch (PackageManager.NameNotFoundException e) {
            Logging.logInfo(TAG, "Failed to load meta-data, NameNotFound: " + e.getMessage());
            return null;
        } catch (NullPointerException e2) {
            Logging.logInfo(TAG, "Failed to load meta-data, NullPointer: " + e2.getMessage());
            return null;
        }
    }
}
