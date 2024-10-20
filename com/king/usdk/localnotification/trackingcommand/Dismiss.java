package com.king.usdk.localnotification.trackingcommand;

import androidx.annotation.Keep;
import com.king.usdk.localnotification.LocalNotificationNativeCodeCallbacks;

@Keep
/* loaded from: Dismiss.class */
public class Dismiss implements NotificationTrackingCommand {
    private final String titleKey;
    private final String trackingType;

    public Dismiss(String str, String str2) {
        this.titleKey = str;
        this.trackingType = str2;
    }

    @Override // com.king.usdk.localnotification.trackingcommand.NotificationTrackingCommand
    public void run(long j) {
        LocalNotificationNativeCodeCallbacks.onLocalNotificationDiscarded(j, this.trackingType, this.titleKey);
    }
}
