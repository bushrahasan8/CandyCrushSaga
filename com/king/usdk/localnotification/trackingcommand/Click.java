package com.king.usdk.localnotification.trackingcommand;

import androidx.annotation.Keep;
import com.king.usdk.localnotification.LocalNotificationNativeCodeCallbacks;

@Keep
/* loaded from: Click.class */
public class Click implements NotificationTrackingCommand {
    private final String titleKey;
    private final String trackingType;

    public Click(String str, String str2) {
        this.titleKey = str;
        this.trackingType = str2;
    }

    @Override // com.king.usdk.localnotification.trackingcommand.NotificationTrackingCommand
    public void run(long j) {
        LocalNotificationNativeCodeCallbacks.onLocalNotificationClicked(j, this.trackingType, this.titleKey);
    }
}
