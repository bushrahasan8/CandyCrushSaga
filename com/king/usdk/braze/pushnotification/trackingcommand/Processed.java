package com.king.usdk.braze.pushnotification.trackingcommand;

import androidx.annotation.Keep;
import com.king.usdk.braze.pushnotification.NotificationNativeCodeCallbacks;

@Keep
/* loaded from: Processed.class */
public class Processed implements NotificationTrackingCommand {
    private final String messageId;
    private final String payload;
    private final String trackingType;

    public Processed(String str, String str2, String str3) {
        this.messageId = str;
        this.trackingType = str2;
        this.payload = str3;
    }

    @Override // com.king.usdk.braze.pushnotification.trackingcommand.NotificationTrackingCommand
    public void run(long j) {
        NotificationNativeCodeCallbacks.onPushNotificationReceived(j, this.messageId, this.trackingType, this.payload);
    }
}
