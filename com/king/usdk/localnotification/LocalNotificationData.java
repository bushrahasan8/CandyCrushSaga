package com.king.usdk.localnotification;

import androidx.annotation.Keep;

@Keep
/* loaded from: LocalNotificationData.class */
public class LocalNotificationData {
    public String activityClassName;
    public String backgroundPath;
    public String mediaPath;
    public String message;
    public int notificationId;
    public int textColor;
    public String title;
    public String titleKey;
    public String trackingType;

    public LocalNotificationData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
        this.notificationId = i;
        this.activityClassName = str;
        this.title = str2;
        this.message = str3;
        this.trackingType = str4;
        this.titleKey = str5;
        this.mediaPath = str6;
        this.backgroundPath = str7;
        this.textColor = i2;
    }
}
