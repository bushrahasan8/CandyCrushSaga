package com.king.usdk.braze.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.king.usdk.braze.AndroidLogger;

@Keep
/* loaded from: BrazeNotificationBroadcastReceiver.class */
public class BrazeNotificationBroadcastReceiver extends BroadcastReceiver {
    private static final String BRAZE_TRACKING_TYPE = "braze";
    private static final String CID_FIELD = "cid";
    private static final String TAG = "BrazeNotificationBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            AndroidLogger.e(TAG, "Received invalid Intent with no extras! Ignoring");
            return;
        }
        String string = extras.getString(CID_FIELD);
        if (string == null) {
            AndroidLogger.e(TAG, "Unexpected braze broadcast about push without CID! Ignoring");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            AndroidLogger.e(TAG, "Braze intent without action! Ignoring");
            return;
        }
        AndroidLogger.d(TAG, "Intent received: " + action);
        boolean z = -1;
        switch (action.hashCode()) {
            case -1725311072:
                if (action.equals("com.braze.push.intent.NOTIFICATION_OPENED")) {
                    z = false;
                    break;
                }
                break;
            case -471137448:
                if (action.equals("com.braze.push.intent.NOTIFICATION_RECEIVED")) {
                    z = true;
                    break;
                }
                break;
            case 868616098:
                if (action.equals("com.braze.push.intent.NOTIFICATION_DELETED")) {
                    z = 2;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                PushIntentHelpers.reportPushNotificationClicked(BRAZE_TRACKING_TYPE, string, extras);
                return;
            case true:
                PushIntentHelpers.reportPushNotificationReceived(BRAZE_TRACKING_TYPE, string, extras);
                return;
            case true:
                PushIntentHelpers.reportPushNotificationDismissed(BRAZE_TRACKING_TYPE, string, extras);
                return;
            default:
                return;
        }
    }
}
