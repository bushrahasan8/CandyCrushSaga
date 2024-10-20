package com.king.usdk.localnotification;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.king.usdk.localnotification.trackingcommand.Click;
import com.king.usdk.localnotification.trackingcommand.Debug;
import com.king.usdk.localnotification.trackingcommand.Dismiss;

@Keep
/* loaded from: LocalIntentUtils.class */
public class LocalIntentUtils {
    private static final String TAG = "LocalIntentUtils";

    private LocalIntentUtils() {
    }

    public static void handleNotification(Intent intent) {
        if (!isValidIntent(intent)) {
            AndroidLogger.i(TAG, "Ignoring empty intent");
            LocalNotificationModule.addAndTryFlushNotificationTrackingEvent(new Debug(0L, "LocalIntentUtils.handleNotification", "Ignoring empty intent"));
            return;
        }
        Bundle extras = intent.getExtras();
        if (!isLocalNotification(extras)) {
            AndroidLogger.i(TAG, "Ignoring not local notification intent");
            LocalNotificationModule.addAndTryFlushNotificationTrackingEvent(new Debug(0L, "LocalIntentUtils.handleNotification", "Ignoring not local notification intent"));
        } else {
            String string = extras.getString(NotificationSchedulerKeys.KEY_TRACKING_TYPE);
            String string2 = extras.getString(NotificationSchedulerKeys.KEY_TITLE_KEY);
            LocalNotificationModule.addAndTryFlushNotificationTrackingEvent(Notifier.NOTIFICATION_DISCARDED_ACTION.equals(intent.getAction()) ? new Dismiss(string2, string) : new Click(string2, string));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.getInt(com.king.usdk.localnotification.Notifier.NOTIFICATION_KEY) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isLocalNotification(android.os.Bundle r3) {
        /*
            r0 = r3
            if (r0 == 0) goto L15
            r0 = r3
            java.lang.String r1 = "NOTIFICATION"
            int r0 = r0.getInt(r1)
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L15
            goto L17
        L15:
            r0 = 0
            r5 = r0
        L17:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.usdk.localnotification.LocalIntentUtils.isLocalNotification(android.os.Bundle):boolean");
    }

    private static boolean isValidIntent(Intent intent) {
        return (intent == null || intent.getExtras() == null) ? false : true;
    }
}
