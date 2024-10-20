package com.king.core.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;

@Keep
/* loaded from: UrlLauncher.class */
public class UrlLauncher {
    private static final String TAG = "com.king.core.urllauncher.UrlLauncher";

    public static boolean launchUrl(String str) {
        String str2 = TAG;
        Logging.logInfo(str2, "launchUrl " + str);
        Activity activity = ActivityHelper.getInstance().getActivity();
        if (activity != null && str != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            activity.getApplicationContext().getPackageManager();
            activity.runOnUiThread(new Runnable(activity, intent) { // from class: com.king.core.urllauncher.UrlLauncher.1
                final Activity val$activity;
                final Intent val$browserIntent;

                {
                    this.val$activity = activity;
                    this.val$browserIntent = intent;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        this.val$activity.startActivity(this.val$browserIntent);
                    } catch (ActivityNotFoundException e) {
                        Logging.logException("Failed to start activity for intent", e);
                    }
                }
            });
            return true;
        }
        Logging.logInfo(str2, "Failed to start activity for intent, activity: " + activity + " uri:" + str);
        return false;
    }
}
