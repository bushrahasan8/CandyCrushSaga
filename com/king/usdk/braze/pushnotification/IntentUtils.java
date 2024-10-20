package com.king.usdk.braze.pushnotification;

import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.Keep;
import com.king.usdk.braze.AndroidLogger;
import java.util.List;

@Keep
/* loaded from: IntentUtils.class */
public class IntentUtils {
    private static final String TAG = "IntentUtils";

    private IntentUtils() {
    }

    public static boolean applicationInForeground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        boolean z = false;
        if (runningAppProcesses != null) {
            z = false;
            if (!runningAppProcesses.isEmpty()) {
                z = false;
                if (runningAppProcesses.get(0).processName.equalsIgnoreCase(context.getPackageName())) {
                    z = false;
                    if (runningAppProcesses.get(0).importance == 100) {
                        z = true;
                    }
                }
            }
        }
        AndroidLogger.d(TAG, "applicationInForeground: " + z);
        return z;
    }
}
