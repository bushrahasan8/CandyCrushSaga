package com.king.usdk.localnotification;

import androidx.annotation.Keep;

@Keep
/* loaded from: NotificationScheduler.class */
public interface NotificationScheduler {
    void cancelAllNotifications();

    void scheduleLocalNotification(int i, long j, LocalNotification localNotification);
}
