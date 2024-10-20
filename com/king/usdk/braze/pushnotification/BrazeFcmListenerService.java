package com.king.usdk.braze.pushnotification;

import android.content.Context;
import androidx.annotation.Keep;
import com.braze.push.BrazeFirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.king.usdk.braze.AndroidLogger;

@Keep
/* loaded from: BrazeFcmListenerService.class */
public class BrazeFcmListenerService extends BrazeFirebaseMessagingService {
    private static final String TAG = "BrazeFcmListenerService";

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String str = TAG;
        AndroidLogger.d(str, "onMessageReceived: RemoteMessage received");
        Context applicationContext = getApplicationContext();
        if (!BrazeFirebaseMessagingService.isBrazePushNotification(remoteMessage)) {
            AndroidLogger.i(str, "handleMessageReceived: Ignoring RemoteMessage not originated by Braze.");
        } else if (BrazeFirebaseMessagingService.handleBrazeRemoteMessage(applicationContext, remoteMessage)) {
            AndroidLogger.d(str, "handleMessageReceived: Braze notification processed");
        } else {
            AndroidLogger.i(str, "handleMessageReceived: Braze notification NOT processed");
        }
    }

    public void onNewToken(String str) {
        super.onNewToken(str);
    }
}
