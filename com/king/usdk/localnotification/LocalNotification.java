package com.king.usdk.localnotification;

import androidx.annotation.Keep;

@Keep
/* loaded from: LocalNotification.class */
public class LocalNotification {
    public String backgroundPath;
    public String mediaPath;
    public String message;
    public int textColor;
    public String title;
    public String titleKey;
    public String trackingType;

    public LocalNotification() {
    }

    public LocalNotification(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.title = str;
        this.message = str2;
        this.trackingType = str3;
        this.titleKey = str4;
        this.mediaPath = str5;
        this.backgroundPath = str6;
        this.textColor = i;
    }
}
