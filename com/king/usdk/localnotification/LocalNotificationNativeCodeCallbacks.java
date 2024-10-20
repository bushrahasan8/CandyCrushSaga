package com.king.usdk.localnotification;

import androidx.annotation.Keep;

@Keep
/* loaded from: LocalNotificationNativeCodeCallbacks.class */
public class LocalNotificationNativeCodeCallbacks {
    public static native void onLocalNotificationClicked(long j, String str, String str2);

    public static native void onLocalNotificationDiscarded(long j, String str, String str2);

    public static native void onPromotionDebugLog(long j, long j2, String str, String str2);
}
