package com.king.usdk.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;

@Keep
/* loaded from: UrlLauncher.class */
public class UrlLauncher {
    private static final String TAG = "com.king.usdk.urllauncher.UrlLauncher";

    public static boolean launchUrl(Activity activity, String str) {
        String str2 = TAG;
        Log.i(str2, "launchUrl " + str);
        if (activity != null && str != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            activity.getApplicationContext().getPackageManager();
            activity.runOnUiThread(new Runnable(activity, intent) { // from class: com.king.usdk.urllauncher.UrlLauncher.1
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
                        Log.e(UrlLauncher.TAG, "Failed to start activity for intent", e);
                    }
                }
            });
            return true;
        }
        Log.i(str2, "Failed to start activity for intent, activity: " + activity + " url:" + str);
        return false;
    }
}
