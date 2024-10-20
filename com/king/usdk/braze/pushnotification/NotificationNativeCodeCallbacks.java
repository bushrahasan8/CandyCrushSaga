package com.king.usdk.braze.pushnotification;

import androidx.annotation.Keep;

@Keep
/* loaded from: NotificationNativeCodeCallbacks.class */
public class NotificationNativeCodeCallbacks {
    public static native void onPromotionDebugLog(long j, long j2, String str, String str2);

    public static native void onPushNotificationClicked(long j, String str, String str2, String str3);

    public static native void onPushNotificationDiscarded(long j, String str, String str2, String str3);

    public static native void onPushNotificationReceived(long j, String str, String str2, String str3);
}
