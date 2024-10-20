package com.king.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.annotation.Keep;
import com.google.android.gms.drive.ExecutionOptions;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;

@Keep
/* loaded from: Messaging.class */
public class Messaging {
    private static final String TAG = "Messaging";

    private Messaging() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isSmsAvailable() {
        PackageManager packageManager = ActivityHelper.getInstance().getActivity().getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        Logging.logInfo(TAG, String.format("Found %d SMS apps", Integer.valueOf(packageManager.queryIntentActivities(intent, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH).size())));
        return !r0.isEmpty();
    }

    public static void sendSMS(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        intent.putExtra("sms_body", str);
        ActivityHelper.getInstance().getActivity().startActivity(intent);
        Logging.logInfo(TAG, String.format("SMS opened with '%s'", str));
    }
}
